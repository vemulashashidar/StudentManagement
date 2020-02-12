package com.student.dao;


import java.util.List;

import com.student.bean.Student;
public interface StudentDAO {
void addStudents();
List <Student> viewAllStuents();
Student viewStudent(int sno);
}
