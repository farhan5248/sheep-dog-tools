package org.farhan.mbt.service;

import java.util.Optional;

public interface ModelRepository {

	Iterable<ModelSourceFile> findAll();

	Optional<ModelSourceFile> findByTagByName(String tag, String fileName);

	ModelSourceFile save(ModelSourceFile sourceFile);
}