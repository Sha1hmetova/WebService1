package com.company.webservice.user;

import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Integer> {
    public abstract Long countById(Integer id);
}
