package day13;  // PACKAGE NAME

public class Phone {    // CLASS START

    // 필드
    // 1. (접근제한자 public/private) (정적/인스턴스) (final) 필드
    public  String model;
    public  String color;   // 인스턴스 필드는 객체(힙) 없이 못쓴다.
    // 2. (접근제한자 public/private) 생성자
        // 기본 생성자
            // 생성자가 없을때만 기본 생성자가 만들어짐
            // 풀 생성자가 하나라도 있으면 기본 생성자를 직접 만들어줘야한다.
        // 풀 생성자

    /*
        public Phone(String model, String color) {
        this.model = model;
        this.color = color;
    }
    */

    // 3. (접근제한자 public/private) (정적/인스턴스) 메소드
        // 1. 매개변수 : X, 반환값 : X
    public void bell(){
        System.out.println("벨이 울립니다.");
    }
        // 2. 매개변수 : String, 반환값 : X
    public void sendVoice(String message){
        System.out.println("자기 : " + message);
    }
        // 3. 매개변수 : String, 반환값 : X
    public void receiveVoice(String message){
        System.out.println("상대방 : " + message);
    }
        // 4. 매개변수 : X, 반환값 : X
    public void hangUp(){
        System.out.println("전화를 끊습니다.");
    }
}    // CLASS END
