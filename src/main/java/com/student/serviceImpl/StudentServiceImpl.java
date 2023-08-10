package com.student.serviceImpl;

import java.util.List;

//import org.hibernate.bytecode.internal.bytebuddy.PrivateAccessorException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.student.entity.Student;
import com.student.repository.StudentRepository;
import com.student.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService {
	@Autowired
	private StudentRepository studentRepository;

	@Override
	public List<Student> getAllStudent() {

		
		return studentRepository.findAll();
	}

	@Override
	public void saveStudent(Student student) {
		
		
		  studentRepository.save(student);
		
	}

	@Override
	public Student getStudentById(long id) {
		
		return studentRepository.findById(id).get();
		
	}

	@Override
	public Student updateStudent(Student student) {
		
		return studentRepository.save(student);
	}

	@Override
	public Student deleteStudentById(long id) {
		studentRepository.deleteById(id);
		return null;
	}
	
	

}
