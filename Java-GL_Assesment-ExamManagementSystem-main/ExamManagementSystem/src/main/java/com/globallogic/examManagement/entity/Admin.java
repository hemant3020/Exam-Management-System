package com.globallogic.examManagement.entity;

import java.util.List;

import javax.persistence.*;

@Entity
@Table(name="admin")
public class Admin {

	@Id
	@GeneratedValue(strategy =GenerationType.IDENTITY)
	long id;
	
	@Column
	String username;
	
	@Column
	String password;
	
	@OneToMany
	List<Student> student;
	
	@OneToMany
	List<Course> course;
	

	@OneToMany
	List<Staff> staff;
	
	@OneToOne
	Exam exam;

	public Admin() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Admin(long id, String username, String password, List<Student> student, List<Course> course,
			List<Staff> staff, Exam exam) {
		super();
		this.id = id;
		this.username = username;
		this.password = password;
		this.student = student;
		this.course = course;
		this.staff = staff;
		this.exam = exam;
	}


	@Override
	public String toString() {
		return "Admin [id=" + id + ", username=" + username + ", password=" + password + ", student=" + student
				+ ", course=" + course + ", staff=" + staff + ", exam=" + exam + "]";
	}





	public String getUsername() {
		return username;
	}





	public void setUsername(String username) {
		this.username = username;
	}





	public String getPassword() {
		return password;
	}





	public void setPassword(String password) {
		this.password = password;
	}






	

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	
	

	

	public List<Student> getStudent() {
		return student;
	}

	public void setStudent(List<Student> student) {
		this.student = student;
	}

	public List<Course> getCourse() {
		return course;
	}

	public void setCourse(List<Course> course) {
		this.course = course;
	}

	public List<Staff> getStaff() {
		return staff;
	}

	public void setStaff(List<Staff> staff) {
		this.staff = staff;
	}

	public Exam getExam() {
		return exam;
	}

	public void setExam(Exam exam) {
		this.exam = exam;
	}

	
	
	
	
	
	
	
	
	

}
