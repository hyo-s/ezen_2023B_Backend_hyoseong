package day10;  // PACKAGE NAME

public class Step3 {    // CLASS START
    public static void main(String[] args) {    // MAIN START

        // p. 237
            // 1. 객체 생성
        Car myCar = new Car();
            // 2. 필드에 5 저장
        myCar.setGas(5);
            // vs
            //myCar.gas = 5;

        if(myCar.isLeftGas()){
            System.out.println("출발합니다.");
            myCar.run();
        }
        System.out.println("gas를 주입하세요.");
    }   // MAIN END
}   // CLASS END
