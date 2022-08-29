package com.globallogic.examManagement.entity;

import javax.persistence.*;

@Entity
@Table(name="exam")
public class Exam {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	long id;
	
	@Column
	String subject;
	
	public Exam() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Exam(long id, String subject) {
		super();
		this.id = id;
		this.subject = subject;
	}

	@Override
	public String toString() {
		return "Exam [id=" + id + ", subject=" + subject + "]";
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

	
	
	
	

}
