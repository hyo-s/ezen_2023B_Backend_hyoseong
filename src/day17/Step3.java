package day17;  // PACKAGE NAME

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Step3 {    // CLASS START
    public static void main(String[] args) {    // MAIN START
        // 입력객체
        Scanner scanner = new Scanner(System.in);

        Connection connection = null;  // try{ }와 while{ }에서 모두 사용하기 위해 밖에서 선언 // 변수는 초기값이 필요함 // 필드는 괜찮다
// ========================================= DB연동 ========================================= //
        try{
            // 1. JDBC 로딩한다.
        Class.forName("com.mysql.cj.jdbc.Driver");
            // 2. DB 서버와 연동 후 연동객체를 반환 받는다.
        connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/test5","root","1234");
            System.out.println("<연동성공>");
            // 3. DB 연동 시 필요한 메소드 중에 Class.forName, getConnection 일반예외 발생
                // try{ }catch( ){ }
        }catch (Exception e){
            System.out.println(e);
        }

// ========================================= 고객명단 ========================================= //
        while (true){
            System.out.println("고객명단 : 1.삽입 | 2.출력 | 3.수정 | 4.삭제");
            System.out.print("선택> ");
            try{
                int ch = scanner.nextInt(); // 만일 int 타입 범위 벗어난 입력시 오류 발생 [InputMismatchException]
                if(ch==1){
                    // 1. 입력받기
                    System.out.print("저장할 고객명 : ");
                    String name = scanner.next();
                    // 2. DB에 저장한다  // SQLException 예외처리.
                    // connection.prepareStatement("insert into members values('유재석')").executeUpdate();
                    // String sql = "insert into members values('입력받은값')";
                    String sql = "insert into members values('"+name+"')";
                    System.out.println(sql);
                    connection.prepareStatement(sql).executeUpdate();
                }else if(ch==2){
                    // 모든 필드를 표시하는 모든 레코드 출력
                    String sql = "select * from members";
                    ResultSet resultSet = connection.prepareStatement(sql).executeQuery();
                        System.out.println(resultSet);  // select 결과물 가지고 있는 인터페이스
                    // .next( ) : select 결과 테이블에서 다음 레코드로 이동 후 존재여부 true / false 반환 함수
                    while (resultSet.next()){   // 검색결과 내 첫번째 레코드부터 마지막 레코드까지 순회
                        // 하나씩 next( )로 레코드를 이동하면서 반복처리를 할건데 만약에 다음 레코드가 존재하면 실행
                        // 다음 레코드가 존재하지 않으면 false이므로 while 종료
                        // System.out.println(resultSet.getString(1));
                        System.out.println(resultSet.getString("name"));
                            // .get타입( 호출 필드순서번호 or 필드명 );
                    }
                }else if(ch==3){
                    // 1. 입력받기  // 누구를 어떻게 수정할지 입력
                    System.out.print("수정할 고객명 : ");
                    String oldName = scanner.next();
                    System.out.print("새로운 고객명 : ");
                    String newName = scanner.next();

                    // 2. DB에 수정처리 한다
                    // String sql = "update members set name = '새로운고객명' where name = '기존고객명'";
                    String sql = "update members set name = '"+newName+"' where name = '"+oldName+"'";
                    System.out.println(sql);
                    connection.prepareStatement(sql).executeUpdate();
                }else if(ch==4){
                    // 1. 입력받기  // 누구를 삭제할지 입력
                    System.out.print("삭제할 고객명 : ");
                    String deleteName = scanner.next();

                    // 2. DB에 삭제처리 한다.
                    // String sql = "delete from members where name = '삭제할고객명'";
                    String sql = "delete from members where name = '"+deleteName+"'";
                    System.out.println(sql);
                    connection.prepareStatement(sql).executeUpdate();
                }
            }catch (InputMismatchException e){
                System.out.println("<시스템오류> 정상적인 입력값이 아닙니다."+e);
                    // 입력받은 값이 정수가 아닌경우 계속 무한반복함 입력도 무한 출력도 무한
                scanner = new Scanner(System.in);   // 기존에 입력받은 바이트를 지우기/초기화
            }catch (SQLException e){
                System.out.println("<시스템오류> SQL에서 오류가 발생했습니다.");
            }

        }
    }   // MAIN END
}   // CLASS END
