package day08;  // PACKAGE NAME

import java.util.Scanner;

public class Step4 {    // CLASS START
    public static void main(String[] args) {    // MAIN START
        Scanner scanner = new Scanner(System.in);
        //
        Phone[] phoneBook = new Phone[100];

        while (true){   // WHILE START
            System.out.println("==============전화번호부==============");
            System.out.println(" 순번       이름         전화번호");
            for(int i=0; i<phoneBook.length; i++){
                if(phoneBook[i]!=null){
                    System.out.printf("%3d \t %5s \t %12s \n",(i+1),phoneBook[i].name,phoneBook[i].number);
                }
            }
            System.out.println("====================================");
            System.out.print("1.전화번호등록 2.전화번호 삭제 : ");
            int ch = scanner.nextInt();

            if(ch==1){  // IF START
                // 1.입력받기
                System.out.print("이름 : ");
                String name = scanner.next();
                System.out.print("전화번호 : ");
                String number = scanner.next();

                // 2.객체생성 [ 생성자 선택 ]
                    // 필드는 객체가 없으면 사용 불가능 [ 클래스는 설계도 ]
//                Phone newPhone = new Phone();
//                newPhone.name = name;
//                newPhone.number = number;
                    // vs
                Phone newPhone = new Phone(name,number);

                // 3.phoneBook 배열내 빈공간을 찾아서 해당 인덱스에 객체 넣기
                for(int i=0; i<phoneBook.length; i++){  // FOR START
                    if(phoneBook[i] == null){   // IF START
                        phoneBook[i] = newPhone;
                        break;
                    }   // IF END
                }   // FOR END
            }   // IF END
            if(ch==2){  // IF START
                System.out.print("삭제할 순번 : ");
                int dNo = scanner.nextInt();

                phoneBook[dNo-1] = null;

                for(int i=dNo-1; i<phoneBook.length; i++){  // FOR START
                    if(i+1==phoneBook.length)break;
                    phoneBook[i] = phoneBook[i+1];
                }   // FOR END
            }   // IF END
        }   // WHILE END
    }   // MAIN END
}   // CLASS END
/*

기본생성자 사용시

*/