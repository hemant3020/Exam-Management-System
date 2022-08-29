package com.globallogic.examManagement.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.globallogic.examManagement.Service.ExamService;
import com.globallogic.examManagement.entity.Exam;

@RestController
@RequestMapping("/exam")
public class ExamController {
	@Autowired
	ExamService service;
	
	@GetMapping("/")
	public List<Exam> getExam(){
		return service.getExam();
   }
	
	@PostMapping("/")
	public List<Exam> addExam(@RequestBody Exam exam){
		return service.addExam(exam);
   }

}
