package 과제.과제7; // PACKAGE NAME

public class Controller {   // CLASS START

// ==================================== 싱글톤 ==================================== //
    private static Controller controller = new Controller();    // 싱글톤 필드
    private Controller(){}  // 싱글톤 생성자
    public  static Controller getInstance(){
        return controller;
    }   // 싱글톤 메소드

// ==================================== 회원가입 ==================================== //
    public boolean signup(MemberDto memberDto){ // METHOD SIGNUP START
        boolean result = MemberDao.getInstance().signup(memberDto);
        return result;
    }   // METHOD SIGNUP END
// ==================================== 로그인 ==================================== //
    public boolean login(MemberDto memberDto){  // METHOD LOGIN START
        boolean result = MemberDao.getInstance().login(memberDto);
        return result;
    }   // METHOD LOGIN END
// ==================================== 아이디 찾기 ==================================== //
    public boolean findId(MemberDto memberDto){ // METHOD FINDID START
        boolean result = MemberDao.getInstance().findId(memberDto);
        return result;
    }   // METHOD FINDID END
// ==================================== 비밀번호 찾기 ==================================== //
    public boolean findPw(MemberDto memberDto){ // METHOD FINDPW START
        boolean result = MemberDao.getInstance().findPw(memberDto);
        return result;
    }   // METHOD FINDPW END
}   // CLASS END
