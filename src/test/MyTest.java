package test;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.lang.reflect.InvocationHandler;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;


import dao.UserDao;
import dao.impl.ProxyUserDao;
import dao.impl.UserDaoImpl;
import dao.impl.UserDaoProxy;
import data.Data2String;
import pojo.User;
import service.DataOut;
import service.UserService;
import dao.impl.UserDaoImpl3;

//@RunWith(SpringJunit4ClassRunner.class)
//@ContextConfiguration(locations = {"classpath:applicationContext.xml"})
public class MyTest {
	
	public static void main(String[] args) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException {
		//加载Spring容器
		ApplicationContext ac= new ClassPathXmlApplicationContext("config/ApplicationContext.xml");
		//从容器获取对象
		//Data2String ds=(Data2String) ac.getBean("json");
		//ds.data2String();
		
		//DataOut out=(DataOut) ac.getBean(DataOut.class);
		//out.outout();
		//User user = ac.getBean("user",User.class);
		//System.out.println(user);
		/*User user2 = ac.getBean("user2",User.class);
		System.out.println(user2.getUsername());
		User user3 = ac.getBean("user3",User.class);
		System.out.println(user3.getUsername());
		ac.getClass().getMethod("close").invoke(ac);*/
		
		/*UserService service = ac.getBean("userService",UserService.class);
		service.insert();*/
		//静态代理
		/*UserDao dao = new ProxyUserDao(new UserDaoImpl());
		dao.insert();*/
		//动态代理
		/*UserDao dao = new UserDaoImpl();
		UserDaoProxy proxy = new UserDaoProxy(dao);
		UserDao userDao = (UserDao) Proxy.newProxyInstance(dao.getClass().getClassLoader(), dao.getClass().getInterfaces(),proxy);
		userDao.insert();*/
		//cglib 字节码增强实现代理
		/*UserDaoImpl3 userDao = new UserDaoImpl3();
		Enhancer enhancer = new Enhancer();
		enhancer.setSuperclass(userDao.getClass());
		enhancer.setCallback(new MethodInterceptor() {

			@Override
			public Object intercept(Object proxy, Method method, Object[] args, MethodProxy arg3) throws Throwable {
				System.out.println("开始");
		        proxy = method.invoke(userDao,args);
		        //methodProxy.involeSupper(dao,args);
		        System.out.println("结束");
		        return proxy;
			}
			
		});
		UserDaoImpl3 dao =(UserDaoImpl3) enhancer.create();
		dao.insert();*/
		UserService service = ac.getBean("userService", UserService.class);
		service.updateUser();
		
		/*dao.queryAll();*/
	}
}
