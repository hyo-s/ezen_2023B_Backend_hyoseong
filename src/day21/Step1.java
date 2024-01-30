package day21;  // PACKAGE NAME

import java.util.Arrays;

public class Step1 {    // CLASS START
    public static void main(String[] args) {    // MAIN START
        try {
            findClass();
        }catch (ClassNotFoundException e){
            System.out.println("예외처리 = " + e.toString());
        }
    }   // MAIN END
    public static void findClass() throws ClassNotFoundException{
        // *예외 발생
            // 1. try{ }catch( ){ }      : 해당 코드 직접 예외처리
            // 2. throws                 : 예외 떠넘기기
        // 1.
        try {
            Class.forName("java.lang.String");
        }catch (ClassNotFoundException e){

        }
        // 해당 메소드 선언부 뒤에 throws 예외구문
        Class.forName("java.lang.String2");
            // Class.forName 현재 프로젝트 내 클래스/라이브러리 찾고 메모리로 로딩한다
    }
}   // CLASS END
