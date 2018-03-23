package com.qrs.springmvc.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.qrs.springmvc.dao.UserDao;
import com.qrs.springmvc.service.LoginService;

@Service("loginService")
public class LoginServiceImpl implements LoginService {
	
	@Autowired
	UserDao userDao;

	public void login() {
		String sql = "insert into user  (bh, name, password, age, sex, n_yx) VALUES ('22', '程序', '12', '12', NULL, '1');";
		userDao.insert(sql);
	}

}
