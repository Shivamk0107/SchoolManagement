package com.example.SchoolManagement;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;





@Entity
@Table(name="studentCourses")
public class Courses {
	@Id
	
	private int cid;
	private String cname;
	
	@ManyToMany(cascade = CascadeType.ALL,mappedBy = "courses")
	List<Teacher> teacher= new ArrayList<Teacher>();
	
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public List<Teacher> getTeacher() {
		return teacher;
	}
	public void setTeacher(List<Teacher> teacher) {
		this.teacher = teacher;
	}	

}
