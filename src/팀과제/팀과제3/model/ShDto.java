package 팀과제.팀과제3.model;

public class ShDto extends BankDto{



    public ShDto(){}

    public ShDto(String 계좌번호, String 예금주, int 금액) {
        super(계좌번호, 예금주, 금액);
    }

    private int 마일리지;

    public int get마일리지() {
        return 마일리지;
    }

    public void set마일리지(int 마일리지) {
        this.마일리지 = 마일리지;
    }
}
