package com.student.service;

import java.util.List;

import com.student.entity.Student;

public interface StudentService {

	public List<Student> getAllStudent();
	
	public void saveStudent(Student student);
	
	public Student getStudentById(long id);
	public Student updateStudent(Student student);
	
	public Student deleteStudentById(long id);
	
	
	
}
