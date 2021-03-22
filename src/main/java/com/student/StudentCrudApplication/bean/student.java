package com.student.StudentCrudApplication.bean;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class student {
	
	@Id
	@GeneratedValue
	private int student_no ;
	private String name;
	private Date student_dob;
	private Date student_doj;
	
	public student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public student(int student_no, String name, Date student_dob, Date student_doj) {
		super();
		this.student_no = student_no;
		this.name = name;
		this.student_dob = student_dob;
		this.student_doj = student_doj;
	}

	public int getStudent_no() {
		return student_no;
	}

	public void setStudent_no(int student_no) {
		this.student_no = student_no;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getStudent_dob() {
		return student_dob;
	}

	public void setStudent_dob(Date student_dob) {
		this.student_dob = student_dob;
	}

	public Date getStudent_doj() {
		return student_doj;
	}

	public void setStudent_doj(Date student_doj) {
		this.student_doj = student_doj;
	}
	
	
	

}
