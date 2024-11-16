package org.farhan.mbt.service;

import java.io.File;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import org.farhan.mbt.core.FileAccessor;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class H2ModelRepository implements FileAccessor {

	private JdbcTemplate jdbcTemplate;

	public H2ModelRepository(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	private ModelSourceFile mapRowToModelSourceFile(ResultSet row, int rowNum) throws SQLException {
		return new ModelSourceFile(row.getString("file_name"), row.getString("file_content"));
	}

	@Override
	public ArrayList<File> recursivelyListFiles(File aDir, String extension) {
		// TODO probably don't need references to File for DB code? Change the interface
		// to pass Strings
		ArrayList<File> files = new ArrayList<File>();
		String fileName = aDir.getAbsolutePath().replace("\\", "\\\\");
		for (ModelSourceFile ms : jdbcTemplate
				.query("select file_name, file_content from model_source_files where file_name like '" + fileName + "%"
						+ extension + "'", this::mapRowToModelSourceFile)) {
			files.add(new File(ms.getFileName()));
		}
		return files;
	}

	@Override
	public String readFile(File aFile) throws Exception {
		String fileName = aFile.getAbsolutePath();
		List<ModelSourceFile> results = jdbcTemplate.query(
				"select file_name, file_content from model_source_files where file_name='" + fileName + "'",
				this::mapRowToModelSourceFile);
		return results.size() == 0 ? "" : results.get(0).getFileContent();
	}

	@Override
	public void writeFile(File aFile, String content) throws Exception {
		if (readFile(aFile).isEmpty()) {
			jdbcTemplate.update("insert into model_source_files (file_name, file_content) values (?, ?)",
					aFile.getAbsolutePath(), content);
		} else {
			jdbcTemplate.update("update model_source_files set file_content = '" + content + "' where file_name='"
					+ aFile.getAbsolutePath() + "'");
		}
	}

}
