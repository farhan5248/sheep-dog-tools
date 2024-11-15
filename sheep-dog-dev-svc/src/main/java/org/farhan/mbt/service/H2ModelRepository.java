package org.farhan.mbt.service;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Optional;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class H2ModelRepository implements ModelRepository {

	private JdbcTemplate jdbcTemplate;

	public H2ModelRepository(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	@Override
	public Iterable<ModelSourceFile> findAll() {
		return jdbcTemplate.query("select tag, file_name, file_content from model_source_files",
				this::mapRowToModelSourceFile);
	}

	private ModelSourceFile mapRowToModelSourceFile(ResultSet row, int rowNum) throws SQLException {
		return new ModelSourceFile(row.getString("tag"), row.getString("file_name"), row.getString("file_content"));
	}

	@Override
	public Optional<ModelSourceFile> findByTagByName(String tag, String fileName) {
		List<ModelSourceFile> results = jdbcTemplate.query(
				"select tag, file_name, file_content from model_source_files where id=? and file_name=?",
				this::mapRowToModelSourceFile, tag, fileName);
		return results.size() == 0 ? Optional.empty() : Optional.of(results.get(0));
	}

	@Override
	public ModelSourceFile save(ModelSourceFile sourceFile) {
		jdbcTemplate.update("insert into model_source_files (tag, file_name, file_content) values (?, ?, ?)",
				sourceFile.getTag(), sourceFile.getFileName(), sourceFile.getFileContent().toString());
		return sourceFile;
	}

}
