package com.pluralsight.blog.data;

import org.springframework.data.jpa.repository.JpaRepository;
import com.pluralsight.blog.model.Author;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(exported = false)
public interface AuthorRepository extends JpaRepository<Author, Long> {}