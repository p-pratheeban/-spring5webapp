package com.pratheeban.repositories;

import org.springframework.data.repository.CrudRepository;

import com.pratheeban.model.Book;

public interface BookRepository extends CrudRepository<Book, Long>{

}
