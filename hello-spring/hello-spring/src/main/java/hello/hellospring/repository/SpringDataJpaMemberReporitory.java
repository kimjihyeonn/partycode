package hello.hellospring.repository;

import hello.hellospring.domain.Member;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

//JpaRepository를 상속받으면 인터페이스는 자동으로 빈으로 JPa인터페이스가 등록해준다.
public interface SpringDataJpaMemberReporitory  extends JpaRepository<Member, Long>,MemberRepository{

    @Override
    Optional<Member> findByName(String name);
}
