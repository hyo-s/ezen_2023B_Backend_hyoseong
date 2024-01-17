package day12.view;     // PACKAGE NAME

import com.sun.tools.javac.Main;

import java.util.Scanner;

// VIEW : 화면구현 ( 입출력 )
public class MainView {     // CLASS START

// ==================================== SINGLETON ==================================== //

    /*
        싱글톤 : 프로그램 내 하나의 객체를 사용 패턴

        // 1. 생성자 PRIVATE
        // 2. 필드에 본인 객체를 생성한다. PRIVATE STATIC
        // 3. 객체를 외부로부터 전달하기 위한 함수 getInstance( )

    */
    // PRIVATE 객체 생성
        // 필드인데 정적필드이고 초기화를 새로운 MainView 객체를 생성한다. 인데 접근 제한이 걸려있다.
        // 데이터를 저장하는데 정적으로 데이터를 저장하고 그 데이터는 새로운 MainView 객체를 생성한다. 인데 접근 제한이 걸려있다.
    private static MainView mainView = new MainView();  // 필드
        // 생성자를 선언해주는데 초기화를 함부로 하지 못하게 접근을 제한한다.
        // 필드를 초기화 하는데 함부로 초기화 하지 못하게 접근을 제한한다.
        // 외부에서 생성자를 호출하는 것을 막는다.
    private MainView(){}    // 생성자

        // 접근 제한이 다 걸려있기 때문에 접근 권한을 줘야하는데 이때 getInstance() 메소드를 통해 접근 권한을 준다.
        // getInstance( )가 접근을 하게 해준다.
        // 여기서 리턴은 정적으로 선언한 mainView가 된다. mainView는 새로운 객체를 생성하고 초기화를 하는데 접근제한이 걸려있다.
    public static MainView getInstance(){return mainView;}  // 메소드

// ==================================== 필드 ==================================== //
    // 1.필드
    Scanner scanner = new Scanner(System.in);
    // private static MainView mainView = new MainView();  // 필드
        // 필드랑 지역변수 차이
// ==================================== 생성자 ==================================== //
    // 2.생성자
        // private MainView(){}    // 생성자
// ==================================== METHOD ==================================== //
    // 3.메소드
    // public static void run( ){ }
        // 메소드가 정적(STATIC)일 경우
    // public static MainView getInstance(){return mainView;}  // 메소드

// ==================================== METHOD RUN ==================================== //
    public void run(){  // METHOD START
        while(true){
            System.out.println("======= 메인페이지 ======");
            System.out.println("1.회원가입 | 2.로그인");
            System.out.print("선택> ");
            int ch = scanner.nextInt();
// ============================ 회원가입 ============================ //
            if(ch==1){
                // MemberView 클래스의 signup 메소드를 호출을 하려는데 접근 제한이 걸려있다. getInstance() 메소드를 통해 접근한다.
                MemberView.getInstance().signup();
            }
// ============================ 로그인 ============================ //
            if(ch==2){
                // MemberView 클래스의 login 메소드를 호출을 하려는데 접근 제한이 걸려있다. getInstance() 메소드를 통해 접근한다.
                MemberView.getInstance().login();
            }

        }
    }   // METHOD END
}   // CLASS END
