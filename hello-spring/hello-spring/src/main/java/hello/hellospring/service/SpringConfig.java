package hello.hellospring.service;

import hello.hellospring.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.persistence.EntityManager;

@Configuration
public class SpringConfig {

/*      DataSource dataSource;

        @Autowired
      public SpringConfig(DataSource dataSource) {
        this.dataSource = dataSource;
    }*/

   //rivate EntityManager em;

    private final MemberRepository memberRepository;

/*
    @Autowired
    public SpringConfig(EntityManager em) {
        this.em = em;
    }*/
    @Autowired
    public SpringConfig(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }

    @Bean
    public MemberService memberService(){
        return new MemberService(memberRepository);
    }

/*    @Bean
    public MemberRepository memberRepository(){
        //return new JdbcMemberRepository(dataSource);

        //return new JdbcTemplateMemberRepository(dataSource);

        return new JpaMemberReposiroty(em);
    }*/


}
