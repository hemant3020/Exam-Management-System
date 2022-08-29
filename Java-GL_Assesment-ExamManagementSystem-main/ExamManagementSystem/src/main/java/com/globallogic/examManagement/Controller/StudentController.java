package com.globallogic.examManagement.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.globallogic.examManagement.Service.StudentService;
import com.globallogic.examManagement.entity.Student;

@RestController
@RequestMapping("/student")
public class StudentController {
	
	@Autowired
	StudentService service;
	
	@GetMapping("/")
	public List<Student> getStudent(){
		return service.getStudent();
   }
	
	@PostMapping("/")
	public List<Student> addStudent(@RequestBody Student student){
		return service.addStudent(student);
   }
	
	@PutMapping("/")
	public void updateStudent( @RequestBody Student student){
	    service.updateStudent(student);
   }
	
	@DeleteMapping("/{id}")
		public void deleteStudent( @PathVariable Long id){
		service.deleteStudent(id);
   }
	
	@GetMapping("/name/{name}")
	public List<Student> getStudentByName(@PathVariable String name){
		return service.getStudentByName(name);
		
	}
		
	
		
		
		
	

}
