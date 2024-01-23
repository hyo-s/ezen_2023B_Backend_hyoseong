package 팀과제.팀과제4;

public class Hiphop extends Music {
    public Hiphop(String title, int time , String type) {
        this.title = title;
        this.time = time;
        this.type = type;
    }

    public Hiphop() {

    }

    @Override
    public void turnOn() {
        System.out.println( title +" 의 음악이 실행중");
    }

    @Override
    public String toString() {
        return title;
    }
}
