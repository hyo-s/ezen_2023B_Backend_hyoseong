package day22;  // PACKAGE NAME

public class Step3 {    // CLASS START
    public static void main(String[] args) {

        // 1. 대리점 객체 생성
        HomeAgency 상록수대리점 = new HomeAgency();
        // 2. 렌탈 요청
        Home home = 상록수대리점.rent();
            // 반환 : new Home()
        // 3. 렌탈된 객체 이벤트 실행
        home.turnOnLight();
            // new Home().turnOnLight()

        // 1. 대리점 객체 생성
        CarAgency 중앙대리점 = new CarAgency();
        // 2. 렌탈 요청
        Car2 car2 = 중앙대리점.rent();
            // 반환 : new Car2();
        // 3. 렌탈된 객체 이벤트 실행
        car2.run();
            // new Car2().run()

        // =============== 인터페이스로 할 경우 ===============
        // 1. 대리점 객체 생성
        Rentable<Home> 상록수대리점2 = new HomeAgency();
        // 2. 렌탈 요청
        Home home2 = 상록수대리점2.rent();
        // 반환 : new Home()
        // 3. 렌탈된 객체 이벤트 실행
        home.turnOnLight();
        // new Home().turnOnLight()
    }
}   // CLASS END
