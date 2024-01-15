package day10;  // PACKAGE NAME

public class Step1 {    // CLASS START
    public static void main(String[] args) {    // MAIN START

        //1. 객체 생성
            // 클래스명 변수명 = new 클래스명( );
        캐릭터 user1 = new 캐릭터("자바맨");
        System.out.println("user1 = " + user1);

        캐릭터 user2 = new 캐릭터("클래스맨");
        System.out.println("user2 = " + user2);

        // 2. 필드사용
            user1.직업 = "마법사";
        System.out.println("user2.toString(user2) = " + user2.toString());
            user2.직업 = "전사";
        System.out.println("user2.toString() = " + user2.toString());

        // 3. 메소드 호출
            user1.공격();
        System.out.println("user1.toString() = " + user1.toString());
            user2.공격();
        System.out.println("user2.toString() = " + user2.toString() );
    }   // MAIN END
}   // CLASS END
