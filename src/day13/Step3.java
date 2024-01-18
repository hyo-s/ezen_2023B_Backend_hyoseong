package day13;  // PACKAGE NAME

public class Step3 {    // CLASS START
    public static void main(String[] args) {    // MAIN START

        // p.298
            // 1. 자식객체를 만들면 부모객체도 같이 만들어진다.
        SupersonicAirplane sa = new SupersonicAirplane();
            // 2. 자식객체는 부모객체 멤버를 사용할 수 있다.
        sa.takeOff();
        // 단 자식객체가 부모객체 메소드를 재정의(오버라이딩) 했을 때 본인객체가 우선
        sa.fly();
            // 3. 상수(static) 호출 시 객체가 필요 없음. 클래스명.static 필드
            // 클래스명.static 필드
        sa.flyMode = SupersonicAirplane.SUPERSONIC;
        sa.fly();
            // 4.
        sa.flyMode = SupersonicAirplane.NORMAL;
        sa.fly();
            // 5.
        sa.land();


    }   // MAIN END
}   // CLASS END
