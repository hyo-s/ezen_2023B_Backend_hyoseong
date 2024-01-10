package day07;

import java.util.Scanner;

public class Step3 { // class c
    public static void main(String[] args) { // m s

        Scanner scanner = new Scanner(System.in);

        String 전화번호부 = "김현수,010-3913-2072\n유재석,010-1234-1234\n강호동,010-7777-7777";
        // 문자열 설계
        // 하나의 여러개 저장하니까. 여러개를 구분하면서 저장해야되니까. 구분자(정해진건 없음 )
        // 1.전화번호부에는 여럿 사람들이 저장되니까. 사람 구분  \n
        // 김현수010-3913-2072유재석010-1234-1234강호동010-7777-7777
        // 김현수010-3913-2072\n유재석010-1234-1234\n강호동010-7777-7777
        // 2. 이름과 전화번호 구분. 상태 구분 ,
        // 김현수,010-3913-2072\n유재석,010-1234-1234\n강호동,010-7777-7777

        while( true ) { // w s
            // 1. 사람 구분[ \n ] 기준으로 분리. [ 3조각 => 배열 ]
            String[] 사람명단 = 전화번호부.split("\n");
            int 인원수 = 사람명단.length;

            System.out.println("============= 전화번호부 =============");

            for( int i = 0 ; i < 인원수; i++ ){
                //2. 한사람씩 필드 구분[ , ] 기준으로 분리 [ 2조각 => 배열 ]
                String[] 사람정보 = 사람명단[i].split(",");
                String 이름 = 사람정보[0];
                String 전화번호 = 사람정보[1];
                System.out.printf("%2d %5s %11s\n" , i+1 , 이름 , 전화번호 );
            } // for end

            System.out.println("1.전화번호등록 2.전화번호삭제 ");
            System.out.print("선택>");
            int ch = scanner.nextInt();

            if( ch == 1 ){
                // 1. 저장할 데이터 입력받는다.
                System.out.print("이름:");     String name = scanner.next();
                System.out.print("전화번호:"); String phone = scanner.next();
                // 2. 저장한다.
                //   \n하하,010-5525-5454
                String newData = "\n"+name+","+phone;
                System.out.println( newData );
                // 3. 기존 전화번호부에 연결
                전화번호부 += newData;
                System.out.println( 전화번호부 );
            }

            else if( ch == 2 ){
                System.out.print("삭제할 순번 : "); int dNo = scanner.nextInt();

                전화번호부 = ""; // 전화번호부 초기화.
                for( int i = 0 ; i < 인원수 ; i++ ){
                    // 제거할 인원 빼고 다시 전화번호부 셋팅.
                    if( i != dNo-1 ){ // i번째 인덱스와 입력받은 번호-1 순번과 같으면 찾았다.
                        전화번호부 += i == 인원수-1 ? 사람명단[i] : 사람명단[i]+"\n" ;
                    }
                }
            }
        } // w end
    } // m e
} // class e
/*
*             System.out.println( 전화번호부.split("\n") );
            System.out.println( 전화번호부.split("\n").length );
            System.out.println( 전화번호부.split("\n")[0] );
            System.out.println( 전화번호부.split("\n")[1] );
            System.out.println( 전화번호부.split("\n")[2] );

*
* */
/*

        // 여러개 자료를 관리하는 방법
            // 이름이 '유재석' 이고 전화번호가 '010-3333-3333' 이고 나이 '53' 일때.
        // 1.변수
        String 이름 ="유재석"; String 전화번호 = "010-3333-3333"; int 나이 = 53;
            // 주의할점 : 인원이 증가하면 그 인원수 만큼의 X3 변수 필요.
        // 2.배열
        String[] 이름명단 = {"유재석"};
        String[] 전화번호명단 = {"010-333-3333"};
        int[] 나이명단 = { 53 };
            // 주의할점 : 동일한 타입의 데이터들만 나열
        String[] 명단 = {
                "유재석" , "010-3333-3333" , "53" ,
                "강호동" , "010-4444-4444" , "73"
        };
        // 3.문자열
        String 인원 = "유재석,010-3333-3333,53";
        String[] 인원명단 = { 인원 , 인원 };
        // vs 여러개의 자료들을 하나의 문자열로 합치기[ !!!: 구분자 ]
        String 인원명단 = "유재석,010-3333-3333,53\n강호동,010-4444-4444,73";
            // 1. 사람 구분 : \n
            // 2. 사람 마다의 정보 : ,

        // 4. 클래스 / 객체
            // 서로 다른 타입들을 하나의 타입 묶음.
            class 사람 { String String int }
        사람 m = new 사람();
        사람 m = new 사람();

        사람[] 인원명단 = { m(String String int) , m(String String int) };

*/