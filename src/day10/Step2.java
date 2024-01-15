package day10;  // PACKAGE NAME

public class Step2 {    // CLASS START
    public static void main(String[] args) {    // MAIN START
        
        // p.234 : 가변길이 매개변수
            // 메소드를 호출할 때에는 매개변수의 개수에 맞게 매개 값을 제공
            // 가변길이 매개변수를 가지고 있다면 개수와 상관없이 매개값을 줄 수 있다.
        
        // 다른 클래스에 있는 메소드를 사용하고 싶을때.
            // 1. 객체 생성
        Computer myCom = new Computer();
            // 2. 메소드 호출
        int result0 = myCom.sum2(1,2);
        System.out.println("result0 = " + result0);

        int result1 = myCom.sum(1,2,3);
        System.out.println("result1 = " + result1);

        int result2 = myCom.sum(1,2,3,4,5);
        System.out.println("result2 = " + result2);
        
        int[] values = { 1, 2, 3, 4, 5};
        int reult3 = myCom.sum(values);
        System.out.println("reult3 = " + reult3);
        
        int result4 = myCom.sum(new int[]{1,2,3,4,5});
        System.out.println("result4 = " + result4);

        // vs
        int result5 = myCom.sum(values);
        System.out.println("result5 = " + result5);

        // int result6 = myCom.sum3(1,2,3);

    }   // MAIN END
}   // CLASS END