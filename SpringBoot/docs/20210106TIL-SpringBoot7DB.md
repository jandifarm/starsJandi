**:date: 2021. 01. 05**

:clock8: **09:00-**

:bookmark_tabs: **SpringBoot - DB 접근 기술** 



#####  :cherries: step1.

* build.gradle에 library를 추가한다.

  * java는 DB랑 붙으려면 JDBC 드라이버가 꼭 필요하다.)

    ```java
    implementation 'org.springframework.boot:spring-boot-starter-jdbc'
    ```

  * database가 제공하는 client가 필요하므로 library를 추가한다.

    ```java
    runtimeOnly 'com.h2database:h2'	
    ```

* DB에 붙기위한 접속정보를 resources/application.properties에 추가한다.

  * JPA를 위한 접근 url을 추가한다.

    ```java
    spring.datasource.url=jdbc:h2:tcp://localhost/~/test
    ```

  * h2 DB로 접근하니까 h2 드라이버를 추가한다.

    ```java
    spring.datasource.driver-class-name=org.h2.Driver
    ```



 :cherries: **step2.**

* src/main/java/repository에 JdbcMemberRepository 만들기

  * 기존MemoryMemberRepository 레포지토리로 interface를 만들었으므로 구현체(jdbcMemberRepository)를 새로 만든다. 

  * MemoryMemberRepository 레포지토리가 회원 저장 역할을 하지만 구현을 메모리에 할지 DB랑 연동해서 JDBC에 할지 차이.

    

* DB에 붙기 위해 dataSource가 필요하다.

  * step1에서 추가한 library를 통해 springBoot는 dataSource를 만들어 놓는다. spring을 통해 dataSource를 주입받는다.  

    ```java
    private final DataSource dataSource;
      public JdbcMemberRepository(DataSource dataSource) {
        this.dataSource = dataSource;
      }
    ```

* save를 위한 쿼리문

  

  