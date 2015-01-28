package com.mybatis;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository("userService")

public class UserServiceImpl implements UserService {
	@Autowired
	private UserDao userDao;
	private User user;
    
    public int countAll() {
        return this.userDao.countAll();
    }
    
	public void addUser(User user){
	    userDao.addUser(user);
	}
	
	public void updateUser(User user){
		userDao.updateUser(user);
	}
	
	public void deleteUser(User user){
		userDao.deleteUser(user);
	}
	public User selectUserbyId(int id) {
		// TODO Auto-generated method stub
		this.user=userDao.selectUserbyId(id);
		return userDao.selectUserbyId(id);
		
	}
	
	public String toString(){
		return (user.getUserName().toString()+" lives in "+user.getUserAddress().toString());
	}
}
