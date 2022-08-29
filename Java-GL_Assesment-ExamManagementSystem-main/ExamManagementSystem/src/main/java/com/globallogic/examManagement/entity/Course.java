package com.globallogic.examManagement.entity;

import javax.persistence.*;


@Entity
@Table(name="course")
public class Course {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	long id;
	
	@Column
	String name;
	
	@Column
	String subject;
	
	@Column
	String stream;
	
	public Course() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Course(long id, String name, String subject, String stream) {
		super();
		this.id = id;
		this.name = name;
		this.subject = subject;
		this.stream = stream;
	}

	@Override
	public String toString() {
		return "Course [id=" + id + ", name=" + name + ", subject=" + subject + ", stream=" + stream + "]";
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

	public String getStream() {
		return stream;
	}

	public void setStream(String stream) {
		this.stream = stream;
	}

	

}
