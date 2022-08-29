package com.globallogic.examManagement.entity;



import javax.persistence.*;

@Entity
public class Student {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	long id;
	
	@Column
	String name;
	
	@Column
	String subject;
	
	@OneToOne
	Exam exam;
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(long id, String name, String subject, Exam exam) {
		super();
		this.id = id;
		this.name = name;
		this.subject = subject;
		this.exam = exam;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", subject=" + subject + ", exam=" + exam + "]";
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public Exam getExam() {
		return exam;
	}

	public void setExam(Exam exam) {
		this.exam = exam;
	}

	
	
	
	
	

}
