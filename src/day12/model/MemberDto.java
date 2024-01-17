package day12.model;    // PACKAGE NAME

// DTO : 데이터 이동 객체 ( 로직X )
    // 복잡한 로직을 하는 곳이 아니다. 단순 데이터 이동 위한 객체
    // 1. 저장할 필드 선정, 권장 PRIVATE
    // 2. 생성자 (개발자 용도에 따라 선언), 권장 : 기본생성자, 풀 생성자
    // 3. 메소드 (형변환, 호출), 권장 : SETTER/GETTER, toString

public class MemberDto {    // CLASS START

// ==================================== 필드 ==================================== //
    // 1. 필드
    private int no;         // 회원번호
    private String id;
    private String pw;
    private String name;
    private String phone;

// ==================================== 생성자 ==================================== //
    // 2. 생성자
        // 1. 기본생성자
    public MemberDto(){}

        // 2. 풀(모든 필드의 매개변수가 존재하는) 생성자
            // 우클릭 -> 생성 -> 생성자 -> 선택한 필드 만큼의 생성자를 자동
    public MemberDto(int no, String id, String pw, String name, String phone) {
        this.no = no;
        this.id = id;
        this.pw = pw;
        this.name = name;
        this.phone = phone;
    }

// ==================================== METHOD ==================================== //
    // 3. 메소드
        // 1. SETTER, GETTER (필드가 PRIVATE일 경우 필수)
            // 우클릭 -> 생성 -> getter/setter -> 선택한 필드 만큼의 자동 생성
        // 2. toString() : 객체 필드 정보 확인차 주로 사용 목적 ( 객체 호출 시 주소값 대신 필드의 정보 호출하는 함수 )
            // 우클릭 -> 생성 -> toString -> 선택한 필드 만큼의 자동 생성

// ==================================== METHOD ( toString ) ==================================== //
    @Override
    public String toString() {
        return "MemberDto{" +
                "no=" + no +
                ", id='" + id + '\'' +
                ", pw='" + pw + '\'' +
                ", name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }

// ==================================== METHOD ( SETTER / GETTER ) ==================================== //
    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

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
}   // CLASS END
