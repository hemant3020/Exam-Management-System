package com.globallogic.examManagement.ServiceImpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.globallogic.examManagement.Repo.AdminRepo;
import com.globallogic.examManagement.Repo.CourseRepo;
import com.globallogic.examManagement.Repo.ExamRepo;
import com.globallogic.examManagement.Repo.StaffRepo;
import com.globallogic.examManagement.Repo.StudentRepo;
import com.globallogic.examManagement.Service.AdminService;
import com.globallogic.examManagement.entity.Admin;
import com.globallogic.examManagement.entity.Course;
import com.globallogic.examManagement.entity.Exam;
import com.globallogic.examManagement.entity.Staff;
import com.globallogic.examManagement.entity.Student;
@Service
public class AdminServiceImpl implements AdminService {
	
	@Autowired
	AdminRepo repo;
	
	@Autowired
	ExamRepo erepo;
	
	@Autowired
	StudentRepo srepo;
	
	@Autowired
	StaffRepo strepo;
	
	@Autowired
	CourseRepo crepo;
	

	@Override
	public List<Admin> getAdmin() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

	@Override
	public List<Admin> addAdmin(Admin admin) {
		// TODO Auto-generated method stub
		Exam entity=erepo.findById(admin.getExam().getId()).get();
		
		List<Student> std=new ArrayList<>();
		for(Student s:admin.getStudent()) {
			Student student=srepo.findById(s.getId()).get();
			std.add(student);
		}
		
		List<Course> cour=new ArrayList<>();
		for(Course s:admin.getCourse()) {
			Course course=crepo.findById(s.getId()).get();
			cour.add(course);
		}
		
		List<Staff> stff=new ArrayList<>();
		for(Staff s:admin.getStaff()) {
			Staff staff=strepo.findById(s.getId()).get();
			stff.add(staff);
		}
		
		
		admin.setStaff(stff);
		admin.setCourse(cour);
		admin.setStudent(std);
		admin.setExam(entity);
		repo.save(admin);
		return repo.findAll();
	}

	@Override
	public void updateAdmin(Admin admin) {
		// TODO Auto-generated method stub
		repo.save(admin);
		
	}

	@Override
	public void deleteAdmin(long id) {
		// TODO Auto-generated method stub
		repo.deleteById(id);
		
	}

}
