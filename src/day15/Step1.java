package day15;  // PACKAGE NAME

import day13.step4.package2.D;

public class Step1 {    // CLASS START
    public static void main(String[] args) {    // MAIN START

        // 1. 드라이버 객체 생성
        Driver driver1 = new Driver();   // 사람생성
        Driver driver2 = new Driver();   // 사람생성 ( 총 2명 )

        // 2. 버스 객체 생성
        Bus bus = new Bus();
            // Driver 객체에 drive 메소드에 매개변수 bus를 넣는다.
        driver1.drive(bus);

        // 3. 택시 객체 생성
        Taxi taxi1 = new Taxi();    // 택시A 생성
        driver1.drive(taxi1);       //운전자1 택시A 운행

        driver2.drive(taxi1);       // 운전자2 택시A 운행
        Taxi taxi2 = new Taxi();    // 택시B 생성
        driver1.drive(taxi2);       // 운전자2 택시B 운행

    }   // MAIN END
}   // CLASS END