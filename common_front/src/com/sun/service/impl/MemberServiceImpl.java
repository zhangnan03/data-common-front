package com.sun.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sun.dao.MemberDao;
import com.sun.entity.Member;
import com.sun.service.MemberService;
@Service
@Transactional(readOnly=true)
public class MemberServiceImpl implements MemberService {
	@Autowired
	private MemberDao memberDao;
	@Override
	public Member findByUserName(String userName) {
		return memberDao.findByUserName(userName);
	}

}
