# CodeMates21 TIL 



---

:school: **subject**: Java Basic

:green_book: **reference** : 혼자 공부하는 자바

:date: **date** : 2020년 12월 30일 수요일 - 2020년 12월 31일 목요일

:pencil2: **chapter** : 06. 클래스

---



## 06-1 객체지향프로그래밍

* **:heavy_check_mark: 클래스의 구성 멤버** 
  * **필드**: 생성자, 메서드 전체에서 사용되며 객체가 소멸되지 않는 한 객체와 함께 존재.
  * **생성자**: 클래스 이름으로 되어 있고, return 타입이 없다.
  * **메소드**: 메소드는 객체 간의 데이터를 전달하는 수단. 외부로부터 매개값을 받아 실행에 이용하고, 실행 후 결과 값을 외부로 return할 수 있다. 

<img src="C:\Users\ADMIN\IdeaProjects\jandifarm\TIL\javaBasic\ch06Class\img\class.jpg" style="zoom:67%;" />



:heavy_check_mark: **public 접근제한자** : 파일 이름과 동일한 이름의 클래스 선언에만 붙인다.

:heavy_check_mark: **객체 생성** : ①new 연산자로 객체 생성 ②new 연산자 뒤에는 생성자가 온다.  ③new 연산자로 생성된 객체는 **힙영역**에 생성. ④new 연산자는 힙 영역에 객체 생성 후 객체 번지를 return한다.

* 예시

  * Student.java

    ```java
    package sec01.exam01;
    
    public class Student {
        
    }
    ```

  * StudentExample.java

    ```java
    package sec01.exam01;
    
    public class StudentExample {
    	public static void main(String[] args) {
    		Student s1 = new Student();
    		System.out.println("s1 변수가 Student 객체를 참조한다.");
    		
    		Student s2 = new Student();
    		System.out.println("s2 변수가 Student 객체를 참조한다.");
    	}
    }
    ```

    :point_right: Student 클래스는 하나지만 new 연산자를 사용한 만틈 객체가 메모리에 생성된다.



## 06-2 필드

:heavy_check_mark: **필드** : 객체 고유 데이터를 저장하는 곳

:heavy_check_mark: **필드 선언** : ①클래스 중괄호 { }블록 어디서든 존재 ②생성자 선언, 메소드 선언 앞 뒤 모두 선언 가능 ③**But** 생성자, 메소드 중괄호{ }블록 내부에는 선언 불가.

* 예시(확인문제②,③): Member클래스의 필드를 MemberExample클래스의 main()메소드에서 사용하는 경우

  * Member.java

    ```java
    public class Member {
    	String name;
    	String id;
    	String password;
    	int age;
    }
    ```

  * MemberExample.java

    ```java
    public class MemberExample {
    	public static void main(String[] args) {
    		Member member = new Member();
    		member.name = "최뚜비";
    		member.age = 23;
    	}
    }
    ```





## 06-3 생성자 :star:

:heavy_check_mark: **생성자** : new 연산자로 클래스로부터 객체를 생성할 때 호출되어 **객체의 초기화** 담당

:heavy_check_mark: **생성자 오버로딩** : 매개 변수를 달리하는 생성자를 여러 개 선언하는 것

* 예시(확인문제②,③): Member클래스의 필드를 MemberExample클래스의 main()메소드에서 사용하는 경우

  * Car.java

    ```java
    public class Car {
      //필드
      String company = "또또자동차";
      String model;
      String color;
      int maxSpeed;
    
      //생성자
      Car() {
      }
    
      Car(String model) {
        this.model = model;
      }
    
      Car(String model, String color) {
        this.model = model;
        this.color = color;
      }
    
      Car(String model, String color, int maxSpeed) {
        this.model = model;
        this.color = color;
        this.maxSpeed = maxSpeed;
      }
    }
    ```

  * CarExample.java

    ```java
    public class CarExample {
      public static void main(String[] args) {
        Car car1 = new Car();
        System.out.println("car1.company : " + car1.company);
        System.out.println();
    
        Car car2 = new Car("트럭");
        System.out.println("car2.company : " + car2.company);
        System.out.println("car2.model : " + car2.model);
        System.out.println();
    
        Car car3 = new Car("트럭", "용달블루");
        System.out.println("car3.company : " + car3.company);
        System.out.println("car3.model : " + car3.model);
        System.out.println("car3.color : " + car3.color);
        System.out.println();
    
        Car car4 = new Car("택시", "흰색", 200);
        System.out.println("car4.company : " + car4.company);
        System.out.println("car4.model : " + car4.model);
        System.out.println("car4.color : " + car4.color);
        System.out.println("car4.maxSpeed : " + car4.maxSpeed);
      }
    }
    ```

    :point_right: Car.java 에서의 앞에 2개 생성자에서 this()를 사용해 마지막 생성자인 Car()..

    

