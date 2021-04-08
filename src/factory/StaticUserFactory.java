package factory;

import pojo.User;
/**
 * 创建user对象静态工厂
 * @author lixia18
 *
 */
public class StaticUserFactory {
	public static User getUser(){
        return new User();
    }
}
