package day11;  // PACKAGE NAME

public class Korean {   // CLASS START
    // 멤버
    // 1. (정적 static / 인스턴스) 필드
        // 1. 인스턴스 final 필드
            // - final : 프로그램 실행 도중에 수정할 수 없게 만드는 키워드
            // 1. 필드 선언시 초기값 대입 // 2. 생성자에서 초기값 대입
    final String nation = "대한민국";
    final String ssn;
    // final String job; // final 초기값이 없을 경우 오류

        // 2. 인스턴스 필드
    String name;
        // 3. 상수 필드 : 불변의 값;
            // - static final
            // - 상수명은 관례적으로 대문자 // 2. 상수선언시 초기값 // 3. 정적블록 초기값 대입
    static final double EARTH_RADIUS = 6400;
    static final double EARTH_SURFACE_AREA;
        // 정적블록 [ static 멤버들의 초기값 대입 ]
    static {
        EARTH_SURFACE_AREA = 4 * Math.PI * EARTH_RADIUS * EARTH_RADIUS;
    }

    // 2. 생성자
    public Korean(String ssn, String name){
        this.ssn = ssn;
        this.name = name;
    }
    // 3. (정적 static / 인스턴스) 필드

}   // CLASS END
