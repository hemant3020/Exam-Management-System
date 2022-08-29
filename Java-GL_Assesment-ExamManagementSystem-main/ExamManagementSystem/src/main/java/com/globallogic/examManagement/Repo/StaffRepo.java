package com.globallogic.examManagement.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.globallogic.examManagement.entity.Staff;

public interface StaffRepo extends JpaRepository<Staff,Long> {

}
