package com.pratheeban.repositories;
import org.springframework.data.repository.CrudRepository;

import com.pratheeban.model.Author;

public interface AuthorRepository extends CrudRepository<Author, Long>{

}
