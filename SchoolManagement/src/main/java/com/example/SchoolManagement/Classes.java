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
@Table(name="Classes")
public class Classes
	{
		@Id
		
		private int clid;
		private String clname;
		@ManyToMany(cascade = CascadeType.ALL,mappedBy="classes")
		List<Student> student= new ArrayList<Student>();
		
		public int getClid() {
			return clid;
		}
		public void setClid(int clid) {
			this.clid = clid;
		}
		public String getClname() {
			return clname;
		}
		public void setClname(String clname) {
			this.clname = clname;
		}
		public List<Student> getStudent() {
			return student;
		}
		public void setStudent(List<Student> student) {
			this.student = student;
		}
		
		
}
