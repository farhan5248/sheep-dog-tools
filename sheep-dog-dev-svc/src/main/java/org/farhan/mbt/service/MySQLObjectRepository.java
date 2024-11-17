package org.farhan.mbt.service;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import org.farhan.mbt.core.ObjectRepository;
import org.springframework.context.annotation.Profile;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
@Profile("!surefire")
public class MySQLObjectRepository implements ObjectRepository {

	private JdbcTemplate jdbcTemplate;

	public MySQLObjectRepository(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	private ModelSourceFile mapRowToModelSourceFile(ResultSet row, int rowNum) throws SQLException {
		return new ModelSourceFile(row.getString("file_name"), row.getString("file_content"));
	}

	@Override
	public ArrayList<String> list(String path, String extension) {
		ArrayList<String> files = new ArrayList<String>();
		path = path.replace("\\", "\\\\");
		for (ModelSourceFile ms : jdbcTemplate
				.query("select file_name, file_content from Model_Source_Files where file_name like '" + path + "%"
						+ extension + "' ESCAPE '|'", this::mapRowToModelSourceFile)) {
			files.add(ms.getFileName());
		}
		return files;
	}

	@Override
	public String get(String path) throws Exception {
		path = path.replace("\\", "\\\\");
		List<ModelSourceFile> results = jdbcTemplate.query(
				"select file_name, file_content from Model_Source_Files where file_name='" + path + "'",
				this::mapRowToModelSourceFile);
		return results.size() == 0 ? null : results.get(0).getFileContent();
	}

	@Override
	public void put(String path, String content) throws Exception {
		if (contains(path)) {
			path = path.replace("\\", "\\\\");
			jdbcTemplate.update(
					"update Model_Source_Files set file_content = '" + content + "' where file_name='" + path + "'");
		} else {
			jdbcTemplate.update("insert into Model_Source_Files (file_name, file_content) values (?, ?)", path,
					content);
		}
	}

	@Override
	public boolean contains(String path) {
		path = path.replace("\\", "\\\\");
		List<ModelSourceFile> results = jdbcTemplate.query(
				"select file_name, file_content from Model_Source_Files where file_name='" + path + "'",
				this::mapRowToModelSourceFile);
		return results.size() != 0;
	}

}
