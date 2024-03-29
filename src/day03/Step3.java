package day03;  // 패키지 이름

import java.util.Arrays;
import java.util.Scanner;

public class Step3 {    // CLASS START
    public static void main(String[] args) {    // MAIN START

            Scanner scanner= new Scanner(System.in);

    // ======================================================================= //

        // 문제1 : 하나의 정수형으로  입력받아 7의 배수 이면 'O' 아니면 'X' 출력 하시오.
                // 1. 입력
            System.out.print("정수1 : "); int 정수1 = scanner.nextInt();
                // 2. 출력
            System.out.println(정수1%7==0 ? "O" : "X");

    // ======================================================================= //

        // 문제2 : 하나의 정수형으로  입력받아 홀수 이면 'O' 아니면 'X' 출력 하시오.
                // 1. 입력
            System.out.print("정수2 : "); int 정수2 = scanner.nextInt();
                // 2. 출력
            System.out.println(정수2%2==1 ? "O" : "X");

    // ======================================================================= //

        //문제3 : 하나의 정수형으로  입력받아 7의 배수 이면서 짝수 이면 'O' 아니면 'X' 출력 하시오.
                // 1. 입력
            System.out.print("정수3 : "); int 정수3 = scanner.nextInt();
                // 2. 출력
            System.out.println(정수3%7==0&&정수3%2==0 ? "O" : "X");

    // ======================================================================= //

        // 문제4 : 하나의 정수형으로  입력받아 11의 배수 이거나 짝수 이면 'O' 아니면 'X' 출력 하시오.
                // 1. 입력
            System.out.print("정수4 : "); int 정수4 = scanner.nextInt();
                // 2. 출력
            System.out.println(정수4%11==0||정수4%2==0 ? "O" : "X");

    // ======================================================================= //

        // 문제5 : 두개의 정수형으로 입력받아 더 큰수 출력 하시오.
                // 1. 입력
            System.out.print("정수5 : "); int 정수5 = scanner.nextInt();
            System.out.print("정수6 : "); int 정수6 = scanner.nextInt();
                // 2. 출력
            System.out.println(정수5>정수6 ? 정수5 : 정수6);

    // ======================================================================= //

        // 문제6 : 정수형으로 반지름을 입력받아 원 넓이 출력 하시오. 소수점 둘째 자리 까지 출력하시오.
            // 계산식) 원 넓이 공식 => 반지름 * 반지름 * 원주율[3.14]
                // 1. 입력
            System.out.print("반지름 : "); int 반지름 = scanner.nextInt();
                // 2. 출력
            System.out.printf("원 넓이 공식 : %.2f",반지름*반지름*3.14);

    // ======================================================================= //

        // 문제7 : 실수형으로 두번 입력받아 앞 실수의 값이 뒤의 값의 몇% 인지 소수점 첫째 자리까지 출력하시오.
            // 예) 54.5   84.3 실수 2개입력시 결과는   64.285714%
                // 1. 입력
            System.out.print("실수1 : "); double 실수1 = scanner.nextDouble();
            System.out.print("실수2 : "); double 실수2 = scanner.nextDouble();
                // 2. 출력
            System.out.printf("%.1f",실수1/실수2*100);

    // ======================================================================= //

        // 문제8 : 사다리꼴 넓이 구하기[윗변과 밑변 높이를 입력받아 출력하기 , 소수점 첫째 자리까지 출력하시오.
            // 계산식) 사다리꼴 계산식 = > (윗변 + 밑변) * 높이 / 2
                // 1. 입력
            System.out.print("윗변 : "); double 윗변 = scanner.nextDouble();
            System.out.print("밑변 : "); double 밑변 = scanner.nextDouble();
            System.out.print("높이 : "); double 높이 = scanner.nextDouble();
                // 2. 출력
            System.out.println("넓이 : "+(윗변+밑변)*높이/2);

    // ======================================================================= //

        // 문제9 : 키를 정수를 입력받아 표준체중 출력하기 , 정수형으로 출력하시오.
            // 계산식) 표준체중 계산식 = > (키 - 100) * 0.9
                // 1. 입력
            System.out.print("키 : "); int 키1 = scanner.nextInt();
                // 2. 출력
            System.out.println("표준체중 : "+(키1-100)*0.9);

    // ======================================================================= //

        // 문제10 : 키와 몸무게를 입력받아 BMI 출력하기 , 소수점 둘째 자리 까지 출력하시오.
            // 계산식) BMI 계산식 = > 몸무게 / ((키 / 100) * (키 / 100))
                // 1. 입력
            System.out.print("키 : "); double 키2 = scanner.nextDouble();
            System.out.print("몸무게 : "); double 몸무게 = scanner.nextDouble();
                // 2. 출력
            System.out.printf("BMI : %.2f",몸무게/((키2/100)*(키2/100)));

    // ======================================================================= //

        // 문제11 : inch 를 입력받아 cm 로 변환하기  , 소수점 둘째 자리까지 출력하시오.
            // 계산식) 1 inch -> 2.54cm
                // 1. 입력
            System.out.print("인치 : "); double 인치 = scanner.nextDouble();
                // 2. 출력
            System.out.printf("cm : %.2f",인치*2.54);

    // ======================================================================= //

        // 문제12:  중간고사, 기말고사, 수행평가를 입력받아 반영비율별 계산하여 소수 둘째자리까지 점수 출력하시오
            // 계산식 반영비율)  중간고사 반영비율 => 30 %  / 기말고사 반영비율 => 30 %   / 수행평가 반영비율 => 40 %
                // 1. 입력
            System.out.print("중간고사 : "); double 중간고사 = scanner.nextDouble();
            System.out.print("기말고사 : "); double 기말고사 = scanner.nextDouble();
            System.out.print("수행평가 : "); double 수행평가 = scanner.nextDouble();
                // 2. 출력
            System.out.printf("중간고사 : %.2f",중간고사*0.3);
            System.out.printf("기말고사 : %.2f",기말고사*0.3);
            System.out.printf("수행평가 : %.2f",수행평가*0.4);

    // ======================================================================= //

        // 문제13 :  연산 순서 나열 하고 printf() 에 출력되는 x 와 y 값을 예측하시오.
            // int x = 10;
            // int y = x-- + 5 + --x;
            // printf(" x의 값 : %d , y의값 :  %d ", x, y)

    // ======================================================================= //

        // 문제14 : 나이를 입력받아 나이가 10세이상이면 학생 , 20세이상이면 성인 , 40세이상이면 중년 으로 출력하기
                // 1. 입력
            System.out.print("나이 : "); int 나이 = scanner.nextInt();
                // 2. 출력
            System.out.println(나이 >= 40 ? "중년" : 나이 >= 20 ? "성인" : 나이 >= 10 ? "학생" : "아이");
            System.out.println(나이 >= 10 ? "학생" : 나이 >= 20 ? "성인" : 나이 >= 40 ? "중년" : "아이");

    // ======================================================================= //

        // 문제15 : 국어 , 영어 , 수학 점수를 입력받아 각 변수에 저장하고 총점(소수점 0자리) 출력 , 평균(소수점 2자리 까지) 출력
                // 1. 입력
            System.out.print("국어 : "); int 국어 = scanner.nextInt();
            System.out.print("영어 : "); int 영어 = scanner.nextInt();
            System.out.print("수학 : "); int 수학 = scanner.nextInt();

            int 총점 = 국어 + 영어 + 수학;
            double 평균 = (int)(총점/3.0*100)/100.0;
                // 2. 출력
             System.out.println("총점 = " + 총점);
             System.out.println("평균 = " + 평균);

    // ======================================================================= //

        // 문제16 : 아이디[문자열] 와 비밀번호[문자열] 를 입력받아 아이디가 'admin' 이고 비밀번호가 '1234' 와 일치하면 '로그인성공' 아니면 '로그인실패' 출력
                // 1. 입력
            System.out.print("아이디 : "); String 아이디 = scanner.nextLine();
            System.out.print("비밀번호 : "); String 비밀번호 = scanner.nextLine();
                // 2. 출력
            System.out.println("로그인 정보 = " + (아이디.equals("admin") && 비밀번호.equals("1234") ? "로그인성공" : "로그인실패"));

    // ======================================================================= //

        // 문제17 : 3개의 정수형으로 입력받아 가장 큰수 출력
                // 1. 입력
            System.out.print("정수 : "); int 정수7 = scanner.nextInt();
            System.out.print("정수 : "); int 정수8 = scanner.nextInt();
            System.out.print("정수 : "); int 정수9 = scanner.nextInt();
                // 2. 출력
            System.out.println(정수7>정수8 && 정수7>정수9 ? 정수7 : 정수8>정수7 && 정수8>정수9 ? 정수8 : 정수9);

    // ======================================================================= //

    }   // MAIN END
}   // CLASS END

        /*
문제1 : 하나의 정수형으로  입력받아 7의 배수 이면 'O' 아니면 'X' 출력 하시오.

문제2 : 하나의 정수형으로  입력받아 홀수 이면 'O' 아니면 'X' 출력 하시오.

문제3 : 하나의 정수형으로  입력받아 7의 배수 이면서 짝수 이면 'O' 아니면 'X' 출력 하시오.

문제4 : 하나의 정수형으로  입력받아 11의 배수 이거나 짝수 이면 'O' 아니면 'X' 출력 하시오.

문제5 : 두개의 정수형으로 입력받아 더 큰수 출력 하시오.

문제6 : 정수형으로 반지름을 입력받아 원 넓이 출력 하시오. 소수점 둘째 자리 까지 출력하시오.
   계산식) 원 넓이 공식 => 반지름 * 반지름 * 원주율[3.14]

문제7 : 실수형으로 두번 입력받아 앞 실수의 값이 뒤의 값의 몇% 인지 소수점 첫째 자리까지 출력하시오.
   예) 54.5   84.3 실수 2개입력시 결과는   64.285714%

문제8 : 사다리꼴 넓이 구하기[윗변과 밑변 높이를 입력받아 출력하기 , 소수점 첫째 자리까지 출력하시오.
   계산식) 사다리꼴 계산식 = > (윗변 + 밑변) * 높이 / 2

문제9 : 키를 정수를 입력받아 표준체중 출력하기 , 정수형으로 출력하시오.
   계산식) 표준체중 계산식 = > (키 - 100) * 0.9

문제10 : 키와 몸무게를 입력받아 BMI 출력하기 , 소수점 둘째 자리 까지 출력하시오.
   계산식) BMI 계산식 = > 몸무게 / ((키 / 100) * (키 / 100))

문제11 : inch 를 입력받아 cm 로 변환하기  , 소수점 둘째 자리까지 출력하시오.
   계산식) 1 inch -> 2.54cm

문제12:  중간고사, 기말고사, 수행평가를 입력받아 반영비율별 계산하여 소수 둘째자리까지 점수 출력하시오
   계산식 반영비율)  중간고사 반영비율 => 30 %  / 기말고사 반영비율 => 30 %   / 수행평가 반영비율 => 40 %

문제13 :  연산 순서 나열 하고 printf() 에 출력되는 x 와 y 값을 예측하시오.
   int x = 10;
   int y = x-- + 5 + --x;
   printf(" x의 값 : %d , y의값 :  %d ", x, y)

문제14 : 나이를 입력받아 나이가 10세이상이면 학생 , 20세이상이면 성인 , 40세이상이면 중년 으로 출력하기

문제15 : 국어 , 영어 , 수학 점수를 입력받아 각 변수에 저장하고 총점(소수점 0자리) 출력 , 평균(소수점 2자리 까지) 출력

문제16 : 아이디[문자열] 와 비밀번호[문자열] 를 입력받아 아이디가 'admin' 이고 비밀번호가 '1234' 와 일치하면 '로그인성공' 아니면 '로그인실패' 출력

문제17 : 3개의 정수형으로 입력받아 가장 큰수 출력
         */