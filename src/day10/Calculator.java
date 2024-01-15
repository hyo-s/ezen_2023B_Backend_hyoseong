package day10;  // PACKAGE NAME

public class Calculator {   // CLASS START

    // 클래스 멤버
        // 1. (인스턴스 / 정적) 필드
    double pi2 = 3.14159;       // 인스턴스(객체) 필드
    static double pi = 3.14159; // 정적 필드

        // 2. 생성자

        // 3. (인스턴스 / 정적) 필드
    int plus2(int x, int y){
        return x+y;
    }
    static int plus(int x, int y){
        return x+y;
    }
    static int minus(int x, int y){
        return x-y;
    }

}   // CLASS END
