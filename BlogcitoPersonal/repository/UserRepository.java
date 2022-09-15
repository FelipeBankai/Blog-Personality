package com.ufro.BlogcitoPersonal.repository;

import com.ufro.BlogcitoPersonal.model.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long> {
}