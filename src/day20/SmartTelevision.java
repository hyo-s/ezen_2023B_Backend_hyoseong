package day20;  // PACKAGE NAME

public class SmartTelevision implements RemoteControl2, Searchable {  // CLASS START
    // 다중 구현 가능

    // RemoteControl2 인터페이스

    @Override
    public void turnOn() {
        System.out.println("TV를 켭니다.");
    }

    @Override
    public void turnOff() {
        System.out.println("TV를 끕니다.");
    }

    @Override
    public void search(String url) {
        System.out.println("url = " + "을 검색합니다.");
    }
}   // CLASS END
