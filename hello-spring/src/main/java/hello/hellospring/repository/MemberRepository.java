package hello.hellospring.repository;

import hello.hellospring.domain.Member;
import java.util.List;
import java.util.Optional;

public interface MemberRepository {
  //기능1-회원정보 저장
  Member save(Member member);
  //기능2-회원Id 조회
  Optional<Member> findById(Long id);
  //기능3-회원이름 조회
  Optional<Member> findByName(String name);
  //기능4-모든회원정보 조회
  List<Member> findAll();
}
