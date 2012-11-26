package com.cts.timesheet.dao;

import java.util.List;

import com.cts.timesheet.model.User;

public interface UserDao {
	
	boolean save(User user);
	
	boolean update(User user);
	
	boolean delete(Integer userId);
	
	List<User> getAllUsers();
	
	User getUser(Integer userId);

}
