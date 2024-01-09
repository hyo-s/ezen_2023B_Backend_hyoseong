package day06;  // PACKAGE NAME

import java.util.Scanner;

public class Step4 {    // CLASS START
    public static void main(String[] args) {    // MAIN START

        // 1. 문자열로 받은 금액에 천단위 쉼표를 넣어주는 코드
        Scanner scanner = new Scanner(System.in);
        System.out.println("입력(숫자형식으로 입력받기) : ");
        String money = scanner.nextLine();  System.out.println(money);
        String result = "";
            // 입력받은 문자열타입의 금액을 천단위 쉼표 넣어주기

        for(int i=0; i<money.length(); i++){    // FOR START
            // i는 0부터 입력받은 문자열 길이까지 1씩 증가한다.
            // System.out.println(i);
            System.out.print(i + ":" +money.charAt(i)+" ");    // 입력받은 문자열들을 for문을 이용한 한 문자씩 추출

            // 천단위쉼표 : 천단위마다 , 추가, 패던 : 3자리마다 ( 수 % 3 == 0 )
            System.out.println(money.length()-i +" ");
            if (i > 0 && (money.length() - i) % 3 == 0) {    // IF START
                result += ",";
            }   // IF END
            result += money.charAt(i);
        }   // FOR END
        System.out.println("result = " + result);


    }   // MAIN END
}   // CLASS END
