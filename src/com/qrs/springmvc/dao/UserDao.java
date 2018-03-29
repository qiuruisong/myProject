package com.qrs.springmvc.dao;

import org.springframework.stereotype.Component;

import com.qrs.springmvc.bean.User;

public class UserDao extends AbstractDao {
	
	private static String namespace = "com.qrs.springmvc.dao.UserMapper";
	
	/**
	 * 新增
	 * @param user
	 */
	public void insert(User user){
		String statement = namespace + ".insert";
        this.getSqlSession().insert(statement, user);
	}
	
}
