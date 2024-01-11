package day08;  // PACKAGE NAME

public class Step2 {    // CLASS START
    public static void main(String[] args) {    // MAIN START
        // p.218 ~ 224
        // 1. 기본생성자를 이용한 객체 생성
        // Car car1 = new Car();   // 클래스(설계도)안에 정의생성자가 존재하면 자동으로 기본생성자를 사용할 수 없다.
        // 해결 : 클래스 안에 기본생성자를 직접만들자.
            // 1.클래스명 2.변수명 3.= 4.new 5.생성자호출()
        // 2. 정의생성자를 이용한 객체 생성
        Car car = new Car("그랜져","검정",250);

    }   // MAIN END
}   // CLASS END
