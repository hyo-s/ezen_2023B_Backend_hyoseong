package day16;  // PACKAGE NAME

// 매개변수의 다형성
public class Driver {   // CLASS START

    // 인터페이스 Vehicle 타입으로 매개변수를 선언한다.
    // 인터페이스 Vehicle 추상메소드 run 호출
    // public abstract 생략 가능
    void drive(Vehicle vehicle){
        vehicle.run();
    }
}   // CLASS END
