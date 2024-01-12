package day09;  // PACKAGE NAME

public class Calculator {   // CLASS START

    // 클래스멤버
        // 1. 필드
    int x=34;
        // 2. 생성자
        // 3. 메소드
            // 1. 리턴타입
            // 2. 함수명
            // 3. ( 매개변수, 매개변수 )
            // 4. { 명령문; }
            // 5. return : 함수를 종료하는 키워드
                    // void : return;
                    // void 아니면 : return 값;
                        // 메소드 선언시 리턴타입 정의한 타입과 일치

    // 1. 매개변수:X 리턴:X
    void powerOn(){ // METHOD START
        // 1. void : 메소드가 호출한 곳으로 전달하는 결과값이 없다.
        // 2. 'powerOn' : 함수명이고 소문자 시작 카멜표기법 권장 ( 단 클래스명과 다르게 )
        // 3. ( ) : 메소드를 호출할 때 전달한 매개값을 받기 위한 곳
        // 4. { } : 메소드가 실행되는 구역
        // 5. return : 생략 -> void라서 생략인데 리턴할 수 있음 [ 종료 ]
        System.out.println("전원을 켭니다.");
    }   // METHOD END

    // 2. 매개변수:X 리턴:X
    void powerOff(){
        System.out.println("전원을 끕니다.");
    }

    // 3. 매개변수:2개 리턴:int
    int plus(int x, int y){
        // 1. int : 메소드가 호출한 곳으로 전달하는 결과 값의 타입이 int 사용
        // 2. plus 함수명
        // 3. ( ) : 메소드를 호출할때 전달한 매개값을 x와 y로 받았다
        // 4. { } : 메소드가 실행되는 구역
        // 5. return : void 제외한 함수내 return 무조건 1개이상 필수
        int result = x + y;
        return result;
    }

    // 4. 매개변수:2개 리턴:double
    double divide(int x, int y){
        double result = (double)x / (double)y;
        return result;  // return : 함수를 종료하는 키워드 vs break : 가장 가까운 반복문 종료
    }
}   // CLASS END
