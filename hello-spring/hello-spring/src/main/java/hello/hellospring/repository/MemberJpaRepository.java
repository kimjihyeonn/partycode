package hello.hellospring.repository;

import hello.hellospring.domain.Member;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;
import java.util.Optional;



public class MemberJpaRepository {



    private EntityManager em;

    public MemberJpaRepository(EntityManager em) {
    }

    public Member save(Member member){
        em.persist(member);
        return member;
    }

    public void delete(Member member){
        em.remove(member);

    }

    public List<Member> findAll(){
         return em.createQuery("select m from Member m", Member.class).getResultList();

    }

    public Optional<Member> findById(Long id){
            Member member = em.find(Member.class, id);

            return Optional.ofNullable(member);
    }

    public Member find(Long id) {return em.find(Member.class, id);}
}
