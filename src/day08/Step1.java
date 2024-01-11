package day08;  // PACKAGE NAME

import java.util.Scanner;

public class Step1 {    // CLASS START
    public static void main(String[] args) {    // MAIN START

        // 메인스레드가 없으면 객체를 못 만듬? // main에 뭐가 있는듯,,

        Scanner scanner = new Scanner(System.in);

        // 1개 붕어빵을 만들기는 하는데 IF가 끝나면 붕어빵이 사라짐 그러니까 트레이에 IF 끝나기 전에 담아줌
        붕어빵틀[] 붕어빵트레이 = new 붕어빵틀[100];
                // 500번지 배열 안에 0번째는 101번지
                // 첫번째 붕어빵을 구웠을때
                // 500번지{ 500번지[101번지], 500번지[null] ---}
                // 두번째 붕어빵을 구웠을때


        while(true){    // WHILE START

            for(int i=0; i<붕어빵트레이.length; i++){
                if(붕어빵트레이[i] != null){
                    System.out.println(붕어빵트레이[i].속재료);
                }
            }

            System.out.println();
            System.out.print("1.굽기 2.판매 : ");
            int ch = scanner.nextInt();

            if(ch==1){  // IF START

                System.out.print("속재료 : ");
                String 입력속재료 = scanner.nextLine();     // 넥스트랑 넥스트라인 차이!!엔터?

                // 1. 객체(제품)생성 : (1) new  (2) 클래스/생성자()를 호출한다
                    // new는 힙을 새롭게 만든다. 이걸 밖에서 사용하면 하나만 만들고 끝임
                    // 지금 있는 위치는 while에서 무한반복을 하고 ch=1 굽기를 선택하면 계속 생성이 되는거임
                붕어빵틀 붕어빵 = new 붕어빵틀(); // (1개의 주소) 붕어빵 생성
                    // 101번지{ }

                붕어빵.속재료 = 입력속재료;

                for(int i=0; i<붕어빵트레이.length; i++){ // FOR START

                    // 만약에 i번째 공간이 null이면 붕어빵을 넣는다.
                    if(붕어빵트레이[i] == null){      // IF START
                        붕어빵트레이[i] = 붕어빵;
                        break;
                        // 트레이에 붕어빵을 넣었으면 끝내야함
                    }   // IF END
                }   // FOR END
                // 붕어빵트레이[0] = 붕어빵;    // 객체(제품)를 참조하는 변수는 사라짐 얼른 객체의 참조주소를 담아주자
                // 얘를 이렇게 두면 나중에 GC가 필요없다고 판단해서 삭제함 그러니까 저장을 해줘야함
            }   // IF END '붕어빵'의 지역변수는 사라짐 -> 곧 객체도 사라짐
            if(ch==2){  // IF START
                System.out.print("판매할 붕어빵 위치 : ");
                int dNo = scanner.nextInt();

                // 자바는 힙영역에 객체를 제거하는 방법을 제공하지 않는다. 그래서 초기값(null)을 활용
                붕어빵트레이[ dNo ] = null; // 1 입력 0번째 인덱스
                // 만약에 삭제할 객체 인덱스에 뒤로 객체가 존재하면 한칸씩 인덱스 당기기
                for(int i=dNo; i<붕어빵트레이.length; i++){   // FOR START
                    // i+1 : 삭제한 인덱스 뒤
                    if(i+1==붕어빵트레이.length)break;   // 마지막인덱스이면 생략 { } 어디감?
                    붕어빵트레이[i] = 붕어빵트레이[i+1];    // 뒤에 객체를 앞으로 이동
                    // Index 5 out of bounds for length 5
                    // 길이 1 ~ 5, 인덱스 0 ~ 4  // 1 차이
                }   // FOR END
            }   // IF END
        }   // WHILE END

    }   // MAIN END
}   // CLASS END
