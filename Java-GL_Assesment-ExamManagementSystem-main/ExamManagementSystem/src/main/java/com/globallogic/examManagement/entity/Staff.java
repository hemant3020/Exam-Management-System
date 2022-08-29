package com.globallogic.examManagement.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Staff {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	long id;
	
	@Column
	String subject;
	
	@Column
	String name;
	
	@OneToOne
	Exam exam;
	
	@OneToMany
	List<Student> student;
	public Staff() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Staff(long id, String subject, String name, Exam exam, List<Student> student) {
		super();
		this.id = id;
		this.subject = subject;
		this.name = name;
		this.exam = exam;
		this.student = student;
	}

	@Override
	public String toString() {
		return "Staff [id=" + id + ", subject=" + subject + ", name=" + name + ", exam=" + exam + ", student=" + student
				+ "]";
	}

	public List<Student> getStudent() {
		return student;
	}

	public void setStudent(List<Student> student) {
		this.student = student;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Exam getExam() {
		return exam;
	}

	public void setExam(Exam exam) {
		this.exam = exam;
	}

	
	
	

}
