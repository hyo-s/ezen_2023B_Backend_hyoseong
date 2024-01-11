package day08;  // PACKAGE NAME

import java.util.Scanner;

public class Step3 {    // CLASS START
    public static void main(String[] args) {    // MAIN START

        Scanner scanner = new Scanner(System.in);

        // 1. 기본생성자는 안됨
        // Korean k1 = new Korean();
        Korean k3 = new Korean();
        System.out.println("k3 = " + k3);
        k3.name="이자바";
        k3.ssn="880423-1234567";
        System.out.println("k3 = " + k3);

        // 1. 정의된 생성자로 객체 생성
        Korean k1 = new Korean("박자바","011225-1234567");
        System.out.println("k1 = " + k1);

        Korean k2 = new Korean("김자바","930525-0654321");
        System.out.println("k2 = " + k2);

    }   // MAIN END
}   // CLASS END
