package 과제.과제7; // PACKAGE NAME

public class Controller {   // CLASS START
    // 싱글톤 필드
    private static Controller controller = new Controller();

    // 싱글톤 생성자
    private Controller(){}

    // 싱글톤 메소드
    public  static Controller getInstance(){
        return controller;
    }

    public boolean signup(MemberDto memberDto){
        boolean result = MemberDao.getInstance().signup(memberDto);
        return result;
    }

    public boolean login(MemberDto memberDto){
        boolean result = MemberDao.getInstance().login(memberDto);
        return result;
    }

    public boolean findId(MemberDto memberDto){
        boolean result = MemberDao.getInstance().findId(memberDto);
        return result;
    }

    public boolean findPw(MemberDto memberDto){
        boolean result = MemberDao.getInstance().findPw(memberDto);
        return result;
    }
}   // CLASS END
