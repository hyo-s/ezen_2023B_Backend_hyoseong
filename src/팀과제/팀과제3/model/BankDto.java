package 팀과제.팀과제3.model;

public class BankDto {
    private String 계좌번호;
    private String 예금주;
    private int 금액;

    // 기본 생성자
    public BankDto(){};

    //풀 생성자
    public BankDto(String 계좌번호, String 예금주, int 금액) {
        this.계좌번호 = 계좌번호;
        this.예금주 = 예금주;
        this.금액 = 금액;
    }

    @Override
    public String toString() {
        return "BankDto{" +
                "계좌번호='" + 계좌번호 + '\'' +
                ", 예금주='" + 예금주 + '\'' +
                ", 금액=" + 금액 +
                '}';
    }
    //getter,setter
    public String get계좌번호() {
        return 계좌번호;
    }

    public void set계좌번호(String 계좌번호) {
        this.계좌번호 = 계좌번호;
    }

    public String get예금주() {
        return 예금주;
    }

    public void set예금주(String 예금주) {
        this.예금주 = 예금주;
    }

    public int get금액() {
        return 금액;
    }

    public void set금액(int 금액) {
        this.금액 = 금액;
    }
}
