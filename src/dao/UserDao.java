package dao;

import java.util.List;

import pojo.User;

public interface UserDao {
	void insert();
	List<User> queryAll();
}
