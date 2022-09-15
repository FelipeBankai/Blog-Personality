package com.ufro.BlogcitoPersonal.repository;

import com.ufro.BlogcitoPersonal.model.Post;
import org.springframework.data.repository.CrudRepository;

public interface PostRepository extends CrudRepository<Post, Long> {
}