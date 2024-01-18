package day13;  // PACKAGE NAME

public class Step2 {    // CLASS START
    public static void main(String[] args) {    // MAIN START

        int r = 10;

        // 1. 상위 클래스로 객체 생성해서 메소드 호출 시
        Calculator calculator = new Calculator();
        System.out.println("원 면적 : " + calculator.areaCircle(r));

        // 2. 하위 클래스로 객체 생성해서 메소드 호출 시
        Computer computer = new Computer();
        System.out.println("원 면적 : " + computer.areaCircle(r));

    }   // MAIN END
}   // CLASS END
