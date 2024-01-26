package day18.view; // PACKAGE NAME

import day13.step4.package2.C;
import day18.controller.BoardController;
import day18.controller.MemberController;
import day18.model.dto.BoardDto;
import day18.model.dto.CategoryDto;
import day18.model.dto.MemberDto;

import java.util.ArrayList;
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

                System.out.println("================== 카테고리 ==================");
                categoryPrint();
                System.out.println();
                System.out.print("선택> ");
                int cno = scanner.nextInt();
                if(cno==1){

                    // 1. 입력
                    System.out.println("게시물 제목을 작성해주세요.");
                    System.out.print("입력> ");
                    String btitle = scanner.next();
                    System.out.println("게시물 내용을 작성해주세요.");
                    System.out.print("입력> ");
                    String bcontent = scanner.next();

                    // 2. 객체화
                    BoardDto boardDto = new BoardDto(btitle, bcontent);
                    boardDto.setMno_fk(cno);

                    // 3. 전달 후 결과
                    boolean writeResult = BoardController.getInstance().write(boardDto);


                    // 4. 결과 출력
                    if(writeResult){
                        System.out.println("게시물 작성이 완료 되었습니다.");
                        // 게시판 화면으로 이동할 예정 <페이지 전환>
                        return;
                    }else{
                        System.out.println("게시물 작성을 취소합니다.");
                    }
                }
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

    // ============== 카테고리 출력 메소드 ============== //
    public void categoryPrint(){
        ArrayList<CategoryDto> categoryList = BoardController.getInstance().CategoryPrint();
        for (int i=0; i<categoryList.size(); i++){
            int bcno = categoryList.get(i).getbCno();
            String bcategory = categoryList.get(i).getBcategory();
            System.out.print(bcno+". "+bcategory+" ");
        }
    }
}   // CLASS END
