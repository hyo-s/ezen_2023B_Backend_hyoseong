package day16;  // PACKAGE NAME

public class Step2 {    // CLASS START
    public static void main(String[] args) {    // MAIN START

        // 1.드라이버 객체 생성
        Driver driver = new Driver();

        // 2. 버스와 택시 객체 생성
        Bus bus = new Bus();
        Taxi taxi = new Taxi();

        // 3.Driver 객체에 drive메소드에 매개변수로 버스와 택시를 넣는다.
            // 이게 매개변수의 다형성이다.
            // 그 이유는 BUS 객체와 TAXI 객체가 implements로  Vehicle 인터페이스를 상속하고 있고
            // 인터페이스 Vehicle의 자식인 BUS와 TAXI를 매개변수로 바꿔 쓸 수 있다.
            // 인터페이스 변수는 Drive 클래스에 Vehicle vehicle이고 bus는 구현객체이다.
            // 여기서 자동타입 변환이 들어간다.
        driver.drive(bus);
        driver.drive(taxi);
    }   // MAIN END
}   // CLASS END
