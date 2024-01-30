package day21;  // PACKAGE NAME

import day14.KumhoTire;

public class Car {  // CLASS START

    // 필드에 Tire 객체 대입
    private Tire tire1 = new Tire();

    // 익명 자식 객체
        // 상속 하거나 인터페이스 구현일 경우
        // 단일 자식객체 만들 때 주로 사용
        // 자식객체 : private Tire tire2 = new KumhoTire();
        // 익명 자식 객체 : private tire tire2= new Tire(){ 재정의 };
            // 클래스가 없다 -> 설계도 없다 -> 재사용 불가능 -> 단일 자식 객체
    // 필드
        // 필드에 익명 자식객체를 대입한다.
    private Tire tire2 = new Tire(){
        @Override
        public void roll() {
            System.out.println("금호타이어가 굴러갑니다.");
        }
    };

    // 메소드 [ 필드 이용 ]
    public void run1(){
        tire1.roll();
        tire2.roll();
    }

    // 메소드 [ 로컬 변수 이용 ]
        // 지역변수에 익명 자식객체를 대입한다.
    public void run2(){
        Tire tire = new Tire(){
            int speed = 0;
            @Override
            public void roll() {
                System.out.println("한국 타이어가 굴러갑니다.");
            }
        };
        tire.roll();
    }

    // 메소드 [ 매개변수 이용 ]
        // 매개변수에 익명 자식객체를 대입한다.
    public void run3(Tire tire){
        tire.roll();
    }

}   // CLASS END
