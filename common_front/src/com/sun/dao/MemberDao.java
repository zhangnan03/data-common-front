package com.sun.dao;

import org.springframework.data.repository.CrudRepository;

import com.sun.entity.Member;

public interface MemberDao extends CrudRepository<Member, Long>{
	public Member findByUserName(String userName);
}
