package day18.model.dao;    // PACKAGE NAME

import day18.controller.MemberController;
import day18.model.dto.BoardDto;
import day18.model.dto.CategoryDto;

import java.util.ArrayList;

public class BoardDao extends Dao{ // CLASS START
// ================================= 싱글톤 ================================= //
    // ===== 생성자
    private BoardDao(){ }
    // ===== 필드
    private static BoardDao boardDao = new BoardDao();
    // ===== 메소드
    public static BoardDao getInstance(){
        return boardDao;
    }
// ================================= 메소드 ================================= //
    // ============== 카테고리 출력 CATEGORYPRINT ============== //
    public ArrayList<CategoryDto> categoryPrint(){
        ArrayList<CategoryDto> categoryDtos = new ArrayList<>();
        try{
            // 1. SQL 작성
            String sql = "select * from category";
            // 2. SQL 기재한다.
            ps = conn.prepareStatement(sql);
            // 3. SQL 실행한다.
            rs = ps.executeQuery();

            // 4. SQL 결과처리
            while(rs.next()){
                CategoryDto categoryDto = new CategoryDto();
                categoryDto.setbCno(rs.getInt("bcno"));
                categoryDto.setBcategory(rs.getString("bcategory"));
                categoryDtos.add(categoryDto);
            }
        }catch (Exception e){
            System.out.println(e);
        }
        // 함수종료.
        return categoryDtos;
    }
    // ============== 글쓰기 WRITE ============== //
    public boolean write(BoardDto boardDto){
        try {
            // 1. SQL 작성
            String sql = "insert into board(btitle, bcontent, bveiw) values(?,?,?)";
            // 2. SQL 기재한다.
            ps = conn.prepareStatement(sql);
            // 3. SQL 실행한다.
            rs = ps.executeQuery();
            // 4. SQL 결과처리
            if(rs.next()){
                return true;
            }
        }catch (Exception e ){
            System.out.println(e);
        }
    return false;
    }
}   // CLASS END
