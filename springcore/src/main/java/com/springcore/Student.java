package com.springcore;

public class Student {
	
	private int stuId;
	private String stuName;
	private String stuAddress;
	public int getStuId() {
		return stuId;
	}
	public void setStuId(int stuId) {
		//System.out.println("Setting student id");
		this.stuId = stuId;
	}
	public String getStuName() {
		return stuName;
	}
	public void setStuName(String stuName) {
		//System.out.println("Setting student name");
		this.stuName = stuName;
	}
	public String getStuAddress() {
		return stuAddress;
	}
	public void setStuAddress(String stuAddress) {
		//System.out.println("Setting student address");
		this.stuAddress = stuAddress;
	}
	public Student(int stuId, String stuName, String stuAddress) {
		super();
		this.stuId = stuId;
		this.stuName = stuName;
		this.stuAddress = stuAddress;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Student [stuId=" + stuId + ", stuName=" + stuName + ", stuAddress=" + stuAddress + "]";
	}
	
	

}
