package com.moehtet.relationship.onetoone.simple.main;

import com.moehtet.relationship.onetoone.entity.Student;
import com.moehtet.relationship.onetoone.simple.service.SimpleStudentWithAddressService;

public class Main {
	public static void main(String[] args) {
		SimpleStudentWithAddressService service= new SimpleStudentWithAddressService();
		Student student=service.getStudent(1);
		if(student!=null) {
			System.out.println("Student : "+student.getName()+" "+student.getEmail());
			System.out.println("Address : "+student.getAddress().getCountry()+" "+student.getAddress().getCity()+" "+student.getAddress().getStreet());
		}else {
			System.out.println("Data does not exist!");
		}

	}
}
