package service.impl;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import dao.UserDao;
import service.UserService;

@Component("userService")
//@Service("userService")
public class UserServiceImpl implements UserService {
	/*@Autowired
	@Qualifier("userDao2")*/
	@Resource(name="userDao")
	UserDao dao;
	
	/*public void setDao(UserDao dao) {
		this.dao = dao;
	}*/

	@Override
	public void insert() {
		// TODO Auto-generated method stub
		dao.insert();
	}

	@Override
	public void updateUser() {
		// TODO Auto-generated method stub
		System.out.println("ÐÞ¸Ä");
	}

	@Override
	public void deleteUser() {
		// TODO Auto-generated method stub
		System.out.println("É¾³ý");
	}

}
