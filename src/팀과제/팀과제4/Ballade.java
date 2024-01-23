package 팀과제.팀과제4;

public class Ballade extends Music {
    public Ballade(String title, int time , String type) {
        this.title = title;
        this.time = time;
        this.type = type;
    }
    public Ballade() { }

    @Override
    public void turnOn() {
        System.out.println( title +" 의 음악이 실행중");
    }

    @Override
    public void turnOff() {
        System.out.println( title +" 의 음악이 중지됨");
    }

    @Override
    public void after() {
        System.out.println("다음곡 실행");
    }

    @Override
    public void before() {
        System.out.println("이전곡 실행");
    }

    @Override
    public String toString() {
        return title;
    }
}
