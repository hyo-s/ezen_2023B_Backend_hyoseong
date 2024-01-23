package day16;

public class Taxi implements Vehicle{
    // 그래서 하위클래스에서 오버라이딩을 꼭 해줬다.
    @Override
    public void run() {
        System.out.println("택시가 달립니다.");
    }
}
