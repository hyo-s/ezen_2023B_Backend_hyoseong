package day07;  // PACKAGE NAME

// =================== 클래스 용도 : 2. 실행 클래스 =================== //
public class Step2 {    // CLASS START
    public static void main(String[] args) {    // MAIN START

        //p.215
        // 1. 객체 생성
            // 1. new
        // new
            // 2. 생성자/클래스명
        // new 생성자/클래스명();
            // 3. 변수 생성
        // Car car;
            // +
        Car myCar = new Car();

        // . : 접근 연산자 : 변수가 가지고 있는 주소로 이동
        System.out.println("모델명 = " + myCar.model);
        System.out.println("시동여부 = " + myCar.start);
        System.out.println("현재속도 = " + myCar.speed);

        Car yourCar = new Car();
        System.out.println("모델명 = " + yourCar.model);
        System.out.println("시동여부 = " + yourCar.start);
        System.out.println("현재속도 = " + yourCar.speed);

        // p.217
        // * 필든는 객체의 데이터이므로 객체가 존재하지 않으면 존재하지 않는다.
            // 1. 객체 생성
        Car2 myCar2 = new Car2();
        System.out.println("제작회사 = " + myCar2.company );
        System.out.println("모델명 = " + myCar2.model );
        System.out.println("색깔 = " + myCar2.color );
        System.out.println("최고속도 = " + myCar2.maxSpeed );
        System.out.println("현재속도 = " + myCar2.speed );
        myCar2.speed = 60;
        System.out.println("현재속도2 = " + myCar2);
        // ===============
        Car2 yourCar2 = new Car2();
        System.out.println("제작회사 : " + yourCar2.company);
        System.out.println("현재속도 : " + yourCar2.speed);
            // 리터럴 작성

    }   // MAIN END
}   // CLASS END
