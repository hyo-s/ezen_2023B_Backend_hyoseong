package day18.view; // PACKAGE NAME

import 팀과제.팀과제4.Main;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MainView { // CLASS START

// ================================= Scanner ================================= //
    Scanner scanner = new Scanner(System.in);
// ================================= 싱글톤 ================================= //
        // 단 한 개의 객체만 생성해서 사용 하고싶으면 싱글톤
        // 사용하는 이유
            // 1. 메모리 낭비를 방지할 수 있다.
                //
            // 2. 데이터 공유가 쉽다.
                // - 다른 클래스들 간의

    // ===== 생성자
    private MainView(){ }
    // ===== 필드
    private static MainView mainView = new MainView();
    // ===== 메소드
    public static MainView getInstance(){
        return mainView;
    }
// ================================= RUN 메소드 ================================= //
        public void run(){  // RUN METHOD START

        while (true){   // WHILE START
            System.out.println("================== 메인페이지 ==================");
            System.out.println("1.회원가입 | 2.로그인");

                // 만약 TRY{ }에서 예외가 발생하면 CATCH 이동
            try {

                System.out.print("선택> ");
                int ch = scanner.nextInt();

                if(ch==1){
                    MemberView.getInstance().signup();
                }else if(ch==2){
                    MemberView.getInstance().login();
                }else{
                    System.out.println("안내> 알 수 없는 기능 번호입니다.");
                }

            }catch (InputMismatchException e){  // InputMismatchException CATCH

                // INPUT 타입 오류 // InputMismatchException 다른 값을 입력했을 때
                System.out.println(e);
                scanner = new Scanner(System.in);
                System.out.println("안내> 숫자를 입력해주세요.");
                    // 입력 객체 내 입력받은 필드/바이트 초기화

            }catch (Exception e){       //  Exception CATCH

                // 그외 : 실행 테스트 하면서 오류 확인 후 추후에 업데이틑 할 예정
                System.out.println(e);

            }

        }   // WHILE END
    }   // RUN METHOD END
}   // CLASS END
