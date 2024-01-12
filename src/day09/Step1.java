package day09;  // PACKAGE NAME

public class Step1 {    // CLASS START
    public static void main(String[] args) {    // MAIN START

        // p.231
            // JS 코드를 읽어주는 역할 : HTML(JS) <-- 브라우저( 프로그램[스레드] )
            // JAVA 코드를 읽어주는 역할 : MAIN함수( ) <-- MAIN 스레드

        // !! 필드/메소드를 사용하기 위해서는 꼭 객체가 필요하다.

        // 1. 객체 생성(생성자)
        Calculator myCalc = new Calculator();

        // 2. 객체 내 멤버(필드/메소드) 호출
        myCalc.powerOn();

        // 3. 메소드 호출 하고 매개변수 전달.
            // 매개변수 타입과 개수에 맞게 제공한다.
        myCalc.plus(5,6);
        // myCal.plus("오","육"); // 타입이 불일치
            // 리턴값이 있는 경우에는 변수에 저장
        int result = myCalc.plus(5,6);
        System.out.println("result = " + result);

        // 4.
        int x = 10;
        int y = 4;
        double result2 = myCalc.divide(x,y);
        System.out.println("result2 = " + result2);

        // 5.
        myCalc.powerOff();

    }   // MAIN END
}   // CLASS END
/*
상호작용
    매개변수와 리턴 값을 통해서 객체간의 데이터를 주고받는다.
main{
    int a = 10;
    int b = 20;
    divide( a, b ); // a가 가지고 있는 값을 c에게 전달  // b가 가지고 있는 값을 d에게 전달

    Car car = new Car();    // car가 가지고 있는 값(주소)을 car2에게 전달 102번지
    speed( car )
}
divide( int c, int d ){     // c=10, d=20       // a와 c의 값은 같다 그러나 메모리/주소는 다르다.
    print( c ) => 10
    print( d ) => 20
}
speed(Car car2){            // car2 = 102번지     // car와 car2가 참조하는 객체는 같지만 스택변수는 다르다.
    print( car2 ) => 102번지
}

*/