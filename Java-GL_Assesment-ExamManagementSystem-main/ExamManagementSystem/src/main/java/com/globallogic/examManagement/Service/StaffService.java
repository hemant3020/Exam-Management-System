package com.globallogic.examManagement.Service;


import java.util.List;

import org.springframework.stereotype.Service;

import com.globallogic.examManagement.entity.Staff;

@Service
public interface StaffService {
	
	 abstract public List<Staff> getStaff();
	 
	 abstract public List<Staff> addStaff(Staff staff);
	 
	 abstract public void updateStaff(Staff staff);
	 
	 abstract public void deleteStaff(long id);
		
	
	

}
