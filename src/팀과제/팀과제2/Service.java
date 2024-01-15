package 팀과제.팀과제2;

public class Service {
    static int count = 0;
    // 필드
    int memberNum;
    String rating;
    double volume;
    String period;
    int price;

    // 메소드
    void basic(){
        this.memberNum = count;
        this.rating = "Basic";
        this.volume = 50.00;
        this.period = "1";
        this.price = 5000;
    }
    void standard(){
        this.memberNum = count;
        this.rating = "Standard";
        this.volume = 100.00;
        this.period = "1";
        this.price = 10000;
    }
    void premium(){
        this.memberNum = count;
        this.rating = "Premium";
        this.volume = 150.00;
        this.period = "1";
        this.price = 15000;
    }

    @Override
    public String toString() {
        return "Service{" +
                "memberNum=" + memberNum +
                ", rating='" + rating + '\'' +
                ", volume=" + volume +
                ", period='" + period + '\'' +
                ", price=" + price +
                '}';
    }
}
