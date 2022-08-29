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

import com.globallogic.examManagement.Service.StaffService;
import com.globallogic.examManagement.entity.Staff;

@RestController
@RequestMapping("/staff")
public class StaffController {
	@Autowired
	StaffService service;
	
	@GetMapping("/")
	public List<Staff> getStaff(){
		return service.getStaff();
   }
	
	@PostMapping("/")
	public List<Staff> addStaff(@RequestBody Staff staff){
		return service.addStaff(staff);
   }
	
	@PutMapping("/")
	public void updateStaff( @RequestBody Staff staff ) {
	    service.updateStaff(staff);
   }
	
	@DeleteMapping("/{id}")
		public void deleteStaff( @PathVariable Long id){
		service.deleteStaff(id);
   }

}
