package org.farhan.common;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import org.farhan.mbt.core.ObjectRepository;
import org.farhan.mbt.service.ModelSourceFile;
import org.springframework.context.annotation.Profile;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
@Profile("surefire")
public class H2ObjectRepository implements ObjectRepository {

	private JdbcTemplate jdbcTemplate;

	public H2ObjectRepository(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	private ModelSourceFile mapRowToModelSourceFile(ResultSet row, int rowNum) throws SQLException {
		return new ModelSourceFile(row.getString("file_name"), row.getString("file_content"));
	}

	@Override
	public ArrayList<String> list(String path, String extension) {
		ArrayList<String> files = new ArrayList<String>();
		String fileName = path.replace("\\", "\\\\");
		for (ModelSourceFile ms : jdbcTemplate
				.query("select file_name, file_content from model_source_files where file_name like '" + fileName + "%"
						+ extension + "'", this::mapRowToModelSourceFile)) {
			files.add(ms.getFileName());
		}
		return files;
	}

	@Override
	public String get(String path) throws Exception {
		List<ModelSourceFile> results = jdbcTemplate.query(
				"select file_name, file_content from model_source_files where file_name='" + path + "'",
				this::mapRowToModelSourceFile);
		return results.size() == 0 ? null : results.get(0).getFileContent();
	}

	@Override
	public void put(String path, String content) throws Exception {
		if (contains(path)) {
			jdbcTemplate.update(
					"update model_source_files set file_content = '" + content + "' where file_name='" + path + "'");
		} else {
			jdbcTemplate.update("insert into model_source_files (file_name, file_content) values (?, ?)", path,
					content);
		}
	}

	@Override
	public boolean contains(String path) {
		List<ModelSourceFile> results = jdbcTemplate.query(
				"select file_name, file_content from model_source_files where file_name='" + path + "'",
				this::mapRowToModelSourceFile);
		return results.size() != 0;
	}

}
