package day04;  // 패키지 이름

import java.util.Scanner;

public class Step5 {    // CLASS START
    public static void main(String[] args) {    // MAIN START
        Scanner scanner = new Scanner(System.in);
        String floor;
        String outHour;
        String outMinutes;

        int inHour=13;
        int inMinutes=0;

        String firstFloor = "1";
        String secondFloor = "2";
        String thirdFloor = "3";

        // ======================== 출차 ======================== //
        while(true){    // WHILE START
            System.out.println("============== 출차 ============== ");
            System.out.print("층을 입력해주세요."); floor = scanner.nextLine(); System.out.println(floor);

        // ======================== 1층 시작 ======================== //
            if(!floor.equals(firstFloor)){      // IF1 START
                System.out.println("입차한 내역이 없습니다.");
            }else if(true){     // ELSE IF START
                System.out.println("============== 출차 ============== ");
                System.out.print("출차시를 입력해주세요."); outHour = scanner.nextLine(); System.out.println("입력받은 시간 값: "+outHour);
                System.out.print("출차분을 입력해주세요."); outMinutes = scanner.nextLine(); System.out.println("입력받은 분 값: "+outMinutes);
                int outHourValue = Integer.parseInt(outHour); System.out.println("변환 시 : "+outHourValue);
                int outMinutesValue = Integer.parseInt(outMinutes); System.out.println("변환 분 : "+outMinutesValue);
                int price = (((outHourValue-12)*60+outMinutesValue) - ((inHour-12)*60+inMinutes)) / 10 * 1000; System.out.println("가격 : "+price);
                // ((출차시-12)*60+출차분) - ((입차시-12)*60+입차분) / 10 * 1000
                System.out.println("출차가 완료 되었습니다.");
                firstFloor="0"; System.out.println("현재 층 상태 : "+firstFloor);
                if(firstFloor.equals("0")){     // IF2 START
                    System.out.printf("| 1층 : %s | 2층 : %s | 3층 : %s |","주차","주차","비어있음");
                    System.out.println();
                }       // IF2 END
            }   // IF1 END  // ELSE IF END
        // ======================== 1층 끝 ======================== //

        // ======================== 2층 시작 ======================== //
            if(!floor.equals(secondFloor)){      // IF1 START
                System.out.println("입차한 내역이 없습니다.");
            }else if(true){     // ELSE IF START
                System.out.println("============== 출차 ============== ");
                System.out.print("출차시를 입력해주세요."); outHour = scanner.nextLine(); System.out.println(outHour);
                System.out.print("출차분을 입력해주세요."); outMinutes = scanner.nextLine(); System.out.println(outMinutes);
                int outHourValue = Integer.parseInt(outHour); System.out.println(outHourValue);
                int outMinutesValue = Integer.parseInt(outMinutes); System.out.println(outMinutesValue);
                int price = (((outHourValue-12)*60+outMinutesValue) - ((inHour-12)*60+inMinutes)) / 10 * 1000; System.out.println(price);
                // ((출차시-12)*60+출차분) - ((입차시-12)*60+입차분) / 10 * 1000
                System.out.println("출차가 완료 되었습니다.");
                secondFloor="0"; System.out.println(secondFloor);
                if(secondFloor.equals("0")){     // IF2 START
                    System.out.printf("| 1층 : %s | 2층 : %s | 3층 : %s |","주차","주차","비어있음");
                    System.out.println();
                }       // IF2 END
            }   // IF1 END  // ELSE IF END
        // ======================== 2층 끝 ======================== //

        // ======================== 3층 시작 ======================== //
            if(!floor.equals(thirdFloor)){      // IF1 START
                System.out.println("입차한 내역이 없습니다.");
            }else if(true){     // ELSE IF START
                System.out.println("============== 출차 ============== ");
                System.out.print("출차시를 입력해주세요."); outHour = scanner.nextLine(); System.out.println(outHour);
                System.out.print("출차분을 입력해주세요."); outMinutes = scanner.nextLine(); System.out.println(outMinutes);
                int outHourValue = Integer.parseInt(outHour); System.out.println(outHourValue);
                int outMinutesValue = Integer.parseInt(outMinutes); System.out.println(outMinutesValue);
                int price = (((outHourValue-12)*60+outMinutesValue) - ((inHour-12)*60+inMinutes)) / 10 * 1000; System.out.println(price);
                    // ((출차시-12)*60+출차분) - ((입차시-12)*60+입차분) / 10 * 1000
                System.out.println("출차가 완료 되었습니다.");
                thirdFloor="0"; System.out.println(thirdFloor);
                if(thirdFloor.equals("0")){     // IF2 START
                    System.out.printf("| 1층 : %s | 2층 : %s | 3층 : %s |","주차","주차","비어있음");
                    System.out.println();
                }       // IF2 END
            }   // IF1 END  // ELSE IF END
        // ======================== 3층 끝 ======================== //
        } // WHILE END






    }   // MAIN END
}   // CLASS END
/*

1. 가위바위보 게임 ( 사람과 컴퓨터 대전 )
   [ 요구사항 필수 조건 - 그외 적절하게 판단하여 구현 ]
      1. 배열 사용금지 ( 변수만 사용합니다. 아래 변수는 필수로 사용하되 새로운 변수 선언 가능 합니다. )
         String 플레이어 = 입력값;   String 컴퓨터 = 난수.
         int 플레이어승리수 = 0;   int 컴퓨터승리수 = 0

      2. 프로그램은 무한루프를 이용합니다. 단 *- printf 이용하여 현재 승리수 상황을 반복적으로 출력합니다.

      3. 'X' 입력할때까지 계속 게임은 반복되고 승리수는 누적이 됩니다. 'X'입력시 종료됩니다.

      4. 게임 종료시 각(플레이어와 컴퓨터) 승리수 를 출력후 승리수를 초기화 후 처음부터 다시 게임이 시작됩니다.

2. 기계식 주차 프로그램 ( 1~3층 층 3개 )
   [ 요구사항 필수 조건 - 그외 적절하게 판단하여 구현 ]
      1. 배열 사용금지 ( 변수만 사용합니다. 아래 변수는 필수로 사용하되 새로운 변수 선언 가능 합니다. )
         String 층1 = "";      String 층2 = "";       String 층3 ="";
         String 층1시 = "";      String 층2시 = "";      String 층3시 = "";
         String 층1분 = "";      String 층2분 = "";      String 층3분 = "";

      2. 프로그램은 무한루프를 이용합니다. 단 *- printf 이용하여 현재 층 상황을 반복적으로 출력합니다.

      3. 입차 : 사용자로부터 층 선택과 차량번호를 입력받습니다.
         - 단 해당 층에 차량이 있을경우 '입차불가' 없으면 '입차완료' 출력 합니다.
         - 해당 층 의 상태를 변경합니다.

      4. 출차 : 사용자로부터 층 과 출차시간(시/분)을 입력받습니다.
         - 단 해당 층에 차량이 있을경우 '출차완료[사용금액: 000원]' 없으면 '입차량이 없습니다' 출력 합니다.
         - 해당 층 의 상태를 변경합니다.

      5. 계산 : 10분당 천원으로 계산합니다.


3. 도서관 좌석 프로그램 ( 1~3 좌석 3개 )
   [ 요구사항 필수 조건 - 그외 적절하게 판단하여 구현 ]
      1. 배열 사용금지 ( 변수만 사용합니다. 아래 변수는 필수로 사용하되 새로운 변수 선언 가능 합니다. )
         String 좌석1 = "";      String 좌석2= "";       String 좌석3="";
         String 좌석1시 = "";      String 좌석2시 = "";      String 좌석3시 = "";
         String 좌석1분 = "";      String 좌석2분 = "";      String 좌석3분 = "";

      2. 프로그램은 무한루프를 이용합니다. 단 *- printf 이용하여 현재 좌석 상황을 반복적으로 출력합니다.

      3. 입실: 사용자로부터 좌석 선택과 전화번호 를 입력받습니다.
         - 단 해당 층에 차량이 있을경우 '입실불가' 없으면 '입실완료' 출력 합니다.

      4. 퇴실 : 사용자로부터 좌석 과 현재시간(시/분)을 입력받습니다.
         - 단 해당 층에 차량이 있을경우 '퇴실완료[ 좌석을 이용한 시간(분) : 000분 ] ' 없으면 '입실이 없습니다' 출력 합니다.

      5. 계산 : 총 사용시간을 계산합니다.

4. 계산기
   [ 요구사항 필수 조건 - 그외 적절하게 판단하여 구현 ]
      1. 배열 사용금지 ( 변수만 사용합니다. 아래 변수는 필수로 사용하되 새로운 변수 선언 가능 합니다. )
         String 피연산자1 = "";   String 피연산자2 = "";   String 연산자 = ""

      2. 프로그램은 무한루프를 이용합니다.단 *- printf 이용하여 계산 결과를 반복적으로 출력합니다.

      3. 입력 : 피연산자 , 연산자 , 피연산자 순으로 입력을 받습니다.

      4. 출력 : 입력받은 2개의 피연산자를 연산자에 맞게 계산처리 합니다.

      5. 계산 : 산술연산자만 구현합니다.

 */