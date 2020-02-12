package com.student.details;

import java.util.List;
import java.util.Scanner;

import com.student.bean.Student;
import com.student.client.StudentClient;
import com.student.dao.StudentDAO;
import com.student.dao.impl.StudentDAOImpl;

public class StudentDetails {
	Scanner  sc=new Scanner(System.in);
	StudentDAO daoimpl=new StudentDAOImpl();
 public void studentMenu() {
	 while(true) {
	 System.out.println(".........................");
	 System.out.println("     1)AddStudents       ");
	 System.out.println("     2)viewAllStudents   ");
	 System.out.println("     3)viewStudents      ");
	 System.out.println("     4)Back              ");
	 System.out.println(".........................");
	 System.out.println("enter your choice        ");
	 int choice=sc.nextInt();
	 //StudentDAOImpl d=new StudentDAOImpl();
	 switch(choice) {
	 case 1:
	 		daoimpl.addStudents();
	 		break;
	 case 2:
		 	List<Student>addRecords=daoimpl.viewAllStuents();
		 	System.out.println("SNO\tSNAME\tSADD");
		 	for(Student s:addRecords)
		 	{System.out.println(s.getSadd()+"\t"+s.getSname()+"\t"+s.getSno());
		 	
		 	}
		 	break;
	 case 3:
		 System.out.println("enetr student number");
		 int sno=sc.nextInt();
		 Student sb=daoimpl.viewStudent(sno);
		 daoimpl.viewStudent(sno);
		 if(sb!=null)
			 System.out.println(sb.getSadd()+"\t"+sb.getSname()+"\t"+sb.getSno());
		 else
			 System.out.println("student not available");
		 break;
	 case 4:
		 StudentClient.main(null);
		 break;
		 default:
			 System.out.println("choose 1- 4in between");
	 }
	 
	 }
 }
}
