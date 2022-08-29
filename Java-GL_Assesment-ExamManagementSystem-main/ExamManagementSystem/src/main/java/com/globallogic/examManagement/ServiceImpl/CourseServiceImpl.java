package com.globallogic.examManagement.ServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.globallogic.examManagement.Repo.CourseRepo;
import com.globallogic.examManagement.Service.CourseService;
import com.globallogic.examManagement.entity.Course;

@Service
public class CourseServiceImpl implements CourseService{
	
	@Autowired
	CourseRepo repo;

	@Override
	public List<Course> getCourse() {
		// TODO Auto-generated method stub
		return repo.findAll() ;
	}

	@Override
	public List<Course> addCourse(Course course) {
		// TODO Auto-generated method stub
		repo.save(course);
		return repo.findAll();
	}

	@Override
	public void updateCourse(Course course) {
		// TODO Auto-generated method stub
		repo.save(course);
		
	}

	@Override
	public void deleteCourse(long id) {
		// TODO Auto-generated method stub
		repo.deleteById(id);
		
	}

}
