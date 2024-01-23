package day16;  // PACKAGE NAME

public interface Vehicle { // INTERFACE START
    // 인터페이스 Vehicle에 추상메소드 run을 선언하였지만 추상이기 때문에 객체화를 하지 못한다 (객체를 생성할 수 없다.)
    // 그래서 하위클래스에서 오버라이딩을 꼭 해줘야 한다.

    // public abstract 생략 가능
    void run();
}   // INTERFACE END
