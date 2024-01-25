package day18;  // PACKAGE NAME

import day18.view.MainView;

public class Application {  // CLASS START
    public static void main(String[] args) {    // MAIN START

        // 3. 싱글톤 호출
        MainView.getInstance().run();

    }   // MAIN END
}   // CLASS END
/*

    다른 혹은 외부 클래스 내 메소드를 호출하는 방법

    // 1. 인스턴스 메소드
    MainView mainView = new MainView();
    mainView.run();

    // 2. 인스턴스 메소드
    new MainView().run();

    // 3. 싱글톤
    MainView.getInstance().run();

    // 4. 정적 메소드
    MainView.run();

*/