package com.globallogic.examManagement.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.globallogic.examManagement.entity.Exam;

@Service
public interface ExamService {
	
	abstract public List<Exam> getExam();
	 
	 abstract public List<Exam> addExam(Exam exam);
	 
	
	 

}
