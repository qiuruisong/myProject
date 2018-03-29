package com.qrs.springmvc.dao.impl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;


public class UserDaoImpl {
	
	public static final String url = "jdbc:mysql://127.0.0.1/improve";  
    public static final String name = "com.mysql.jdbc.Driver";  
    public static final String user = "root";  
    public static final String password = ""; 
	
	public void insert(String sql) {
		Connection conn = null;  
		PreparedStatement pst = null;  
		try {  
			Class.forName(name);//指定连接类型  
			conn =  DriverManager.getConnection(url, user, password);//获取连接  
			pst =  conn.prepareStatement(sql);//准备执行语句  
			pst.executeUpdate();
			conn.close();  
			pst.close();  
		} catch (Exception e) {  
			e.printStackTrace();  
		}   
		

	}

	public void delete() {
		// TODO Auto-generated method stub

	}
	 
}
