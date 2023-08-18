package com.example.SchoolManagement;


import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="classStudents")
public class Student {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)

	

	private int Sid;
	private String  Sname;
	private String Semail;
	
	@ManyToMany(cascade=CascadeType.ALL)
	
	private List<Classes> classes =new ArrayList<Classes>();
	
	public int getSid() {
		return Sid;
	}
	public void setSid(int sid) {
		Sid = sid;
	}
	public String getSName() {
		return Sname;
	}
	public void setSName(String sname) {
		this.Sname = sname;
	}
	public String getSEmail() {
		return Semail;
	}
	public void setSEmail(String semail) {
		this.Semail = semail;
	}
	public List<Classes> getClasses() {
		return classes;
	}
	public void setClasses(List<Classes> classes) {
		this.classes = classes;
	}
	
}