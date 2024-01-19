package 과제.과제7; // PACKAGE NAME

public class MemberDto {    // CLASS START

// ==================================== 필드 ==================================== //
    private String id;
    private String pw;
    private String name;
    private String phone;
    private String age;
// ==================================== 생성자 ==================================== //
    public MemberDto( ){ }  // 기본생성자

    public MemberDto(String id, String pw, String name, String phone, String age) { // 풀 생성자
        this.id = id;
        this.pw = pw;
        this.name = name;
        this.phone = phone;
        this.age = age;
    }
// ==================================== 메소드 TOSTRING ==================================== //
    @Override
    public String toString() {
        return "MemberDto{" +
                "id='" + id + '\'' +
                ", pw='" + pw + '\'' +
                ", name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                ", age='" + age + '\'' +
                '}';
    }

// ==================================== 메소드 GETTER / SETTER ==================================== //
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPw() {
        return pw;
    }

    public void setPw(String pw) {
        this.pw = pw;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }
}   // CLASS END

/*
	주제 : 회원제 시스템 part3
	    [ MVC 패턴 ]
 		- MemberDto 외 MVC패턴 사용하기 위해 아래와 같이 클래스 3개를 추가 설계하시오.
 		1.view 클래스
 		2.controller 클래스
 		3.model(dao·dto) 클래스

		[ MemberDto 클래스 ]
 		1. 아래 private 필드를 가지는 클래스를 설계 하시오.
 			필드 : 아이디 , 비밀번호 , 이름 , 전화번호 , 나이
		2. 생성자 사용하시오.
		3. getter , setter 메소드를 사용하시오.

        [ 기능 구현 - 과제6 동일 하며 MVC패턴으로 구현하시오. ]
		1. 초기 메뉴 ( VIEW )
			1. 회원가입 2.로그인 3.아이디찾기 4.비밀번호찾기
		2. 기능 조건 ( CONTROLLER , DAO )
			1. 회원가입 메소드
			2. 로그인 메소드
			3. 아이디찾기 메소드
			4. 비밀번호찾기 메소드
*/



