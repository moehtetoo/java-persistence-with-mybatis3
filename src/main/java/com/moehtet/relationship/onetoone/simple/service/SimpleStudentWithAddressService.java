package com.moehtet.relationship.onetoone.simple.service;

import org.apache.ibatis.session.SqlSession;

import com.moehtet.relationship.onetoone.entity.Student;
import com.moehtet.relationship.onetoone.simple.mapper.SimpleStudentWithAddressMapper;
import com.moehtet.relationship.onetoone.simple.util.SimpleSqlSessionFactory;

public class SimpleStudentWithAddressService {
	public Student getStudent(int id) {
		SqlSession session = SimpleSqlSessionFactory.openSession();
		try {
			SimpleStudentWithAddressMapper stuAddrMapper= session.getMapper(SimpleStudentWithAddressMapper.class);
			return stuAddrMapper.selcectStudentWithAddress(id);
		} catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			session.close();
		}
		return null;
	}
}
