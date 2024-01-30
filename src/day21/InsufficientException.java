package day21;  // PACKAGE NAME

    // extends 상속 키워드
public class InsufficientException extends Exception{ // CLASS START
    // 예외 클래스 만들기
        // 1. Exception 클래스로부터 상속 받는다.
            // Exception 클래스로부터 message 필드를 상속 받고 있어서 사용 가능
        // 3. 생성자에 super( message ); 작성한다.
        public InsufficientException( ){ }
        public InsufficientException(String message){
            super(message); // super : 상위 클래스 vs this : 본인 객체
                    /*
                                super           vs          this
                    필드          X                       this.필드명
                    생성자     super( )                        X
                    메소드     super.메소드명( )                 X
                    */
        }
}   // CLASS END
