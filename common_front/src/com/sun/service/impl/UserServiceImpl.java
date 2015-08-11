package com.sun.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sun.dao.UserDao;
import com.sun.entity.User;
import com.sun.service.UserService;
@Service
@Transactional(readOnly=true)
public class UserServiceImpl implements UserService {
	@Autowired
	private UserDao memberDao;
	@Override
	public User findByUserName(String userName) {
		return memberDao.findByUserName(userName);
	}

}
