package com.cts.timesheet.dao;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import org.springframework.stereotype.Repository;

import com.cts.timesheet.model.User;

public class UserDaoImpl extends HibernateDaoSupport implements UserDao  {

	
	@Override
	public boolean save(User user) {
		getHibernateTemplate().save(user);
		return true;
	}

	@Override
	public boolean update(User user) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean delete(Integer userId) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<User> getAllUsers() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User getUser(Integer userId) {
		// TODO Auto-generated method stub
		return null;
	}

}
