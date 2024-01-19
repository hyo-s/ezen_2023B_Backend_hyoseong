package 팀과제.팀과제3.model;

public class NhDto extends BankDto{

    static final int 은행코드 = 3;

    public NhDto(String 계좌번호, String 예금주, int 금액) {
        super(계좌번호, 예금주, 금액);
    }

    public NhDto(){}
    private int 마일리지;

    public int get마일리지() {
        return 마일리지;
    }

    public void set마일리지(int 마일리지) {
        this.마일리지 = 마일리지;
    }
}
