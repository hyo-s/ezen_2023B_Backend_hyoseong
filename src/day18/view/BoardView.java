package day18.view; // PACKAGE NAME

import day18.controller.MemberController;

import java.util.Scanner;

public class BoardView {    // CLASS START
// ================================= 싱글톤 ================================= //
    // ===== 생성자
    private BoardView(){ }
    // ===== 필드
    private static BoardView boardView = new BoardView();
    // ===== 메소드
    public static BoardView getInstance(){
        return boardView;
    }
// ================================= 스캐너 ================================= //
    Scanner scanner = MainView.getInstance().scanner;
// ================================= 메소드 ================================= //
    // ============== 로그인 성공시 출력되는 화면 ============== //
    public void run(){  // RUN METHOD START
        while (true){   // WHILE START
            System.out.println("================== 게시판 ==================");
            // 추후에 현재 게시물 출력 자리
            System.out.println("1.글쓰기 | 2.글보기 | 3.로그아웃");
            System.out.print("선택> ");
            int ch = scanner.nextInt();
            if(ch==1){

            }else if(ch==2){

            }else if(ch==3){
                    // 로그아웃 처리 요청
                System.out.println("안내> 로그아웃 합니다.");
                MemberController.getInstance().logout();
                    // 현재 메소드 종료
                return;
            }
        }   // WHILE END
    }   // RUN METHOD END


}   // CLASS END
