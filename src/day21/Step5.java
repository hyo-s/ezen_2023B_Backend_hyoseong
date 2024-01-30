package day21;  // PACKAGE NAME

import java.awt.*;

public class Step5 {    // CLASS START
    public static void main(String[] args) {    // MAIN START

        // [우리가 만든] 버튼 객체 생성
        Button button = new Button();

        // [우리가 만든] 추상메소드 정의
        button.setClickListener(new Button.ClickListener() {
            @Override
            public void onClick() {
                System.out.println("[익명 구현객체를 이용한] OK 버튼을 클릭했습니다.");
            }
        });

        // 만익 익명 구현 객체가 없을 때
            // 1. 구현 클래스 선언
        Button.ClickListener cl = new Click();
            // 2. 구현 객체 만들어서 사용
        button.setClickListener(cl);
    }   // MAIN END
}   // CLASS END
