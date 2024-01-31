package day22;  // PACKAGE NAME

public class Step4 {    // CLASS START

    // 제네릭 메소드
    // public static <타입파라미터> 리턴타입 메소드명(매개변수){ }
        // 1. <타입파라미터> : 함수안에서 사용할 타입 파라미터
        // 1. 일반 메소드
    public static boolean boxing1(String s){
        return false;
    }
        // 2. 제네릭 메소드
    public static <T> boolean boxing2(String s){
        T t = null;
        System.out.println(t);
        return false;
    }
        // 3.
//    public static <T> Box3<T> boxing3(String s){
//        Box3<String> box = new Box3<>();
//        return box;
//    }
        // 4.
    public static <T> Box3<T> boxing4(T t){
        Box3<T> box = new Box3<>();
        box.setT(t);
        return box;
    }
    // P.582
        // 제네릭 메소드
    public static < T extends Number > boolean compare( T t1, T t2){
        double v1 = t1.doubleValue();
        double v2 = t2.doubleValue();
        return v1 == v2;
    }

    public static void main(String[] args) {    // MAIN START

        Box3<Integer> box1 = boxing4(100);
        int intValue = box1.getT();

        Box3<String> box2 = boxing4("홍길동");
        String strValue = box2.getT();

        boxing2("안녕하세요");

        Box3<Car> box3 = boxing4(new Car());
        Car carValue = box3.getT();

        // P.582
        boolean result1 = compare(10, 20);
        boolean result2 = compare(4.5, 4.5);
        //  boolean result3 = compare("안녕하세요", new Car());
        //  result4 = compare(new Object(), new Object());
    }   // MAIN END
}   // CLASS END
