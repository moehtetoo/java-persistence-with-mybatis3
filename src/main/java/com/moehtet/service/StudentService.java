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
	private Logger logger= LoggerFactory.getLogger(getClass());
	public List<Student> getAllStudent(){
		logger.debug("Select all students");
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
		logger.debug("Select Student by ID:{}",id);
		SqlSession sqlSession= MybatisSqlSessionFactory.openSession();
		try {
			StudentMapper studentMapper= sqlSession.getMapper(StudentMapper.class);
			return studentMapper.findStudentById(id);
		} finally {
			sqlSession.close();
			
		}
	}
	public void createStudent(Student student) {
		logger.debug("Create Student :"+student.getName());
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
