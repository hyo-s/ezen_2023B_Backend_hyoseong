package day21;  // PACKAGE NAME

public class Step2 {    // CLASS START
    public static void main(String[] args) {    // MAIN START

        Account account = new Account();

        // 예금하기
        account.deposit(10000);
        System.out.println("예금액 : " + account.getBalance());

        // 출금하기
        try {
            account.withdraw(30000);
        }catch (InsufficientException e){
            String message = e.getMessage();
            System.out.println("message = " + message);
        }
    }   // MAIN END
}   // CLASS END
