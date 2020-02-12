package com.student.client;

import java.util.Scanner;

import com.student.details.StudentDetails;

public class StudentClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		StudentDetails details=new StudentDetails();
		while(true) {
		System.out.println(".............................");
		System.out.println("      1)student              ");
		System.out.println("      2)Exit                 ");
		System.out.println(".............................");
		System.out.println("      enter your choice      ");
		int ch=sc.nextInt();
		switch(ch) {
		case 1:
			details.studentMenu();
			break;
		case 2:
			System.out.println("thnx for Application");
			System.exit(0);
			break;
		default:
			System.out.println("choose 1 to 2 between");
		}
	}
	}
}
