package dao.impl;

import dao.UserDao;
//public class ProxyUserDao implements UserDao
public class ProxyUserDao{
	UserDao dao;
	public ProxyUserDao(UserDao dao) {
		super();
        this.dao = dao;        
	}
	
	public void insert() {
		System.out.println("¿ªÊ¼");
		dao.insert();
		System.out.println("½áÊø");
	}

}
