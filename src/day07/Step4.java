package day07;  // PACKAGE NAME

import javax.lang.model.element.NestingKind;
import java.util.Scanner;

public class Step4 {    // CLASS START
    public static void main(String[] args) {    // MAIN START

        Scanner scanner = new Scanner(System.in);
        Phone phone = new Phone();
        Phone[] phoneBook = new Phone[100];

        while (true){   // WHILE START
            System.out.println("============= 전화번호부 =============");
            System.out.println("순번     이름      전화번호");
            System.out.print(phone.name);
            System.out.println("1.전화번호등록 2.전화번호삭제");
            System.out.print("선택> ");
            int ch = scanner.nextInt();
            if( ch == 1 ) {     // IF START
                System.out.print("이름 : ");
                phone.name += scanner.next();
                System.out.print("전화번호 : ");
                phone.phoneNumber += scanner.next();
                System.out.println(phone.name);

            }   // IF END
        }   // WHILE END
    }   // MAIN END
}   // CLASS END
   /*
    [1.조건]
        - 하나의 클래스(Phone)를 설계해서 여러개의 객체 생성하고 관리하시오.
        - 설계한 클래스(Phone)를 이용하여 배열(phoneBook)을 하나만 선언합니다. 단 배열에 최대 100개의 객체만 저장할수 있습니다.
        Phone[] phoneBook = new Phone[100];

    [2.기능구현]
        1.전화번호 등록
            - 이름 과 전화번호 를 입력받아 객체 생성후 배열에 순서대로 저장.
        2.전화번호 삭제
            - 출력된 전화번호 목록을 보고 순번을 입력받아 해당 순번의 전화번호 삭제
            - 삭제된 객체 뒤 로 객체가 있을경우 한칸씩 앞으로 이동하시오.
                예)
                    0(객체A) 1(객체B) 2(객체C) 3(객체D)  4(null)
                        만일 2번 인덱스의 객체 삭제시
                    0(객체A) 1(객체B) 2(객체D) 3(null)   4(null)
        3.전화번호 출력
            - String 전화번호부 에 저장된 데이터를 아래 그림과 같이 출력
            - 단 배열 항목/요소내 객체가 없을경우에만 출력하지 마시오.

    [3.실행화면]
        ============= 전화번호부 =============
        순번     이름      전화번호
        1       김현수     010-3913-2072
        2       유재석     010-1234-1234
        3       강호동     010-7777-7777

        1.전화번호등록 2.전화번호삭제
        선택>
*/