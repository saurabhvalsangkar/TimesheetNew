package com.cts.timesheet.test;

import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cts.timesheet.dao.UserDao;
import com.cts.timesheet.model.TimeSheetUser;
import com.cts.timesheet.model.User;

public class UserDaoTest {
	private static UserDao userDao;

	@Before
	public void setUp() {
		String[] contexts = {
				"/com/cts/timesheet/resources/timesheet-beans.xml",
				"/com/cts/timesheet/resources/timesheet-resources.xml"};
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext(contexts);
		userDao = (UserDao) ctx.getBean("userDaoImpl");
	}

	@Test
	public void testSave() {

		User user = new TimeSheetUser(1,"Nitish","934343434","sa@gdsfjk.com");
		boolean succes = userDao.save(user);
		assertTrue(succes);

	}
	
	

}
