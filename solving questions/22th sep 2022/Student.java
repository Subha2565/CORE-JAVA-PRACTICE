/*
Program: create a array of 10 students and display the students who have marks more than 90

@author: SUBHADIP DAS
@Date: 21 sept 2022
*/
import java.util.*;

  class Student
 {
	//declaring instance variable
	
	private int studentID;
	private String studentName;
	private int marks;
	
	//default constructor no arg constructor
    Student()
	{
		
	}
	
	//parameterized constructor
	Student(int studentID,String studentName,int marks)
	{
		this.studentID=studentID;
		this.studentName=studentName;
		this.marks=marks;
		
	}
	
	//getters(accessors) and setters(mutators)
	
	public int getStudentID()
	{
		return this.studentID;
	}
	
	public void setStudentID(int studentID)
	{
		this.studentID=studentID;
	}

	//////////////////////////////
	public String getStudentName()
	{
		return this.studentName;
	}
	
	public void setStudentName(String studentName)
	{
		this.studentName=studentName;
	}
	
	//////////////////////////////
	public int getMarks()
	{
		return this.marks;
	}
	
	public void setMarks(int marks)
	{
		this.marks=marks;
	}
}
