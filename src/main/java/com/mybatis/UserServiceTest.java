package com.mybatis;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class UserServiceTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserService userService = (UserService)context.getBean("userService");
       System.out.println(userService.countAll());
        
        User user=new User();
        user.setUserAddress("ZH");
        user.setUserAge("29");
        user.setUserName("hsm");
        userService.addUser(user);
        user.setUserAddress("GZ");
        userService.updateUser(user);
        //userService.deleteUser(user);
        user=userService.selectUserbyId(1);
        System.out.println(userService);

	}

}
