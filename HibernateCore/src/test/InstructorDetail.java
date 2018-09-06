package test;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="instructor_detail")
public class InstructorDetail {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@Column(name="youtube_channel")
	private String youtubeChannel;
	
	@Column(name="hobby")
	private String hobby;

	//Use instructor_detail property in class Instructor to find associated instructor to this InstructorDetail
	//Apply same operation to related entity
//	@OneToOne(mappedBy="instructorDetail",cascade=CascadeType.ALL)
	//apply operation only this entity
	@OneToOne(mappedBy="instructorDetail",cascade= {
			CascadeType.DETACH,
			CascadeType.MERGE,
			CascadeType.PERSIST,
			CascadeType.REFRESH,
	})
	private Instructor instructor;
	
	public InstructorDetail() {
		System.out.println("Call InstructorDetail Default constructor");
	}
	
	public InstructorDetail(String youtubeChannel, String hobby) {
		System.out.println("Call InstructorDetail Full Constructor");
		this.youtubeChannel = youtubeChannel;
		this.hobby = hobby;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getYoutubeChannel() {
		return youtubeChannel;
	}

	public void setYoutubeChannel(String youtubeChannel) {
		this.youtubeChannel = youtubeChannel;
	}

	public String getHobby() {
		return hobby;
	}

	public void setHobby(String hobby) {
		this.hobby = hobby;
	}
	
	public Instructor getInstructor() {
		return instructor;
	}
	
	public void setInstructor(Instructor instructor) {
		System.out.println("Call setInstructor in InstructorDetail");
		this.instructor = instructor;
	}
	
	@Override
	public String toString() {
		return "InstructorDetail [id=" + id + ", youtubeChannel=" + youtubeChannel + ", hobby=" + hobby + "]";
	}

	
	
}
