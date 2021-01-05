package com.capgemini.controller;

import java.util.Scanner;

import com.capgemini.beans.Student;

public class StudentSchedular {
    Scanner sc=new Scanner(System.in);
    
	private Student[] students=new Student[10];
	private int counterStudent;
	
	public String addStudent(int rollNumber, String name, String[] courses)
	{
		students[counterStudent++]=new Student(rollNumber,name,courses);
		
		return "student added successfully";
	}
	
	public void showAllStudents()
	{
		for(int i=0;i<counterStudent;i++)
		{
			System.out.println("Roll number "+students[i].getRollNumber());
			System.out.println("Student Name "+students[i].getName());
			System.out.print("Courses enrolled: ");
			for(String crs:students[i].getCourses())
			{
				System.out.print(crs+" ");
			}
		}
	}
	
	public void countByCourse()
	{
		if(students==null) 
		{
			System.out.println("No Records Entered");
		}
		else
		{
			System.out.println("Enter Course: ");
			String crsSearch=sc.next();
			int count=0;
			for(int i=0;i<students.length;i++)
			{
				for(String crs:students[i].getCourses())
				{
					if(crsSearch==crs)
					{
						count++;
					}
				}
			}
			System.out.println("Students have registered for this course");
		}
	}

}
