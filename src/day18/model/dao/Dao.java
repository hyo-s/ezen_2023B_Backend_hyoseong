package day18.model.dao;    // PACKAGE NAME

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/*
    클래스 : public, default
    필드   : public, private, protected,default(생략시)
    생성자 : public, private, protected,default(생략시)
    메소드 : public, private, protected,default(생략시)
    public              : 모든 패키지 접근 가능
    private             : 현재 패키지 접근 가능
    protected           : 동일 패키지 접근 가능 + 상속관계 가능
    default(생략시)      : 동일 패키지 접근 가능
*/

public class Dao {  // CLASS START
// ================================= 필드 ================================= //
    // DB 연동관련 인터페이스
    protected Connection conn;  // 여러 메소드에서 사용하려고 필드에 선언 // 1. DB연동객체 connection
    protected PreparedStatement ps; // 2. 작성된 SQL 가지고 있고, 매개변수,  실행 담당 preparedStatement
    protected ResultSet rs;    // 3. SQL 실행 결과 resultSet

    // ===== DB 연동 생성자
    protected Dao(){
        // 객체 생성시 DB 연동
        try {
            // 1. MYSQL 회사의 JDBC 관련된 객체를 로딩 JVM에 로딩한다 불러오기
            Class.forName("com.mysql.cj.jdbc.Driver");
            // 2. 연동된 결과의 (구현체)객체를 Connection 인터페이스에 대입
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/java","root","1234");
            System.out.println("DB연동 성공");
        }catch (Exception e){
            System.out.println("DB연동 실패" + e);
        }
    }
}   // CLASS END
