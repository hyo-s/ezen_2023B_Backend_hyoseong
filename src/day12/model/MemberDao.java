package day12.model;    // PACKAGE NAME

import java.util.ArrayList;

// DAO : 데이터베이스 접근 객체
public class MemberDao {    // CLASS START

// ==================================== SINGLETON ==================================== //
    private MemberDao(){}
    private  static MemberDao memberDao = new MemberDao();
    public static MemberDao getInstance(){return memberDao;}

// ==================================== ARRAY( DATABASE ) ==================================== //
    // DB 대신에 배열
        // 고정길이 배열을 가변길이 배열로 구현 => 제공하는 라이브러리/컬렉션(수집) 프레임워크(라이브러리 집합)
        // 컬렉션 프레임워크 : ArrayList 가변길이 배열을 지원하는 클래스
        // ArrayList<여러개저장할객체의타입> 변수명 = new ArrayList(){};
        // 제공하는 함수
            // 요소 저장 : .add(저장할 객체)
            // 요소 개수 : .size( )
            // 요소 호출 : .get(인덱스)
            // 요소 삭제 : .remove(인덱스)
    ArrayList<MemberDto> memberDtos = new ArrayList<>();
    // MemberDto[] memberDtos = new MemberDto[100];
// ==================================== METHOD SIGNUP ==================================== //
    // 1. 회원가입 메소드
    // 타입이 MemberDto인 memberDto를 매개변수로 전달받아서 memberDtos 배열에 추가한다.
    public boolean signup( MemberDto memberDto ){   // METHOD SIGNUP START
        System.out.println("[3]MemberDao.signup"); // 호출이 잘 되었는지
        memberDtos.add(memberDto);
        return true;   // 회원가입 성공
/*
        // 1. 비즈니스 로직
        for(int i=0; i<memberDtos.length; i++){
            if(memberDtos[i]==null){
                memberDtos[i]=memberDto;
                return true;    // 회원가입성공
            }
        }
*/
    }   // METHOD SIGNUP END
// ==================================== METHOD LOGIN ==================================== //
    // 2. 로그인 메소드
    public boolean login( MemberDto memberDto ){
        System.out.println("[3]MemberDao.login"); // 함수가 잘 켜지는지

        // 로그인 처리 : 전체(배열/ArrayList) 회원중에 입력받은 동일한 값이 있는지 확인
        for(int i=0; i<memberDtos.size(); i++){
            // i는 0부터 리스트내 요수 개수까지 1씩 증가
            if(memberDtos.get(i).getId().equals(memberDto.getId())){
                // 리스트 내 i번째 객체의 아이디와 입력받은 아이디(매개변수) 같으면
                if(memberDtos.get(i).getPw().equals(memberDto.getPw())){
                    // 리스트 내 i번째 객체의 비밀번호와 입력받은 비밀번호(매개변수) 같으면
                    return true;    // 로그인 성공
                }
            }
        }
        return false;   // 로그인 실패
    }
}   // CLASS END
