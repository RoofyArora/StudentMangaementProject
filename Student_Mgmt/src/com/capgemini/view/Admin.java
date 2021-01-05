package com.capgemini.view;

import java.io.IOException;
import java.util.Scanner;

import com.capgemini.controller.StudentSchedular;

public class Admin {
	
	private static Scanner sc=new Scanner(System.in);
	private static StudentSchedular studSch=new StudentSchedular();
	public static void main(String[] args) throws IOException {
		showMenu();
	}
	
	private static void showMenu()
	{
		
		int choice;
		
		while(true)
		{
			System.out.println("1. Add Student");
			System.out.println("2. Show all students");
			System.out.println("3. Show count by course name");
			System.out.println("4. Exit");
			
			System.out.println("Enter your choice: ");
			choice=sc.nextInt();
			
			switch(choice)
			{
			case 1:addStudentDetails();
			       break;
			case 2:showAllStudents();
			       break;
			/*case 3:showByRollno();
			       break;
			case 4:showByCourse();
			       break; */
			case 3:countByCourse();
			       break; 
			case 4:showExit();
			       break; 
			default:System.out.println("Sorry entered wrong choice");
			
		    }
		}
	}
	
	private static void showAllStudents()
	{
		studSch.showAllStudents();
	}
	
	private static void addStudentDetails()
	{
		System.out.println("Enter roll number: ");
		int rollNumber=sc.nextInt();
		
		System.out.println("Enter name: ");
		String name=sc.next();
		
		System.out.println("How many courses do you want to register?");
		int num=sc.nextInt();
		String[] crsname=new String[num];
		System.out.println("Enter course names: ");
		for(int i=0;i<num;i++)
		{
			crsname[i]=sc.next();
		}
		
		System.out.println(studSch.addStudent(rollNumber,name,crsname));
	}
	
	private static void countByCourse()
	{
		studSch.countByCourse();
	}
	private static void showExit()
	{
		System.exit(0);
	}

}
