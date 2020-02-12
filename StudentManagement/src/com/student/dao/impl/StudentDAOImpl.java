package com.student.dao.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.student.bean.Student;
import com.student.dao.StudentDAO;

public class StudentDAOImpl implements StudentDAO {
	Scanner sc=new Scanner(System.in);
	List<Student>addRecords=new ArrayList<Student>();
	@Override
	public void addStudents() {
		int k=1;
		while(k==1) {
		// TODO Auto-generated method stub
		System.out.println("enter student number");
		int sno=sc.nextInt();
		System.out.println("enter student name" );
		String sname=sc.next();
		System.out.println("enter student address");
		String sadd=sc.next();
		Student sb=new Student(sno,sname,sadd);
		addRecords.add(sb);
		System.out.println("student record add succesfull");
		System.out.println("do you want to add one more record1)yes2)no");
		k=sc.nextInt();
		}
	}

	@Override
	public List<Student> viewAllStuents() {
		// TODO Auto-generated method stub
		return addRecords;
	}

	@Override
	public Student viewStudent(int sno) {
		Student s=null;
		// TODO Auto-generated method stub
		for(Student sb:addRecords) {
			if(sb.getSno()==sno) {
				s=sb;
				break;
			}
		}
		return s;
	}

}
