package day20;  // PACKAGE NAME

public interface RemoteControl {    // INTERFACE START

    // 멤버

    // 1. 상수 [ public static final ] 필드
    int MAX_VOLUME = 10;
    public static final int MIN_VOLUME = 0;

    // 2. 추상 [ public abstract ] 메소드
        // 구현 클래스에서 오버라이딩 필수
    void turnOn();  // 선언부 작성, 실행부 작성 안함
    void turnOff();
    public abstract void setVolume(int volume);

    // 3. 디폴트 [ default ] 인스턴스 메소드
    default void setMute(boolean mute){ // 선언부 작성, 실행부 작성
        if(mute){
            System.out.println("무음 처리 합니다.");
            setVolume(MIN_VOLUME);
        }else {
            System.out.println("무음 해제 합니다.");
        }
    }

    // 4. 정적 [ static ] 메소드
    static void changeBattery(){
        System.out.println("리모트 건전지를 교환합니다.");
        System.out.println(MAX_VOLUME); // 상수필드 호출 가능
        // turnOn(); // 불가능.
        // setMute(); // 불가능

        RemoteControl rc = new Audio();
        rc.turnOn();
    }

    // 5. private vs public
        // private : 내부( 클래스, 인터페이스 )에서만 접근 가능.
    // 1. 추상 메소드 : 다른 곳에서 구현을 해줘야 하는 메소드 private 사용 불가
        // private abstract void turnOf();
    // 2. default 메소드 : 다른 곳에서 구현을 해줘야 하는 메소드 private 사용 불가
        // private default void turnOff2(){ }
    private void turnOff2(){}
    // 3. 정적 메소드 : 구현 객체 필요 없음 private 사용 가능
        // 외부에서 사용 불가 내부에서 코드를 줄이기 위해 사용
    private static void turnOff3(){ }

}   // INTERFACE END
