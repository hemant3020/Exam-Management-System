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

import com.globallogic.examManagement.Service.AdminService;
import com.globallogic.examManagement.entity.Admin;

@RestController
@RequestMapping("/admin")
public class AdminController {
	
	@Autowired
	 private AdminService service;
	
	@GetMapping("/")
	public List<Admin> getAdmin(){
		return service.getAdmin();
   }
	
	@PostMapping("/")
	public List<Admin> addAdmin(@RequestBody Admin admin){
		return service.addAdmin(admin);
   }
	
	@PutMapping("/")
	public void updateAdmin( @RequestBody Admin admin){
	    service.updateAdmin(admin);
   }
	
	@DeleteMapping("/{id}")
		public void deleteAdmin( @PathVariable Long id){
		service.deleteAdmin(id);
   }
	
	

}
	
	
	
	


