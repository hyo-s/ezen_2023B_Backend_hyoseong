package day06;  // PACKAGE NAME

import java.util.Scanner;

public class Step6 {    // CLASS START
    public static void main(String[] args) {    // MAIN START

        Scanner scanner = new Scanner(System.in);

        String 전화번호부 = "";
        String[] array = null;

        while(true) {   // WHILE START
            System.out.println();
            System.out.println("========== 전화번호부 ===========");
            System.out.println("| 순번 |  이름  |    전화번호    |");
            if(array!=null) {   //  IF START
                for (int i = 0; i < array.length; i++) {        // FOR START
                    if (array[i] != null) { // IF START
                        String cutName = array[i].substring(0, 3);
                        String cutphoneNum = array[i].substring(3, 14);
                        System.out.printf("%4s %6s %15s", i + 1, cutName, cutphoneNum);
                        System.out.println();
                    }   // IF END
                }   // FOR END
            }   // IF END
            System.out.println();
            System.out.println("===============================");
// ============================================================================= //
            System.out.println("| 1.전화번호등록 | 2.전화번호 삭제 |");
            System.out.print("항목을 번호로 입력하세요 : ");
            String ch = scanner.nextLine();
// ============================================================================= //
            if (ch.equals("1")) {   // IF START
                System.out.print("이름을 입력하세요 : ");
                String name = scanner.nextLine();
                System.out.print("전화번호 입력하세요 : ");
                String phoneNum = scanner.nextLine();
                전화번호부 += name+phoneNum+",";
                array=전화번호부.split(",");
// ============================================================================= //
            }else if(ch.equals("2")){  // ELSE IF START     // IF END
                System.out.print("삭제하실 순번을 입력해주세요. : ");
                int no = scanner.nextInt();
                for(int i=0; i<array.length; i++){  // FOR START
                    if(no-1==i){    // IF START
                        array[i] = null;
                    }   // IF END
                }   // FOR END
            }   // ELSE IF END
// ============================================================================= //
        }   // WHILE END
    }   // MAIN END
}   // CLASS END

// 3. step6 전화번호부 만들기 [ 완성되면 카톡방 코드 제출 ]
/*
        박 효 성 0 1 0 2 8 2 6 7 0 9 3         유 재 석 0 1 0 1 2 3 4 5 6 7 8
        0  1  2 3 4 5 6 7 8 9 10 11 12 13   14 15 16 17 18 19 20 21 22 23 24 25 26 27

        만약 전화번호부의 길이가
    [1.조건]
        - 하나의 문자열만 이용하여 여러명의 이름과 전화번호를 관리하시오.
        String 전화번호부 = "";

    [2.기능구현]
        1.전화번호 등록
            - 이름 과 전화번호 를 입력받아 저장.
        2.전화번호 삭제
            - 출력된 전화번호 목록을 보고 순번을 입력받아 해당 순번의 전화번호 삭제
        3.전화번호 출력
            - String 전화번호부 에 저장된 데이터를 아래 그림과 같이 출력

    [3.실행화면]
        ============= 전화번호부 =============
        순번     이름      전화번호
        1       김현수     010-3913-2072
        2       유재석     010-1234-1234
        3       강호동     010-7777-7777

        1.전화번호등록 2.전화번호삭제
        선택>
*/