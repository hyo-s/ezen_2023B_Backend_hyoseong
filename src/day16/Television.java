package day16;  // PACKAGE NAME

// 클래스 : 일반 클래스가 인터페이스의 추상메소드를 구현했으면 구현클래스
public class Television implements RemoteControl{   // CLASS START
    // implements 재정의한 메소드가 있어요 뜻
    // 무조건 오버라이딩을 해야 한다.

    // 인스턴스 프라이빗 필드
    private int volume;

    @Override
    public void turnOn() {
        System.out.println("TV를 켭니다.");
    }

    @Override
    public void turnOff() {
        System.out.println("TV를 끕니다.");
    }

    @Override
    public void setVolume(int volume) {
        if(this.volume > RemoteControl.MAX_VOLUME){
            this.volume = RemoteControl.MAX_VOLUME;
        }else if(this.volume < RemoteControl.MIN_VOLUME){
            this.volume = RemoteControl.MIN_VOLUME;
        }else {
            this.volume = volume;
        }
        System.out.println("현재 TV 볼륨 : " + this.volume);
    }

}   // CLASS END
/*
    오버로딩 : 생성자 / 메소드에서 매개변수의 타입과 개수 순서에 따라 여러개 선언이 가능한 것
    오버라이딩 : 메소드에서 상속 혹은 인터페이스 ( extends / implements )에서 메소드를 재정의 한 것
*/