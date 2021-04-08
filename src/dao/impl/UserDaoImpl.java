package dao.impl;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Repository;

import dao.BaseDao;
import dao.UserDao;
import pojo.User;

@Repository("userDao")
//@Scope("prototype")
public class UserDaoImpl extends BaseDao implements UserDao {	
	@Override
	public void insert() {
		// TODO Auto-generated method stub
		System.out.println("添加");
	}

	@Override
	public List<User> queryAll() {
		 String sql ="select * from user";
	     return getJdbcTemplate().query(sql,new BeanPropertyRowMapper(User.class));//获取jdbc对象
	}

}
