package day04;  // 패키지 이름

import java.util.Scanner;

public class Step4 {    // CLASS START
    public static void main(String[] args) {    // MAIN START

        Scanner scanner = new Scanner(System.in);
        int money = 0;  // 예금액

        while(true){    // WHILE START

            System.out.println("========================");
            System.out.println("1.예금 2.출금 3.잔고 4.종료");
            System.out.println("========================");
            System.out.print("선택> ");   int ch = scanner.nextInt();

            if( ch == 1 ){  // IF1 START
                System.out.print("예금액> ");
                int inMoney = scanner.nextInt(); // 예금할 금액
                money += inMoney;
            }               // IF1 END
            if( ch == 2 ){  // IF2 START
                System.out.print("출금액> ");
                int outMoney = scanner.nextInt(); // 출금할 금액
                money -= outMoney;
            }               // IF2 END
            if( ch == 3 ){  // IF3 START
                System.out.println("잔고> " + money);
            }               // IF3 END
            if( ch == 4 ){  // IF4 START
                System.out.println("프로그램 종료");
                break;
            }               // IF4 END
        }   // WHILE END
    }   // MAIN END
}   // CLASS START
/*
    은행 프로그램 구현
        [ 요구사항 설계 ]
        1. 반복적으로 기능 사용 [ 단* 종료기능 선택 시 종료 ]
        2. 기능 : 예금, 출금, 잔고, 종료
            예금 : 더하기 작업
                금액에서 예금액을 입력받아 금액에 더한다.
            출금 : 빼기 작업
                금액에서 출금액을 입력받아 금액에 뺀다.
            잔고 : 확인 작업
                금액에 값을 출력한다.
            종료 : 프로그램을 끝내는 작업
                무한루프를 탈출한다. 1.스위치변수 2.break 3.return
                상황에 따라 선택
        3. 데이터 설계
            금액 : 예금,출금 했을때 누적으로 저장. [ 전역변수 ]
 */