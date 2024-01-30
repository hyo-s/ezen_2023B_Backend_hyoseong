package day21;  // PACKAGE NAME

public class Home {     // CLASS START

    // 1. 필드에 익명 구현 객체 대입
        // 1. 인터페이스는 추상메소드[선언O, 실행X]만 존재하므로 객체 생성 불가.
            // 실행부를 구현 (오버라이딩)
            // 1. 구현클래스 : class 클래스명 implements 인터페이스명{ }
            // 2. 익명 구현 객체 : new 인터페이스명( ){ }
    private RemoteControl rc = new RemoteControl(){

        // 1. 필드 사용 가능
        int a = 0;

        // 2. 생성자 X

        // 3. 메소드
        public void method(){ }

        // 3. * 오버라이딩 필수
        @Override
        public void turnOn() {
            System.out.println("TV를 켭니다.");
        }

        @Override
        public void turnOff() {
            System.out.println("TV를 끕니다.");
        }
    };

    // 2. 지역 변수에 익명 구현 객체 대입
    public void use2(){

        RemoteControl rc = new RemoteControl() {
            @Override
            public void turnOn() {
                System.out.println("TV를 켭니다.");
            }

            @Override
            public void turnOff() {
                System.out.println("TV를 끕니다.");
            }
        };
        rc.turnOn();
        rc.turnOff();
    }

    // 3. 매개변수에 익명 구현 객체 대입
    public void use3(RemoteControl rc){
        rc.turnOn();
        rc.turnOff();
    }
}   // CLASS END
