package day06;  // 패키지 이름

import java.util.Scanner;

public class Step2 {    // CLASS START
    public static void main(String[] args) {    // MAIN START

        // p.153 문자열 타입
        // 1. 문자열 선언 : String 클래스 사용한다.
        String name;              // 스택영역(변수) 선언
        name = "홍길동";          // 스택영역에 힙영역(객체)의 주소 대입
        String hobby = "여행";   // 힙영역(객체)의 주소를 스택영역에 대입

        // 2. 문자열 비교
            // 1. ==
        String name1 = "홍길동";   // 힙영역 "" 의미가 문자열객체 생성
        String name2 = "홍길동";   // 힙영역
        System.out.println(name1 == name2); // True

            // 2. new 연산자 : 객체를 생성할때 사용되는 키워드
        String name3 = new String("홍길동");
        System.out.println(name2 == name3);            // False [ 스택이 가지는 주소/참조 값 비교 ]

            // 3. . 접근연산자 : 현재참조(객체)로 이동
        System.out.println(name1.equals(name2));       // True
        System.out.println(name2.equals(name3));       // True [ 스택이 가지는 주소/참의 내부 비교 ]

            // 4.
        Scanner scanner = new Scanner(System.in);
        String inputName = scanner.next();  // 새로운 문자열 반환

        System.out.println(name1 == inputName);         // False
        System.out.println(name1.equals(inputName));    // True

            // 5. null(객체없다) vs "" vs " "
        String hobby2 = "";
        if(hobby2.equals("")){
            System.out.println("hobby변수가 참조하는 String 객체는 빈 문자열");
        }

        String hobby3 = null;
        // 프로그램 도중에 hobby3 변수의 참조값이 변경될 수 있으므로
        if(hobby3 != null && hobby3.equals("")){
            System.out.println("문자열객체가 존재하면서 문자열 비교");
        }

    }   // MAIN END
}   // CLASS END
