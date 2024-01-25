package day18.controller;   // PACKAGE NAME

import day18.model.dao.MemberDao;
import day18.model.dto.MemberDto;
import day18.view.MemberView;

public class MemberController { // CLASS START
// ================================= 싱글톤 ================================= //
    // ===== 생성자
    private MemberController(){ }
    // ===== 필드
    private static MemberController memberController = new MemberController();
    // ===== 메소드
    public static MemberController getInstance(){
        return memberController;
    }
// ================================= 메소드 ================================= //
    // ============== 회원가입 SIGNUP ============== //
    public int signup(MemberDto memberDto){   // SIGNUP METHOD START

        // 1. 반환변수
        int result = 0;

        // 3. 가공처리/로직
            // 1. 만약에 입력받은 아이디의 길이가 8글자 미만이면 실패
//        if(memberDto.getMid().length() < 8){
//            return  3;
//        }
            // 2. 아이디 중복검사 [ 입력받은 DTO 내 입력받은 아이디만 전달 ]
        if(MemberDao.getInstance().idCheck(memberDto.getMid())){
            return 2;
        }
            // 3. 회원가입 요청
        result = MemberDao.getInstance().signup(memberDto);

        // 2. 반환
        return result;

    }   // SIGNUP METHOD END

    // 로그인 상태를 저장하는 필드 [ boolean true/false , String ID/null, int 회원번호/0 ]
    int loginMno = 0; // 로그인을 안했다는 뜻

    // ============== 로그인 LOGIN ============== //
    public boolean login(MemberDto memberDto){  // LOGIN METHOD START
        boolean result = false; // 로그인 실패

        // DAO에게 LOGIN 처리 요청하고 결과 받기
        result = MemberDao.getInstance().login(memberDto);

        // 만약에 LOGIN 성공이면 상태 변경
        if(result){
            // LOGIN 성공한 회원번호 DNO 요청
            loginMno = MemberDao.getInstance().findMno(memberDto.getMid());
        }

        return result;
    }   // LOGIN METHOD END

    // ============== 로그아웃 LOGOUT ============== //
    public void logout(){   // LOGOUT METHOD START
        loginMno = 0;
    }   // LOGOUT METHOD END

}   // CLASS END
