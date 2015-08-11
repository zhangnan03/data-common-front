package com.sun.service;

import com.sun.entity.User;

public interface UserService {
	public User findByUserName(String userName);
}
