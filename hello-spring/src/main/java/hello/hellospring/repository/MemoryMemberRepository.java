package hello.hellospring.repository;

import hello.hellospring.domain.Member;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

public class MemoryMemberRepository implements MemberRepository{

  //key(Long) value(Member)
  private static Map<Long, Member> store = new HashMap<>();
  private static long sequence = 0L;

  @Override
  public Member save(Member member) {

    member.setId(++sequence);
    store.put(member.getId(), member);
    return member;
  }

  @Override
  public Optional<Member> findById(Long id) {
    //null이 반환 될 가능성이 있으면 ofNullable로 감싸서 전송
    return Optional.ofNullable(store.get(id));
  }

  @Override
  public Optional<Member> findByName(String name) {
    //
    return store.values().stream()
        //lamda member.getName이 parameter로 넘어온 아이와 같은지 비교
        .filter(member -> member.getName().equals(name))
        //Map에서 돌면서 찾으면 Optional로 반환 / 없으면 optional에 null이 포함되서 반환
        .findAny();
  }

  @Override
  public List<Member> findAll() {
    return new ArrayList<>(store.values());
  }

  public void clearStore(){
    store.clear();
  }
}