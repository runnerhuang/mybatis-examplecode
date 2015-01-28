package com.mybatis;

public interface UserService {
	 public int countAll();
	 public User selectUserbyId(int id);
	 public void addUser(User user);
	 public void updateUser(User user);
	 public void deleteUser(User user);
}
