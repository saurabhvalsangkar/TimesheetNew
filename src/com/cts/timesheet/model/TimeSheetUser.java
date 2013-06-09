package com.cts.timesheet.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

//This is the test comment for GIT from web
@Entity
@Table(name="TIMESHEET_USERS")
public class TimeSheetUser implements User {

	private Integer employeeId;
	private String name;
	private String phone;
	private String email;
	private Integer scrumId;
	
	
	public void setEmployeeId(Integer employeeId) {
		this.employeeId = employeeId;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setScrumId(Integer scrumId) {
		this.scrumId = scrumId;
	}

	public TimeSheetUser(Integer id, String name, String phone, String email) {
		super();
		this.employeeId = id;
		this.name = name;
		this.phone = phone;
		this.email = email;
	}

	@Id
	@Override
	@Column(name="EMPLOYEE_ID")
	public Integer getEmployeeId() {
		return employeeId;
	}

	
	@Override
	@Column(name="EMPLOYEE_NAME")
	public String getName() {
		return name;
	}

	@Override
	@Column(name="EMPLOYEE_EMAIL")
	public String getEmail() {
		return email;
	}

	@Override
	@Column(name="EMPLOYEE_SCRUM_ID")
	public Integer getScrumId() {
		return scrumId;
	}

	/*@Override
	public UserRole getUserRole() {
		// TODO Auto-generated method stub
		return null;
	}*/

	@Override
	@Column(name="EMPLOYEE_PHONE")
	public String getPhone() {
		return phone;
	}

	
}
