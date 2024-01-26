package day18.controller;   // PACKAGE NAME

import day18.model.dao.BoardDao;
import day18.model.dto.BoardDto;
import day18.model.dto.CategoryDto;

import java.util.ArrayList;

public class BoardController {  // CLASS START
// ================================= 싱글톤 ================================= //
    // ===== 생성자
    private BoardController(){ }
    // ===== 필드
    private static BoardController boardController = new BoardController();
    // ===== 메소드
    public static BoardController getInstance(){
        return boardController;
    }
// ================================= 메소드 ================================= //
    // ============== 카테고리 출력 CategoryPrint ============== //
    public ArrayList<CategoryDto> CategoryPrint(){
        // 1. 반환 변수
        ArrayList<CategoryDto> result;

        // 2. 카테고리 요청
        result = BoardDao.getInstance().categoryPrint();

        // 3. 반환
        return result;
    }
    // ============== 글쓰기 WRITE ============== //
    public boolean write(BoardDto boardDto){

        // 1. 반환변수
        boolean result;

        // 3. 가공처리 / 로직
            // 1. 글쓰기 요청
        boardDto.setMno_fk(MemberController.getInstance().loginMno);
        result = BoardDao.getInstance().write(boardDto);

        // 2. 반환
        return result;
    }
}   // CLASS END
