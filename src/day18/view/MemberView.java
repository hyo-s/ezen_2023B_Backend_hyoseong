package day18.view; // PACKAGE NAME

import day18.controller.MemberController;
import day18.model.dto.MemberDto;

import java.util.Scanner;

public class MemberView {   // CLASS START
// ================================= 싱글톤 ================================= //
    // ===== 생성자
    private MemberView(){ }
    // ===== 필드
    private static MemberView memberView = new MemberView();
    // ===== 메소드
    public static MemberView getInstance(){
        return memberView;
    }
// ================================= 메소드 ================================= //
    // ============== 회원가입 SIGNUP ============== //
    public void signup(){   // SIGNUP METHOD START
        // Scanner scanner = new Scanner(System.in);
        // Scanner scanner = MainView.getInstance().scanner;

        // 1. 입력받기
        System.out.print("아이디> ");
        String id = MainView.getInstance().scanner.next();
        System.out.print("비밀번호> ");
        String pw = MainView.getInstance().scanner.next();
        System.out.print("전화번호> ");
        String phone = MainView.getInstance().scanner.next();

        // 2. 객체화
        MemberDto memberDto = new MemberDto(id, pw, phone);

        // 3. 컨트롤러에게 전달
        int result = MemberController.getInstance().signup(memberDto); // 0:성공, 1:DB오류, 2:아이디중복 3~:각 필드별 유효성 검사 실패

        // 4. 결과에 따른 출력
        if(result==0){
            System.out.println("<안내> 회원가입 성공");
        }else if(result==1){
            System.out.println("<안내> 시스템 내부 오류 관리자에게 문의");
        }else if(result==2){
            System.out.println("<안내> 사용중인 아이디 입니다");
        }

    }   // SIGNUP METHOD END

    // ============== 로그인 LOGIN ============== //
    public void login(){    // LOGIN METHOD START

        // 1. 입력
        System.out.print("아이디> ");
        String id = MainView.getInstance().scanner.next();
        System.out.print("비밀번호> ");
        String pw = MainView.getInstance().scanner.next();

        // 2. 객체화
        MemberDto memberDto = new MemberDto();
        memberDto.setMid(id);
        memberDto.setMpw(pw);

        // 3. 전달 후 결과
        boolean result = MemberController.getInstance().login(memberDto);

        // 4. 결과 출력
        if(result){
            System.out.println("<안내> 로그인 성공");
            // 게시판 화면으로 이동할 예정 <페이지 전환>
            BoardView.getInstance().run();
        }else {
            System.out.println("<안내> 로그인 실패");
        }

    }   // LOGIN METHOD END

}   // CLASS END
