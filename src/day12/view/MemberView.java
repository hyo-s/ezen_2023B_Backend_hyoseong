package day12.view;     // PACKAGE NAME

import day12.controller.MemberController;
import day12.model.MemberDao;
import day12.model.MemberDto;

import javax.swing.*;
import java.util.Scanner;

// VIEW : 화면구현 ( 입출력 )
public class MemberView {   // CLASS START

// ==================================== SINGLETON ==================================== //
    private MemberView(){}
    private static MemberView memberView = new MemberView();
    public static MemberView getInstance(){return memberView;}

// ==================================== METHOD SIGNUP ==================================== //
    // 1. 회원가입 메소드
    public void signup(){       // METHOD SIGNUP START
        System.out.println("[1]MemberView.signup");    // 호출이 잘 되었는지
        // MainView.getInstance() : 싱글톤 (미리 만들어진 단 하나의 객체) 호출
            // String id = MainView.getInstance().scanner.next(); 한줄
        Scanner scanner = MainView.getInstance().scanner;
            // Scanner를 가져오는데 MainView 객체에서 선언해놨기 때문에 거기에서 가져온다.
            // 그런데 MainView 객체는 접근제한이 걸려있기 때문에 getInstance() 메소드를 통해 접근한다.

        // 1. 입력받기
        System.out.print("아이디 > ");
        String id = scanner.next();
        System.out.print("비밀번호 > ");
        String pw = scanner.next();
        System.out.print("이름 > ");
        String name = scanner.next();
        System.out.print("전화 > ");
        String phone = scanner.next();

        // 2. 객체화
        // 새로운 MemberDto 객체를 만드는데 매개변수는 입력받은 ID, PW, NAME, PHONE 이다.
        MemberDto memberDto = new MemberDto(0, id, pw, name, phone);
        System.out.println(memberDto.toString());   // 객체를 확인하자.

        // 3. 객체를 컨트롤에게 전달(매개변수/회원가입 필요한 정보·객체)후 처리 결과(리턴)를 받기
            // 처리 결과(리턴/회원가입 처리 결과(T/F) · BOOLEAN)를 받기
            // MemberController 객체에 매개변수가 memberDto인 signup() 메소드를 호출하려는데 제한이 걸려있어 getInstance() 메소드를 사용하여 접근을 한다.
            // 를 타입이 Boolean인 result로 저장한다.
        Boolean result = MemberController.getInstance().signup(memberDto);

        // 4. 결과에 따른 출력문 만들기
        if(result){
            System.out.println("안내] 회원가입 성공!");
        }else{
            System.out.println("안내] 회원가입 실패!");
        }
    }   // METHOD SIGNUP END
// ==================================== METHOD LOGIN ==================================== //
    // 로그인 메소드
    public void login(){
        System.out.println("[1]MemberView.login");

        // 1. 입력받기
        System.out.print("아이디 : ");
        String id = MainView.getInstance().scanner.next();
        System.out.print("비밀번호 : ");
        String pw = MainView.getInstance().scanner.next();

        // 2. 객체 vs 2개 문자열
        MemberDto memberDto = new MemberDto();
        memberDto.setId(id);
        memberDto.setPw(pw);

        // 3. 컨트롤에게(로그인에 필요한 정보) 전달하고 결과(boolean) 받기
        boolean result = MemberController.getInstance().login(memberDto);
        System.out.println("[5]result = " + result);

        // 4. 결과에 따른 처리
        if(result){
            System.out.println("안내] 로그인 성공!");
            // 로그인 성공시 사용할 서비스의 view로 이동.
        }else{
            System.out.println("안내] 로그인 실패!");
        }
    }
}   // CLASS END
