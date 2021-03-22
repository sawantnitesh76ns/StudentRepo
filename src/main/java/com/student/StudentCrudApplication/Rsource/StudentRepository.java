package com.student.StudentCrudApplication.Rsource;

import java.util.List;

import org.springframework.data.repository.CrudRepository;


import com.student.StudentCrudApplication.bean.student;

public interface StudentRepository extends CrudRepository<student,Integer> {
	
	List<student> findAll();

}
