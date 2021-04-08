package test;
import java.util.List;

import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import dao.UserDao;
import pojo.User;
import service.UserService;
//@RunWith(SpringJunit4ClassRunner.class)
//@ContextConfiguration(locations = {"classpath:config/ApplicationContext.xml"})
public class SpringTest {
	
	@org.junit.Test
	public void test() {	
		ApplicationContext ac= new ClassPathXmlApplicationContext("config/ApplicationContext.xml");
		//UserService service = ac.getBean("userService", UserService.class);
		//service.updateUser();
		UserDao dao = ac.getBean("userDao", UserDao.class);
		List<User> users = dao.queryAll();
		for(User user:users) {
			System.out.println(user);
		}
		
	}
}
