package day21;  // PACKAGE NAME

import day15.Cat;

public class Step3 {    // CLASS START
    public static void main(String[] args) {    // MAIN START

        Car car = new Car();

        car.run1();

        car.run2();

        // 매개변수에 익명 자식객체를 대입
        car.run3(new Tire(){
            @Override
            public void roll() {
                System.out.println("기아타이어가 굴러갑니다.");
            }
        });

        // 1.
        Tire tire = new Tire(){
            // ========== Tire 클래스로부터 자동 상속 받은 객체 정의 ========== //
            // class 자식클래스명 extends Tire{ }

            // 필드 생성 가능
            int a = 10;

            // 생성자 X

            // 메소드 생성 가능
            public void method1(){
                System.out.println("ddd");
            }
            @Override
            public void roll() {
                System.out.println("기아 타이어가 굴러갑니다.2");
            }
        };
        // 2.
        car.run3(tire);

    }   // MAIN END
}   // CLASS END
