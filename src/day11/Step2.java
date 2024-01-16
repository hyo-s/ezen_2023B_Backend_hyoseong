package day11;  // PACKAGE NAME

public class Step2 {    // CLASS START
    public static void main(String[] args) {    // MAIN START

        // 객체 생성
        Car myCar = new Car();

        //speed 필드가 private이므로 외부에서 접근 불가능
        //myCar.speed = -50;

        // 메소드를 이용한 speed 필드에 접근
        myCar.setSpeed(-50);    // 유효성검사
        System.out.println("현재 속도 : " + myCar.getSpeed());

        myCar.setSpeed(60);
        System.out.println("현재 속도 : " + myCar.getSpeed());

        // 만약에 car 객체의 stop필드가 false이면
        if(!myCar.isStop()){
            myCar.setStop(true);    // 멈춤
        }
        System.out.println("현재속도 : " + myCar.getSpeed());

    }   // MAIN END
}   // CLASS END
