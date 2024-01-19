package 과제.과제7; // PACKAGE NAME

import java.util.ArrayList;

public class MemberDao {    // CLASS START

// ==================================== 싱글톤 ==================================== //
    private static MemberDao memberDao = new MemberDao();   // 싱글톤 필드
    private MemberDao(){}   // 싱글톤 생성자
    public  static MemberDao getInstance(){
        return memberDao;
    }   // 싱글톤 메소드
// ==================================== 배열 ==================================== //

    ArrayList<MemberDto> memberDtos = new ArrayList<>();

// ==================================== 회원가입 ==================================== //
    public boolean signup(MemberDto memberDto){ // METHOD SIGNUP START
        memberDtos.add(memberDto);
        return true;
    }   // METHOD SIGNUP END
// ==================================== 로그인 ==================================== //
    public boolean login(MemberDto memberDto){  // METHOD LOGIN START
        for(int i=0; i<memberDtos.size(); i++){
            if (memberDtos.get(i).getId().equals(memberDto.getId())){
                if (memberDtos.get(i).getPw().equals(memberDto.getPw())){
                    return true;
                }
            }
        }
        return false;
    }   // METHOD LOGIN END
// ==================================== 아이디 찾기 ==================================== //
    public boolean findId(MemberDto memberDto){ // METHOD FINDID START
        for(int i=0; i<memberDtos.size(); i++){
            if (memberDtos.get(i).getName().equals(memberDto.getName())){
                if (memberDtos.get(i).getPhone().equals(memberDto.getPhone())){
                    return true;
                }
            }
        }
        return false;
    }   // METHOD FINDID END
// ==================================== 비밀번호 찾기 ==================================== //
    public boolean findPw(MemberDto memberDto){ // METHOD FINDPW START
        for(int i=0; i<memberDtos.size(); i++){
            if (memberDtos.get(i).getId().equals(memberDto.getId())){
                if (memberDtos.get(i).getPhone().equals(memberDto.getPhone())){
                    return true;
                }
            }
        }
        return false;
    }   // METHOD FINDPW END
}   // CLASS END
