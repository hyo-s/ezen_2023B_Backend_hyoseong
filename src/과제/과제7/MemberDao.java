package 과제.과제7; // PACKAGE NAME

import java.util.ArrayList;

public class MemberDao {    // CLASS START

    // 싱글톤 필드
    private static MemberDao memberDao = new MemberDao();

    // 싱글톤 생성자
    private MemberDao(){}

    // 싱글톤 메소드
    public  static MemberDao getInstance(){
        return memberDao;
    }

    ArrayList<MemberDto> memberDtos = new ArrayList<>();

    public boolean signup(MemberDto memberDto){
        memberDtos.add(memberDto);
        return true;
    }

    public boolean login(MemberDto memberDto){
        for(int i=0; i<memberDtos.size(); i++){
            if (memberDtos.get(i).getId().equals(memberDto.getId())){
                if (memberDtos.get(i).getPw().equals(memberDto.getPw())){
                    return true;
                }
            }
        }
        return false;
    }

    public boolean findId(MemberDto memberDto){
        for(int i=0; i<memberDtos.size(); i++){
            if (memberDtos.get(i).getName().equals(memberDto.getName())){
                if (memberDtos.get(i).getPhone().equals(memberDto.getPhone())){
                    return true;
                }
            }
        }
        return false;
    }

    public boolean findPw(MemberDto memberDto){
        for(int i=0; i<memberDtos.size(); i++){
            if (memberDtos.get(i).getId().equals(memberDto.getId())){
                if (memberDtos.get(i).getPhone().equals(memberDto.getPhone())){
                    return true;
                }
            }
        }
        return false;
    }

}   // CLASS END
