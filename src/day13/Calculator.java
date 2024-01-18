package day13;  // PACKAGE NAME

public class Calculator {   // CLASS START
    // 부모객체 자식객체
        // 자식객체에서 객체가 생성이 되면 부모객체에서도 같은 객체가 생성된다.
        // 하지만 부모객체에서 객체를 생성하면 자식개체에서는 생성되지 않는다.

    // 메소드
    public double areaCircle(double r){
        System.out.println("Calculator 객체의 areaCircle() 실행");
        return 3.14159 * r * r;
    }

}   // CLASS END
