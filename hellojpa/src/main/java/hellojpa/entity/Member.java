package hellojpa.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Member {
           
	@Id @GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	@Column(name = "USERNAME")
	private String name;
	private int age;
	//@Column(name="TEAM_ID")
	//private Long teamId;
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="TEAM_ID")
	private Team team;
	
	
	
	
	public Member(Long id, String name, int age, Team team) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.team = team;
	}
	public Team getTeam() {
		return team;
	}
	public void setTeam(Team team) {
		this.team = team;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
	@Override
	public String toString() {
		return "Member [id=" + id + ", name=" + name + ", age=" + age + ", team=" + team + "]";
	}
	public Member(Long id, String name, int age, Long teamId) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	
	}
	
public Member() {
	// TODO Auto-generated constructor stub
}
}
