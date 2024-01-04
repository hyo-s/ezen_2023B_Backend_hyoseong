package day03;  // 패키지 이름

import java.util.Scanner;

public class Step2 {    // CLASS START
    static String 작성자2;
    public static void main(String[] args) {    // MAIN START
    System.out.println(작성자2);
    // ======================================================================= //

        // 객체 사용이유 : 미리 설계(Scanner 입력관련)된 메소드 쓸려고
        Scanner scanner = new Scanner(System.in);

        // 예제1 : 작성자, 내용, 날짜 3가지를 입력받아 출력.
            // 1. 입력, 변수
        System.out.print("작성자 : "); String 작성자 = scanner.next();
        System.out.print("내용 : ");  String 내용 = scanner.next();
        System.out.print("날짜 : ");  String 날짜 = scanner.next();

            // 2-1. 입력받은 데이터 출력
        System.out.printf("===========방문록===========\n");
        System.out.printf("%4s %10s %20s %10s \n","번호","작성자","내용","날짜");
        System.out.printf("%5d %10s %20s %10s \n",1,작성자,내용,날짜);
            // 2-2. 입력받은 데이터 출력
        System.out.println("===========방문록===========");
        System.out.println("번호 | 작성자 \t\t| 내용\t\t | 날짜");
        System.out.println( 1 +" | "+작성자+ "\t\t| "+내용+"\t\t | "+날짜);

    // ======================================================================= //

        // 예제2 : 기본급과 수당 입력받아 실수령액 계산해서 출력
            // 실수령액 : 기본급 + 수당 - 세금[기본급 10%]

            // 1. 입력
        System.out.print("기본급 : "); int 기본급 = scanner.nextInt();
        System.out.print("수당 : "); int 수당 = scanner.nextInt();

            // 2. 처리
        int 실수령액 = 기본급 + 수당 - (int)(기본급*0.1);
            // 오류 나는 이유 : int = int + int - int * double -> double
            // 자동타입변환으로 타입끼리 연산 시 가장 큰 타입으로 반환함
            // 0.1은 double타입이므로 int*double의 결과는 double 그래서 double을 int에 대입할 수 없다. -> 강제 캐스팅

            // 3. 출력
        System.out.println("실수령액 = " + 실수령액);

    // ======================================================================= //

    }   // MAIN END
}   // CLASS END
