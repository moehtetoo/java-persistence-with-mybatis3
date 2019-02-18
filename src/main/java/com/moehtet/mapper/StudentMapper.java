package com.moehtet.mapper;

import java.util.List;

import com.moehtet.entity.Student;

public interface StudentMapper {
	List<Student> findAllStudents();
	Student findStudentById(int id);
	void insertStudent(Student student);
}
