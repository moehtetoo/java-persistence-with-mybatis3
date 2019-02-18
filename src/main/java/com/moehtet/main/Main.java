package com.moehtet.main;

import com.moehtet.entity.Student;
import com.moehtet.service.StudentService;


public class Main {
	public static void main(String[] args) {
		StudentService stu= new StudentService();
		Student s1 = new Student();
		s1.setStudId(1);
		s1.setName("Moe Htet");
		s1.setAddress("Yangon");
		stu.createStudent(s1);
		Student s2 = new Student();
		s2.setStudId(2);
		s2.setName("Kyaw Kyaw");
		s2.setAddress("Yangon");
		stu.createStudent(s2);
		Student s3 = new Student();
		s3.setStudId(3);
		s3.setName("Maw Maw");
		s3.setAddress("Monywa");
		stu.createStudent(s3);
		
		stu.getAllStudent().forEach(student -> System.out.println(student.getName()));
	}
}
