package day12.controller;   // PACKAGE NAME

import day12.model.MemberDao;
import day12.model.MemberDto;

// CONTROLLER : VIEW와 DAO 중계역할
public class MemberController {     // CLASS START

// ==================================== SINGLETON ==================================== //
    private MemberController(){}
    private  static MemberController memberController = new MemberController();
    public static MemberController getInstance(){return memberController;}

// ==================================== METHOD SIGNUP ==================================== //

    // 1. 회원가입 메소드
    // MemberDto 타입의 memberDto를 매개변수로 선언한다.
    public boolean signup( MemberDto memberDto ){   // METHOD SIGNUP START
        System.out.println("memberDto = " + memberDto); // 매개변수를 잘 받았는지
        System.out.println("[2]MemberController.signup");  // 호출이 잘 되었는지
        // 1. 유효성검사 처리

        // 2. MemberView에서 받은 객체를 MemberDao에게 전달 후 처리 결과를 받기
        boolean result = MemberDao.getInstance().signup(memberDto);
        System.out.println("[4]result = " + result); // 결과를 확인하자
        return result;

    }   // METHOD SIGNUP END

// ==================================== METHOD LOGIN ==================================== //
    // 로그인 했다는 증거. 로그아웃을 하기전까지 [ 아이디 ]
    String loginSession = null; // null이면 비로그인 null 대신에 아이디가 있으면 로그인된 상태

    // 2. 로그인 메소드
    public boolean login(MemberDto memberDto){
        System.out.println("memberDto = " + memberDto); // 매개변수를 잘 받았는지
        System.out.println("[2]MemberController.login"); // 함수가 잘 켜지는지

        boolean result = MemberDao.getInstance().login(memberDto);
        System.out.println("result = " + result);   // 결과를 확인하자

        // 만약에 로그인 성공시 로그인상태 변경
        if(result){
            // 로그인상태 필드에 로그인 성공한 아이디를 대입한다.
            loginSession=memberDto.getId();
        }
        return result;
    }
}   // CLASS END
