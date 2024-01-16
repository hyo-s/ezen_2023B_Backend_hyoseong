package day11;  // PACKAGE NAME

public class Step1 {    // CLASS START
    public static void main(String[] args) {    // MAIN START

        // 1. 객체 생성
        Korean k1 = new Korean("123456-1234567", "김자바");

        // 2. 필드 호출
        System.out.println(k1.nation);
        System.out.println(k1.ssn);
        System.out.println(k1.name);

        // 3. 필드의 값 수정
        // k1.nation = "USA"; // final 초기화 이후 수정불가
        // k1.ssn = "123-12-1234";
        k1.name = "김자바";

        // 4. 상수호출
        System.out.println(Korean.EARTH_RADIUS);
        System.out.println(Korean.EARTH_SURFACE_AREA);
    }   // MAIN END
}   // CLASS END
