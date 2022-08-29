package com.globallogic.examManagement.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.globallogic.examManagement.entity.Course;

public interface CourseRepo extends JpaRepository<Course,Long> {

}
