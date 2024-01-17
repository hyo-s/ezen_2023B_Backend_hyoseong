package day12;  // PACKAGE NAME

import day12.view.MainView;

// ==================================== 실행 ==================================== //
// 실행클래스 :
public class Application {  // CLASS START
    public static void main(String[] args) {    // MAIN START
        // 다른 클래스의 메소드를 호출하는 방법
        // 1. 해당 메소드가 인스턴스 메소드일 경우
        // new MainView().run();

        // 2. 해당 메소드가 인스턴스 메소드일 경우
        // MainView mainView = new MainView();
        // mainView.run();

        // 3. 만약에 해당 메소드가 정적(STATIC)일 경우
        // MainView.run();

        // 4. 싱글톤
        MainView.getInstance().run();

    }   // MAIN END
}   // CLASS END

/*
    소프트웨어 개발시 사용되는 디자인패턴 MVC
        MVC : 사용자 인터페이스, 데이터 및 논리제어 구현하는데 있어 사용되는 패턴
            관심사 분리해서 (*) 업무의 분리와 향상된 관리
        M : MODEL       : JAVA, DB          : 데이터 객체
            DAO : 데이터 접근 객체 ( DATA ACCESS OBJECT )
            DTO : 서로 다른 레이어 / 계층간에 이동하는 객체  ( DATA TRANSFER OBJECT )
                사이를 왔다갔다 하는 애
            VO : 불변 데이터 객체 / 수정금지 ( VALUE OBJECT )
        v : VIEW        : HTML, CSS, JS     : (입출력)화면 구현
        C : CONTROL     : JAVA              : MODEL과 VIEW 중계역할
            CONTROLLER  : 제어역할, 유효성검사
            SERVICE     : 비즈니스 로직 ( 중요기능 로직 )

        사용자(VIEW) ---DTO---> CONTROLLER ---DTO---> DAO ------> DATABASE
        HTML, JS                JAVA                JAVA
*/