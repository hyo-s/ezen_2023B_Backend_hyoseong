package day18.model.dao;    // PACKAGE NAME

import day18.controller.MemberController;
import day18.model.dto.MemberDto;
import day18.view.MemberView;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class MemberDao extends Dao{    // CLASS START

// ================================= 필드 ================================= //
//        // DB 연동관련 인터페이스
//    private Connection conn;  // 여러 메소드에서 사용하려고 필드에 선언 // 1. DB연동객체 connection
//    private PreparedStatement ps; // 2. 작성된 SQL 가지고 있고, 매개변수,  실행 담당 preparedStatement
//    private ResultSet rs;    // 3. SQL 실행 결과 resultSet
// ================================= 싱글톤 ================================= //
    // ===== 생성자
    private MemberDao(){
//        // 객체 생성시 DB 연동
//        try {
//            // 1. MYSQL 회사의 JDBC 관련된 객체를 로딩 JVM에 로딩한다 불러오기
//            Class.forName("com.mysql.cj.jdbc.Driver");
//            // 2. 연동된 결과의 (구현체)객체를 Connection 인터페이스에 대입
//            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/java","root","1234");
//            System.out.println("DB연동 성공");
//        }catch (Exception e){
//            System.out.println("DB연동 실패" + e);
//        }
    }
    // ===== 필드
    private static MemberDao memberDao = new MemberDao();
    // ===== 메소드
    public static MemberDao getInstance(){
        return memberDao;
    }
// ================================= 메소드 ================================= //
    // ============== 회원가입 SIGNUP ============== //
    public int signup(MemberDto memberDto){ // SIGNUP METHOD START
        try {
            // 1. SQL 작성
            String sql = "insert into member(mid,mpw,mphone)values( ?, ?, ? )";
            // 2. SQL 기재
            ps = conn.prepareStatement(sql);
                // ? 매개변수 대입
                ps.setString(1,memberDto.getMid());     // 기재된 SQL 내 첫번째 ?에 값 대입
                ps.setString(2,memberDto.getMpw());     // 기재된 SQL 내 두번째 ?에 값 대입
                ps.setString(3,memberDto.getMphone());  // 기재된 SQL 내 세번째 ?에 값 대입
            // 3. SQL 실행 / 결과
            int count = ps.executeUpdate(); // executeUpdate() 기재된 SQL 실행하고 INSERT된 레코드 개수 반환
            // 만약에 INSERT 처리된 레코드가 1개이면 회원가입 성공
            // INSERT : executeUpdate( )           SELECT : executeQuery( )
            if(count==1){
                return 0;
            }
        }catch (Exception e){
            System.out.println(e);
        }
        // 5. 함수종료
        return 1; // 실패
    }   // SIGNUP METHOD END

    // ============== 아이디 중복검사 IDCHECK ============== //
    public boolean idCheck(String mid){ // IDCHECK METHOD START
        try{
            // 1. SQL 작성한다.
            String sql = "select mid from member where mid = ?";
            // 2. SQL 기재한다.
            ps = conn.prepareStatement(sql);
                // ? 매개변수 대입
                ps.setString(1,mid);
            // 3. SQL 실행한다.
            rs = ps.executeQuery(); // 검색(select) 결과를 rs 인터페이스에 대입한다.
            // 4. SQL 결과처리
            if(rs.next()){  // rs.next() : 검색 결과 테이블에서 다음 레코드 이동.
                return true; // 중복있음
            }
        }catch (Exception e){
            System.out.println(e);
        }
        // 5. 함수종료
        return false;   // 중복 없음
    }   // IDCHECK METHOD END

    // ============== 로그인 LOGIN ============== //
    public boolean login(MemberDto memberDto){
        try{
            // 1. SQL 작성한다.
            String sql = "select * from member where mid = ? and mpw = ?";
            // 2. SQL 기재한다.
            ps = conn.prepareStatement(sql);
                // ? 매개변수 대입
            ps.setString(1,memberDto.getMid());
            ps.setString(2,memberDto.getMpw());
            // 3. SQL 실행한다.
            rs = ps.executeQuery(); // 검색(select) 결과를 rs 인터페이스에 대입한다.
            // 4. SQL 결과처리
                // IF vs WHILE : 만약에 SELECT의 결과물이 하나의 레코드가 존재하면 로그인 성공 아니면 실패
            if(rs.next()){  // rs.next() : 검색 결과 테이블에서 다음 레코드 이동.
                return true;    // 로그인 성공
            }
        }catch (Exception e){
            System.out.println(e);
        }
        // 5. 함수종료
        return false;   // 로그인 실패
    }

    // ============== 로그인 성공 후 회원번호 찾기 FINDMNO ============== //
    public int findMno(String mid){
        try{
            // 1. SQL 작성한다.
            String sql = "select mno from member where mid = ?";
            // 2. SQL 기재한다.
            ps = conn.prepareStatement(sql);
                // ? 매개변수 대입
            ps.setString(1,mid);
            // 3. SQL 실행한다.
            rs = ps.executeQuery(); // 검색(select) 결과를 rs 인터페이스에 대입한다.
            // 4. SQL 결과처리
                // IF vs WHILE : 만약에 SELECT의 결과물이 하나의 레코드가 존재하면 로그인 성공 아니면 실패
            if(rs.next()){  // rs.next() : 검색 결과 테이블에서 다음 레코드 이동.
                    // rs.next() : 검색 결과 테이블에서 다음 레코드 이동.
                    // rs.get타입 : 현재 레코드의 필드 값 호출
                return rs.getInt("mno");    // 로그인 성공
            }
        }catch (Exception e){
            System.out.println(e);
        }
        // 5. 함수종료
        return 0;
    }


}   // CLASS END
