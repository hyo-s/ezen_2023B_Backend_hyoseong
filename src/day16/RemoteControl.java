package day16;  // PACKAGE NAME

// 추상클래스와 인터페이스를 사용하는 이유 : * 다형성

public interface RemoteControl {    // INTERFACE START
    // 클래스는 인스턴스필드와 정적필드(+상수필드)를 가질 수 있다.
    // 인터페이스는 인스턴스필드를 가질 수 없다. 정적필드 내에서 상수필드만 가질 수 있다.
    // 상수 필드 : public static final
    int MAX_VOLUME = 10;
    public static final int MIN_VOLUME = 0; // [ public static final ] 생략 가능


    // 추상메소드 : 서로 다른 객체들 간의 공통적인 메소드를 추출한 것
        // 선언부만 작성하고 구현부는 하지 않는다.
        // 추상클래스의 추상메소드는 abstract 명시하지만 인터페이스의 추상 메소드는 abstract 생략이 가능하다.
        // 텔레비전과 오디오의 공통적인 메소드 추출 ( = 전원버튼 )
    // 구현클래스 : 추상메소드를 구현한 클래스 ( = 자식클래스 )
        // 구현클래스가 필요한 이유 : 추상클래스와 인터페이스는 스스로 객체를 생성할 수 없다.
    public void turnOn();
    public abstract void turnOff(); // public abstract 생략 가능
    void setVolume(int volume);

}   // INTERFACE END
