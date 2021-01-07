# CodeMates21 TIL 



---

:school: **subject**: Java Basic

:green_book: **reference** : 혼자 공부하는 자바

:date: **date** : 2020년 12월 29일 화요일 - 2020년 12월 30일 수요일

:pencil2: **chapter** : 05. Reference Type 참조타입

---



## 05-1 참조타입과 참조변수

:heavy_check_mark:**​ 참조 타입** : 기본타입(char, int, cloat 등)을 제외한 배열, 클래스 등을 말한다. 참조 타입의 변수에는 **객체의 번지**가 저장된다. 번지로 객체를 참조한다는 의미에서 참조타입이라고 한다.

:heavy_check_mark: **메모리 사용 영역** : <u>힙 영역</u>에는 **객체**가 생성되고 <u>스택 영역</u>에는 **변수**가 생성된다.

:heavy_check_mark: **비교 연산자** : <u>기본 타입</u>에서 사용되면 **값**을 비교하지만, <u>참조타입</u>에서 사용되면 **번지**를 비교한다.



:bookmark_tabs: **확인문제**

③ String 타입에 대한 설명 중 맞는 것에 O표, 틀린 것에 X표 하세요.

* String 문자열의 비교는 **==**를 사용해야 한다. ( X )

  :point_right: 내부 문자열을 비교하고 싶을 때에는 String 객체의 **equals() 메소드**를 사용해야 한다.

④ 참조 변수에 대한 설명입니다. 맞는 것에 O표, 틀린 것에 X표 하세요.

* 참조 변수에 null이 저장된 상태에서는 객체를 사용할 수 없다. ( X )

  :point_right: 참조 변수는 '객체를 참조하지 않는다'는 뜻으로 null 값을 가질 수 있다. **null값도 초기값으로 사용할 수 있으므로** null로 초기화된 참조 변수는 스택 영역에 생성된다.





## 05-2 배열

:heavy_check_mark:**​ 배열** : 같은 타입의 데이터를 나열하고, 각 데이터에 index를 부여해 놓은 자료구조.

:heavy_check_mark: **인덱스** : 배열 항목에 붙인 번호

:heavy_check_mark: **배열 길이** : 배열에 저장될 수 있는 **항목(값)의 수**. 변수.length로 배열 길이를 읽는다.

:heavy_check_mark: **다차원 배열** : ` 타입[][] 변수 = new 타입[길이1][길이2];`

:heavy_check_mark: **향상된 for문** : `for(타입변수:배열){...}` 배열의 항목 개수만큼 반복하고 자동으로 for문을 빠져나간다.



:bookmark_tabs: **확인문제**

④ for문을 사용하여 주어진 배열의 항목에서 최대값 구해보시오.

* ch05test4.java

  ```java
  package com.javaBasic.ch05ReferenceType;
  public class ch05test4 {
    public static void main(String[] args){
      int max = 0;
      int[] array = {1, 5, 3, 8, 2};
      //작성 위치 (주어진 배열 항목의 최대값)
      for(int i=0; i<array.length; i++){
        if(max<array[i]){
          max=array[i];
        }
      }
      System.out.println("max: " + max);
    }
  }
  ```



⑤ 중첩 for문을 이용해 주어진 배열의 전체 항목의 합과 평균값을 구해보세요.

* ch05test5.java

  ```
  
  ```

  