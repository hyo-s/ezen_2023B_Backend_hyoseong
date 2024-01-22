package day15;  // PACKAGE NAME

public class Driver {   // CLASS START  // 운전자(사람)

    // 메소드 ( 객체의 행위 ) 매개변수로 동작할 매개체 ( 버스 / 택시 )
        // 버스와 택시를 모두 매개변수로 받고 싶을때 상위 클래스
    public void drive(Vehicle vehicle){
        vehicle.run();
        // 자식타입으로 다시 변환 ( 강제타입 = 캐스팅 )
        // !!!  instanceof 연산자
        // 변수명 instanceof 타입
            // Vehicle 객체의 매개변수 Bus
        System.out.println(vehicle instanceof Bus ? "<버스타입입니다>" : "<택시타입입니다>");
        System.out.println(vehicle instanceof Taxi ? "<택시타입입니다.>" : "<버스타입입니다.>");
            // Object 가장 상위
        System.out.println(vehicle instanceof Object);

        Bus bus2 = new Bus();   // 자식 객체는 생성 시 부모 객체도 먼저 생성한다.
        System.out.println(bus2 instanceof Vehicle);
            // Object : 자바의 모든 클래스의 최상위 부모
        System.out.println(vehicle instanceof Object);
    }

}   // CLASS END
