package day17;  // PACKAGE NAME

import 과제.과제7.Controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Step1 {     // CLASS START
    public static void main(String[] args) {    // MAIN START
        try{    // 만약에 해당 클래스를 못찾았을때 대처.

        // 1. Class.forName 현재 프로젝트 내 클래스/라이브러리 찾고 메모리로 로딩한다
        Class.forName("com.mysql.cj.jdbc.Driver");  // ClassNotFoundException
            // 1. MYSQL 회사에서 driver 클래스를 찾기 : com 폴더 내 mysql 폴더 내 cj 폴더 내 jdbc 폴더 내 driver 존재
            // 2. 해당 폴더 내 driver 클래슬를 찾는 과정에서 오류가 발생 할 수도 있다.
                // - ClassNotFoundException : 클래스를 찾지 못했다는 뜻
        } catch ( ClassNotFoundException e ){
            System.out.println("[시스템]오류 : JDBC 드라이버 클래스를 찾지 못했습니다."+e);
        }

        try{    // 만약에 연동할 DB 서버의 정보가 잘못되거나 DB 서버 쪽에 문제가 발생했을 때 대처
        // 2. Connection : DB 연동 인터페이스
            // 인터페이스 타입으로 변수선언
        Connection connection;
            // 인터페이스는 스스로 객체를 만들 수 없다 [ 추상 ]
            // !!! : 구현체 ( 구현객체 - 구현클래스(implements)로 생성된 객체 )
            // DriverManager.getConnection("DB 서버주소 " , "계정명", "비밀번호" ) : 연동해서 연동된 구현체 반호나
        connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/test5","root","1234");
            System.out.println("[시스템정보] : DB 서버와 연동 성공했습니다.");
        } catch ( SQLException e ){
            System.out.println("[시스템]오류 : MYSQL 서버와 연동이 실패 했습니다.");
        }
    }   // MAIN END
}   // CLASS END

/*
    오류/예외 처리
        - 오류/예외 발생했을 때 대처 하기 위해
        1.일반 예외 : 컴파일 시 예외 체크   = 컴파일 시 발생
          - 자바 외부와 통신하는 클래스들 ( 키보드, DB 서버, 파일처리 등등 )
          - 1. Scanner 클래스
          - 2. DAO ( Data Access Object ) : 주로 DB 연동/조작 객체
        2.실행 예외 : 실행 중에 오류 체크   = 실행 중에 발생
          - 미리 대처하기 힘듦 - 미리 오류/예외 알고 있는 상태 = 경험을 통한 대처
          - NullPointerException
    오류/예외 처리
        - 만약에 예외가 발생할 것 같은 코드에 처리
        - 문법
            try{ } catch( 예외클래스명 변수 ){ }
*/