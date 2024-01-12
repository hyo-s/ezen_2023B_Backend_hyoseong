package day09;  // PACKAGE NAME

public class Account {  // CLASS START

    // 필드
    String number;
    String name;
    int accountMoney;

    // 생성자
    Account(String number, String name, int accountMoney){
        this.number = number;
        this.name = name;
        this.accountMoney = accountMoney;
    }
    @Override
    public String toString() {
        return "Account{" +
                "number='" + number + '\'' +
                ", name='" + name + '\'' +
                ", accountMoney=" + accountMoney +
                '}';
    }

    // 메소드
    int inMoney(int money){
        this.accountMoney += money;
        return accountMoney;
    }
}   // CLASS END
