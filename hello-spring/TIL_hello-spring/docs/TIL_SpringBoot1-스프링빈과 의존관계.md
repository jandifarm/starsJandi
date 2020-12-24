

## :green_heart: :woman_farmer: Welcom! star's Jandi Farm​ :woman_farmer: :green_heart:





### :seedling: Farm1. Spring Boot - TIL:pencil2:



* :woman_farmer: **Spring Boot TIL 운영 목적**
  * Spring Boot 강의에서 따로 정리 필요한 주요 개념 기록
  



* :woman_farmer: **Spring Boot TIL 목록**
  * 스프링 빈과 의존관계:point_left:
  * [AOP]()
  * [수업 듣다가 막혔던 것들](https://github.com/jandifarm/starsJandi/blob/main/hello-spring/TIL_hello-spring/docs/TIL_SpringBoot3-%EC%88%98%EC%97%85%EB%93%A3%EB%8B%A4%EA%B0%80%20%EB%A7%89%ED%98%94%EB%8D%98%20%EA%B2%83%EB%93%A4.md)





---







# 스프링 빈과 의존관계

#### :heavy_check_mark: 스프링 Bean

-스프링에 의해 생명주기가 관리되는 **객체**

-Bean은 스프링 컨테이너를 통해 생성된다. 



#### :heavy_check_mark: 스프링 bean을 등록하는 2가지 방법

1. 컴포넌트 스캔과 자동 의존관계 설정 :point_left:
2. 자바 코드로 직접 스프링 빈 등록하기



## 1. 컴포넌트 스캔과 자동 의존관계 설정




#### :heavy_check_mark: 컴포넌트 스캔 **@Componentscan**

- Component어노테이션 및 streotype(`@Service`, `@Repository`, `@Controller`.)어노테이션이 부여된 Class들을 **자동으로 Scan하여 Bean으로 등록**해주는 역할을 하는 어노테이션



#### :heavy_check_mark:**​ 컴포넌트 스캔 원리**

- Component 애노테이션이 있으면 스프링 빈으로 자동 등록된다. `@Controller` 컨트롤러가 스프링 빈으로 자동 등록된 이유도 컴포넌트 스캔 때문이다.



#### :heavy_check_mark: 컴포넌트 @Component

- Bean을 생성해야하는 클래스에 `@Component`를 사용하면 런타임 시점에 IoC 컨테이너가 **객체를 Scan**하여 **Bean으로 등록**해준다.




#### :heavy_check_mark: **@Autowired**

- 스프링이 연관된 객체를 스프링 컨테이너에서 찾아서 주입한다.

  * 회원 **:star:컨트롤러**에 의존관계 추가

    ```java
    package hello.hellospring.controller;
    import hello.hellospring.service.MemberService;
    import org.springframework.beans.factory.annotation.Autowired;
    import org.springframework.stereotype.Controller;
    @Controller
    public class MemberController {
     private final MemberService memberService;
     @Autowired
     public MemberController(MemberService memberService) {
     this.memberService = memberService;
     }
    }
    ```

    > **참고** 생성자에 @Autowired 가 있으면 스프링이 연관된 객체를 스프링 컨테이너에서 찾아서 넣어준다. 이렇게 객체 의존관계를 외부에서 넣어주는 것을 **DI (Dependency Injection), 의존성 주입**이라 한다. 이전 테스트에서는 개발자가 직접 주입했고, 여기서는 **@Autowired에 의해 스프링이 주입**해준다.

    

  * 회원  :star:**서비스** 스프링 빈 등록

    ```java
    @Service
    public class MemberService {
     private final MemberRepository memberRepository;
     @Autowired
     public MemberService(MemberRepository memberRepository) {
     this.memberRepository = memberRepository;
     }
    }
    ```

    > **참고**: 생성자에 @Autowired 를 사용하면 객체 생성 시점에 스프링 컨테이너에서 해당 스프링 빈을 찾아서 주입한다. 생성자가 1개만 있으면 @Autowired 는 생략할 수 있다.

    

  * 회원  :star:**레포지토리** 스프링 빈 등록

    ```java
    @Repository
    public class MemoryMemberRepository implements MemberRepository {}	
    ```

    

  * 스프링 컨테이너

    ![image-springContainer](https://github.com/jandifarm/starsJandi/blob/main/hello-spring/TIL_hello-spring/img/springContainer.png)

    > **참고** : 스프링은 스프링 컨테이너에 **스프링 빈을 등록할 때**, 기본으로 **싱글톤으로 등록**한다(유일하게 하나만 등록해서 공유한다) 따라서 같은 스프링 빈이면 모두 같은 인스턴스다. 설정으로 싱글톤이 아니게 설정할 수 있지만, 특별한 경우를 제외하면 대부분 싱글톤을 사용한다.

