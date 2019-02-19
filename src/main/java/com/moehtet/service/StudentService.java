package com.moehtet.service;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.moehtet.entity.Student;
import com.moehtet.mapper.StudentMapper;
import com.moehtet.util.MybatisSqlSessionFactory;

public class StudentService {
	public List<Student> getAllStudent(){
		SqlSession sqlSession= MybatisSqlSessionFactory.openSession();
		try {
			StudentMapper studentMapper=sqlSession.getMapper(StudentMapper.class);
			return studentMapper.findAllStudents();
		}catch (Exception e) {
			e.printStackTrace();
		} 
		finally {
			sqlSession.close();
		}
		return null;
	}
	public Student getStudent(int id) {
		SqlSession sqlSession= MybatisSqlSessionFactory.openSession();
		try {
			StudentMapper studentMapper= sqlSession.getMapper(StudentMapper.class);
			return studentMapper.findStudentById(id);
		} finally {
			sqlSession.close();
			
		}
	}
	public void createStudent(Student student) {
		SqlSession sqlSession= MybatisSqlSessionFactory.openSession();
		try {
			StudentMapper studentMapper= sqlSession.getMapper(StudentMapper.class);
			studentMapper.insertStudent(student);
			sqlSession.commit();
		} finally {
			sqlSession.close();
			
		}
	}
	
}
