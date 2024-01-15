package day10;

import java.util.Random;

public class 캐릭터 {

    // 클래스 구성멤버
    // 1. 필드
    String 닉네임;
    String 직업 = "초보자";
    int 레벨 = 1;
    int 체력 = 100;

    // 2. 생성자
    캐릭터(String 닉네임){
        this.닉네임 = 닉네임;
    }
    // 3. 메소드
    void 공격( ){
        Random random = new Random();
        // 랜덤으로 체력감소
        this.체력 -= random.nextInt(10);
        return; // 생략 가능
    }
    // 객체의 필드 확인용 메소드
        // 오른쪽 클릭 -> 생성 -> toString( )
    @Override
    public String toString() {
        return "캐릭터{" +
                "닉네임='" + 닉네임 + '\'' +
                ", 직업='" + 직업 + '\'' +
                ", 레벨=" + 레벨 +
                ", 체력=" + 체력 +
                '}';
    }
}
