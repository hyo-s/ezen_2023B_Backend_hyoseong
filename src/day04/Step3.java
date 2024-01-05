package day04;  // 패키지 이름

import java.util.Scanner;

// p.131 무한루프 활용
public class Step3 {    // CLASS START
    public static void main(String[] args) {    // MAIN START
        // 입력객체 생성 : import java.util.Scanner;
        Scanner scanner = new Scanner(System.in);   // 입력객체

        boolean run = true; // 무한루프의 상태를 저장하고 있는 변수 [ on/off ]
        int speed = 1;  // 현재 속도를 저장하고 있는 변수 [ 1 입력하면 1 증가, 2 입력하면 1 감소 ]

        while(run){ // WHILE START  // 무한루프 시작

        // ========================= 무한반복 출력 ========================= //
            System.out.println("=========================");
            System.out.println(" 1.증속 | 2.감속 | 3.중지 ");
            System.out.println("=========================");
            System.out.print("선택 : ");
        // =============================================================== //

        // ========================= 무한반복 입력 ========================= //
            String strNum = scanner.nextLine(); // 엔터를 입력할 때 까지 'console이 대기' 상태로 됨
        // =============================================================== //

        // ========================= 입력 값에 따른 경우의 수 판단 ========================= //
            if(strNum.equals("1")){// IF START // 만약에 입력받은 값(문자열) 문자 1이면 [ 문자 비교시 .equals() ]
                speed++;    // 변수 값 연산 및 출력
            }else if(strNum.equals("2")){   // 만약에 입력받은 값이 문자 2이면
                speed--;    // 변수 값 연산 및 출력
            }else if(strNum.equals("3")){   // 만약에 입력받은 값이 문자 3이면
                // 1. while 다시 이동해서 false이므로 반복문 종료
                run = false;
                // 2. 가장 가까운 반복문{ } 나가기
                break;  // 가장 가까운 반복문 탈출 키워드 : 현재 기준에서 가장 가까운 반복문은 무한루프
                // 3. 함수 { } 나가기
                // return; // 현재 함수 종려 == main( 함수 )f,
            }   // IF END
        }   // WHILE END // 무한루프 끝
    }   // MAIN END
}   // CLASS END

/*

    무한루프 = 무한반복
        주의할 점 : 무한루프 종료하는 조건은 필수.
        1. while( true ){ }
        2. boolean run = true; while( run ){ };

*/