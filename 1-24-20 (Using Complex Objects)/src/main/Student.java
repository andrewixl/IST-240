package main;

import java.util.ArrayList;
import java.util.List;

public class Student {
	private String givenName;
	private String familyName;
	private int age;
	private float gpa;
	private List<Course> courseList = new ArrayList<>();
	
	public Student(String givenName, String familyName)
	{
		this.givenName = givenName;
		this.familyName = familyName;
	}

	public String getGivenName() {
		return givenName;
	}

	public void setGivenName(String givenName) {
		this.givenName = givenName;
	}

	public String getFamilyName() {
		return familyName;
	}

	public void setFamilyName(String familyName) {
		this.familyName = familyName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public float getGpa() {
		return gpa;
	}

	public void setGpa(float gpa) {
		this.gpa = gpa;
	}

	public List<Course> getCourseList() {
		return courseList;
	}

	public void setCourseList(List<Course> courseList) {
		this.courseList = courseList;
	}
	
	public void addCourse(Course c) {
		courseList.add(c);
	}
	
}
