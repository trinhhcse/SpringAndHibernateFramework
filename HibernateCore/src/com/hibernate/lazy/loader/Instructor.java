package com.hibernate.lazy.loader;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="instructor")
public class Instructor {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@Column(name="first_name")
	private String firstName;
	
	@Column(name="last_name")
	private String lastName;
	
	@Column(name="email")
	private String email;
	
	//Uni-Direction You load Instructor object then access InstructorDetail
	//Bi-Direction You load Instructor object then access InstructorDetail
	//Also yout load InstructorDetail then reference to Instructor
	
	//Here is Uni-Direction
	//Cascade apply same operation to related entity 
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="instructor_detail_id") //column instructor map/associated to instructordetail table
	private InstructorDetail instructorDetail;
	//what variable using to representation parent class in child class
	@OneToMany(fetch=FetchType.LAZY,mappedBy="instructor",cascade= CascadeType.ALL)
//			   cascade= {CascadeType.PERSIST, CascadeType.MERGE,
//						 CascadeType.DETACH, CascadeType.REFRESH})
	private List<Course> courses;

	public Instructor() {
		System.out.println("Call Instructor Defailt Constructor");
	}
	
	public Instructor(String firstName, String lastName, String email) {
		System.out.println("Call Instructor Full Constructor");
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public InstructorDetail getInstructorDetail() {
		return instructorDetail;
	}

	public void setInstructorDetail(InstructorDetail instructorDetail) {
		System.out.println("Call setInstructor in InstructorDetail");
		this.instructorDetail = instructorDetail;
	}

	public List<Course> getCourses() {
		return courses;
	}
	
	public void setCourses(List<Course> courses) {
		this.courses = courses;
	}
	
	public void add(Course course) {
		if (courses == null) {
			courses =  new ArrayList<>();
		}
		
		courses.add(course);
		course.setInstructor(this);
	}

	@Override
	public String toString() {
		return "Instructor [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", email=" + email
				+ ", instructorDetail=" + instructorDetail + ", courses=" + courses + "]";
	}
	
	
	
	
	
}
