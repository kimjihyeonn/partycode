package hellojpa;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import hellojpa.entity.Member;
import hellojpa.entity.MemberType;
import hellojpa.entity.Movie;
import hellojpa.entity.Team;

public class Main {


	public static void main(String[] args) {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("hello");
		EntityManager em = emf.createEntityManager();
		EntityTransaction tx = em.getTransaction();

		tx.begin();
		try {      
              
			Member member = new Member();
			member.setName("김지현");
			em.persist(member);
			
			Team team = new Team();
			
			team.setName("hello");
			
			em.persist(team);
			
			em.flush();
			em.clear();
		Member member5	=em.find(Member.class, member.getId());
			System.out.println(member5.getName());
			System.out.println(member5.getClass());
	    Team team3 =  member.getTeam();
	    
			/*
			 * Team team2 = em.find(Team.class, team.getId());
			 * System.out.println(team2.getClass()); List<Member> memberList =
			 * team2.getMembers(); System.out.println(team2.getClass());
			 * System.out.println(memberList.getClass()); for(Member member3 : memberList) {
			 * System.out.println(member3.getName()); }
			 */
		 
                
		
		
		    
		
		
	
   
			tx.commit();
		}catch (Exception e) {
			tx.rollback();
		}finally {
			em.close();
		}
		emf.close();
	}

}
