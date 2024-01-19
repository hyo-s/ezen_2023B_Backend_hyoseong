package day14;  // PACKAGE NAME

public class Step3 {    // CLASS START
    public static void main(String[] args) {    // MAIN START

        // 객체 생성
        Car myCar = new Car();  // myCar.tire = null;
        // myCar.run(); // null 참조값이 없다. -> (.) 도트연산자 사용불가.
        // .NullPointException

        // 객체
        Car yourCar = new Car();
        yourCar.tire = new Tire();
        yourCar.run();  // System.out.println("일반 타이어가 회전합니다.");

        // 2.객체의 필드 값 수정 => 타이어 장착
        myCar.tire = new Tire();    // myCar.tire = Tire 객체 참조;
        myCar.run();    // System.out.println("일반 타이어가 회전합니다.");

        // ========== 필드 다형성 : 필드가 지나고 있는 객체 참조의 타입을 변경 ========== //
        myCar.tire = new HankookTire(); // myCar.tire = HankookTire 객체참조;
        myCar.run();    // System.out.println("한국타이어가 회전합니다.");

        myCar.tire = new KumhoTire();   // myCar.tire = KumhoTrie 객체참조;
        myCar.run();    // System.out.println("금호타이어가 회전합니다.");


    }   // MAIN END
}   // CLASS END
