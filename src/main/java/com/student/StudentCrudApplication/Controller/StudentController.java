package com.student.StudentCrudApplication.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;


import com.student.StudentCrudApplication.Rsource.StudentRepository;
import com.student.StudentCrudApplication.bean.student;

@RestController
public class StudentController {
	
	@Autowired
	private StudentRepository studRepo;
	
	
	@GetMapping("/student")
	public List<student> getAllStudent(){
		return studRepo.findAll();
	}
	
	@PostMapping("/AddStudent")
	@ResponseStatus(HttpStatus.CREATED)
	public student addStudent(@RequestBody student student) {
		return studRepo.save(student);
		
	}
	
	@DeleteMapping("/student/{id}")
	public void deleteStudent(@PathVariable(value="id") int id) {
		studRepo.deleteById(id);
	}
	
	@PutMapping("/student/{id}")
	public ResponseEntity<Object> updateStudent(@PathVariable int id,@RequestBody student student) {
		
		Optional<Optional<student>> companyRepo = Optional.ofNullable(studRepo.findById(id)); 

	if (!companyRepo.isPresent()) 
		return ResponseEntity 
			.notFound() 
			.build(); 

	student.setStudent_no(id); 

	studRepo.save(student); 

	return ResponseEntity 
		.noContent() 
		.build(); 
	}
	
	

}
