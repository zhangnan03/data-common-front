package com.sun.dao;

import org.springframework.data.repository.CrudRepository;

import com.sun.entity.User;

public interface UserDao extends CrudRepository<User, Long>{
	public User findByUserName(String userName);
}
