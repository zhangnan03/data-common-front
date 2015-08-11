package com.sun.service;

import com.sun.entity.Member;

public interface MemberService {
	public Member findByUserName(String userName);
}
