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

import com.globallogic.examManagement.Service.CourseService;
import com.globallogic.examManagement.entity.Course;

@RestController
@RequestMapping("/course")
public class CourseController {
	
	@Autowired
	CourseService service;
	
	
	@GetMapping("/")
	public List<Course> getCourse(){
		return service.getCourse();
   }
	
	@PostMapping("/")
	public List<Course> addCourse(@RequestBody Course course){
		return service.addCourse(course);
   }
	
	@PutMapping("/")
	public void updateCourse(@RequestBody Course course){
		 service.addCourse(course);
   }
	
	@DeleteMapping("/{id}")
	public void deleteCourse(@PathVariable long id){
		service.deleteCourse(id);
   }

}
