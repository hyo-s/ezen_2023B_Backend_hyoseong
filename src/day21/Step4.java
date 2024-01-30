package day21;  // PACKAGE NAME

public class Step4 {    // CLASS START
    public static void main(String[] args) {    // MAIN START

        // 1.
        Home home = new Home();

        // 2. 매개변수에 익명 구현객체 대입
        home.use3(new RemoteControl() {
            @Override
            public void turnOn() {
                System.out.println("난방을 켭니다.");
            }

            @Override
            public void turnOff() {
                System.out.println("난방을 켭니다.");
            }
        });

    }   // MAIN END
}   // CLASS END
