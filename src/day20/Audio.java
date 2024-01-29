package day20;  // PACKAGE NAME

// 구현 클래스 -> new 구현객체
public class Audio implements RemoteControl {    // CLASS START

    // 클래스 멤버
    // 필드
    private int volume;

    // 생성자 ( 오버로딩 )

    // 메소드 ( 오버라이딩 ) ( 인스턴스 멤버 vs 정적 멤버 ) ( 오버로팅 vs 오버라이딩 )
        // 추상 메소드 구현
    @Override
    public void turnOn() {
        System.out.println("Audio를 켭니다.");
    }

    @Override
    public void turnOff() {
        System.out.println("Audio를 끕니다.");
    }

    @Override
    public void setVolume(int volume) { // SETVOLUME METHOD START
        if(volume>RemoteControl.MAX_VOLUME){
            this.volume = RemoteControl.MAX_VOLUME;
        } else if (volume<RemoteControl.MIN_VOLUME){
            this.volume = RemoteControl.MIN_VOLUME;
        }else {
            this.volume = volume;
        }
        System.out.println("현재 Audio 볼륨 : " + volume);
    }   // SETVOLUME METHOD END

    // * 디폴트 [ default ] 인스턴스 메소드는 재정의가 필수는 아니다.

    // 필드
    private int memoryVolume;

    // 디폴트 메소드 재정의
    @Override
    public void setMute(boolean mute){  // SETMUTE METHOD START
        if(mute){
            this.memoryVolume = this.volume;
            System.out.println("무음 처리합니다.");
            setVolume(RemoteControl.MIN_VOLUME);
        }else {
            System.out.println("무음 해제합니다.");
            setVolume(this.memoryVolume);
        }
    }   // SETMUTE METHOD END
}   // CLASS END
