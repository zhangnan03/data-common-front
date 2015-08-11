package com.sun.entity;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="admin")
public class User extends BaseEntity{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/** 用户名 */
	private String userName;

	/** 密码 */
	private String passWord;

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassWord() {
		return passWord;
	}

	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}
	
	
}
