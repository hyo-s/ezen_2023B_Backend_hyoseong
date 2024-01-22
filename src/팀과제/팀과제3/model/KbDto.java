package 팀과제.팀과제3.model;

public class KbDto extends BankDto{



    //기본생성자
    public KbDto(){}

    public KbDto(String 계좌번호, String 예금주, int 금액) {
        super(계좌번호, 예금주, 금액);
    }

    private String 쿠폰;


    public String get쿠폰() {
        return 쿠폰;
    }

    public void set쿠폰(String 쿠폰) {
        this.쿠폰 = 쿠폰;
    }
}
