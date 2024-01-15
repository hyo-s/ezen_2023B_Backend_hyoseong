package day10;  // PACKAGE NAME

import java.util.Arrays;

public class Computer { // CLASS START
    // 클래스 멤버
    // 1. 필드
    // 2. 생성자
    // 3. 메소드
        // 0. 고정길이 매개변수
    int sum2(int x, int y){
        int result = x+y;
        return result;
    }
        // 1. 가변길이 매개변수
    int sum(int...values){
        System.out.println("values = " + values);
        System.out.println("Arrays.toString(values) = " + Arrays.toString(values));
        int sum = 0;
        for(int i=0; i<values.length; i++){
            sum += values[i];
        }
        return sum;
    }
        // 2. 배열 매개변수
    int sum3(int[] vlaues){
        System.out.println("vlaues = " + Arrays.toString(vlaues));
        return 0;
    }
}   // CLASS END
