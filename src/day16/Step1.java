package day16;  // PACKAGE NAME

public class Step1 {    // CLASS START
    public static void main(String[] args) {    // MAIN START
        // 1.인터페이스 변수 선언
        RemoteControl rc;
        // 2.인터페이스 변수에 객체참조 값 대입
        rc = new Television();  // 다형성
            // 타입이 다른데 가능한 이유 : 다형성, extends 혹은 implements 사용
        // 3.인터페이스의 메소드를 호출하면 구현 객체의 메소드가 호출된다.
        rc.turnOn();
        rc.setVolume(5);    // 텔레비전의 볼륨 5로 설정
        rc.turnOff();   // 텔레비전을 끕니다.

        // 다형성 ( 교체 )
        rc = new Audio();
        rc.turnOn();
        rc.setVolume(5);    // 오디오의 볼륨 5로 설정
        rc.turnOff();   //  오디올를 끕니다.

        System.out.println("리모콘 최고 볼륨 : " + RemoteControl.MAX_VOLUME);
        System.out.println("리모콘 최저 볼륨 : " + RemoteControl.MIN_VOLUME);
    }   // MAIN END
}   // CLASS END
