package mum.fpp.fm.impl;

import mum.fpp.fm.dao.RecordDAO;

public class UserInfo {

	private RecordDAO userDao;
	private int memberId;
	private int age;
	private double weight;
	private String sex;
	private String firstName;
	private String lastName;

	public UserInfo() {
		userDao = new RecordDAO();
	}

	public int getMemberId() {
		return memberId;
	}

	public void setMemberId(int memberId) {
		this.memberId = memberId;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public void submitUserInfo(UserInfo userInfo)
	{
		userDao.saveUserInfo(userInfo);
	}

	@Override
	public String toString() {
		return "UserInfo [userDao=" + userDao + ", memberId=" + memberId + ", age=" + age + ", weight=" + weight
				+ ", sex=" + sex + ", firstName=" + firstName + ", lastName=" + lastName + "]";
	}
	
	

}
