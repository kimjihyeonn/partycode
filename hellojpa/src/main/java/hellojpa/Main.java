package hellojpa;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import hellojpa.entity.Member;
import hellojpa.entity.MemberType;
import hellojpa.entity.Team;

public class Main {


	public static void main(String[] args) {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("hello");
		EntityManager em = emf.createEntityManager();
		EntityTransaction tx = em.getTransaction();

		tx.begin();
		try {      

			Team team = new Team();

			team.setName("teamA");
		
			Member member = new Member();
			//member.setId(100L);
		
			member.setName("김지현");
			
			
			
		    team.getMembers().add(member);
		    member.setTeam(team);
			em.persist(team);
			em.persist(member);
		
		System.out.println(team.getMembers());	

			 Member findmember = em.find(Member.class, member.getId()); 
			 
			em.persist(findmember);
			
			member.setName("hello");
			findmember.setAge(33);
			System.out.println(findmember==member);
			
			em.close();
			
			List<Member> mem =findmember.getTeam().getMembers();
			System.out.println(mem.get(0).setName("hello"));
			 
			// findmember.setName("t아카데미");
			 //findmember.setName("d아카데미");
			
			// findmember.setName("아아");
			
			 
			/* findmember.getTeam(); findTeam.getName();
			 * 
			 * List<Member> members =findTeam.getMembers();
			 * 
			 * for(Member mber: members) { System.out.println(mber); }
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
