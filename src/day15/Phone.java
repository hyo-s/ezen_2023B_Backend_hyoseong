package day15;  // PACKAGE NAME

// public class phone{ }
public abstract class Phone {    // CLASS START
    // 추상클래스 : 서로 다른 클래스들의 공통적인 필드 / 메소드를 설계
        // 객체의 목적으로는 사용하지 못한다. new 연산자 X

    // 필드
    String owner;

    // 생성자
    Phone(String owner){
        this.owner = owner;
    }

    // 메소드
    void turnOn(){
        System.out.println("폰 전원을 켭니다.");
    }
    void turnOff(){
        System.out.println("폰 전원을 끕니다.");
    }

}   // CLASS END
