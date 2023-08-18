package com.example.SchoolManagement;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.Table;



@Entity
@Table(name="studentTeacher")

public class Teacher {
	@Id
	
	private int tid;
	private String tname;
	
	@ManyToMany(cascade=CascadeType.ALL)
	@JoinColumn(name="cid")
	
	private List<Courses> courses =new ArrayList<Courses>();
	public int getTid() {
		return tid;
	}
	public void setTid(int tid) {
		this.tid = tid;
	}
	public String getTname() {
		return tname;
	}
	public void setTname(String tname) {
		this.tname = tname;
	}
	public List<Courses> getCourses() {
		return courses;
	}
	public void setCourses(List<Courses> courses) {
		this.courses = courses;
	}
}
