package day03;  // 패키지 이름

import java.util.Scanner;

public class Step1 {    // CLASS START
    public static void main(String[] args) { // MAIN START
        int x=10; int y=-3;

        // 1.산술연산자 ( 결과 : 값)
            System.out.println("x + y = " + (x + y));   // 더하기
            System.out.println("x - y = " + (x - y));   // 빼기
            System.out.println("x * y = " + (x * y));   // 곱하기
            System.out.println("x / y = " + (x / y));   // 나누기
            System.out.println("x / y = " + (6 / 10));  // 타입이 int (정수)
            System.out.println("x % y = " + (x % y));   // 나머지

        // 2.비교연산자 ( 결과 : boolean)
            System.out.println("x == y " + (x == y));   // 같다
            System.out.println("x != y " + (x != y));   // 같지 않다
            System.out.println("x > y " + (x > y));     // 초과
            System.out.println("x >= y " + (x >= y));   // 이상
            System.out.println("x < y " + (x < y));     // 미만
            System.out.println("x <= y " + (x <= y));   // 이하

        // 3.논리연산자 ( 비교연산자가 2개이상, 결과 : boolean)
            System.out.println("10< x <20 " + (x>10 && y<20)); // 그리고 AND
            System.out.println("y== 10 또는 == 20" + (y==10 ||y==20)); // 또는 OR
            System.out.println("x>=30의 반대" + !(x>=30)); // 부정/

        // 4.증감연산자
            System.out.println("x++ : " + (x++));   // 10 출력 후 1 증가
            System.out.println("x : " + (x));       // 11
            System.out.println("++x : " + (++x));   // 1증가 후 12 출력

            System.out.println("x-- : " + (x--));   // 12 출력 후 1 감소
            System.out.println("x : " + (x));       // 11
            System.out.println("--x : " + (--x));   // 1감소 후 10 출력

        // 5.(복합)대입 연산자
            x = 30; // = 오른쪽 값을 왼쪽에 대입
            x += 10; // x에 10을 더한 후에 x에 연산 결과 대입
            // -=, *=, /=, %=
            System.out.println();

        // 6.삼항연산자
            // 조건 ? 참:거짓
            // 조건1 ? 참1 : 조건2 ? 참2 : 거짓
            // 초건1 ? 참1 : 조건2 ? 참2 : 조건3 ? 참3 : 거짓
            String 결과 = x >= 90 ? "합격" : "불합격";
            System.out.println("결과 = " + 결과);

            String 결과2 = x >= 90 ? "A등급" : x >=80 ? "B등급" : "탈락";
            System.out.println("결과2 = " + 결과2);

        // 7.연결연산자.
            // 변수 + "문자열", "문자열" + "문자열"


    } // MAIN END
} // CLASS END

/*
    1. 변수 : 하나의 값 저장하는 메모리 공간 1.타입 2.변수명 3.대입 4.초기값
        타입 : boolean, byte, short, int, long, float, double, char, String
    2. 출력함수
        1. print( )
        2. println( )
        3. printf( )
    3. 입력객체/함수
        Scanner scanner= new Scanner(System.in);
        scanner.next( )
*/