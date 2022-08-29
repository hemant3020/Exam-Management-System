package com.globallogic.examManagement.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.globallogic.examManagement.entity.Exam;

public interface ExamRepo extends JpaRepository<Exam, Long> {

}
