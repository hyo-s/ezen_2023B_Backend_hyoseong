package 팀과제.팀과제3.model;

public class ShDto extends BankDto{

    static final int 은행코드 = 1;

    public ShDto(){}

    public ShDto(String 계좌번호, String 예금주, int 금액) {
        super(계좌번호, 예금주, 금액);
    }

    private int 포인트;

    public int get포인트() {
        return 포인트;
    }
    public void set포인트(int 포인트) {
        this.포인트 = 포인트;
    }
}
