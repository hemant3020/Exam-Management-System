package com.globallogic.examManagement.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.globallogic.examManagement.entity.Admin;

public interface AdminRepo extends JpaRepository<Admin, Long>{

}
