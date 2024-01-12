package day09;  // PACKAGE NAME

import java.util.Scanner;

public class Step2 {    // CLASS START
    public static void main(String[] args) {    // MAIN START
        Scanner scanner = new Scanner(System.in);
        Account[] accountArray = new Account[100];
        while(true){    // WHILE START
            System.out.println("============================================");
            System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료");
            System.out.println("============================================");
            System.out.print("선택> ");
            int ch = scanner.nextInt();

            if(ch==1){  // IF START
                System.out.println("=========");
                System.out.println(" 계좌생성 ");
                System.out.println("=========");
                System.out.print("계좌번호 : ");
                    String number = scanner.next();
                System.out.print("계좌주 : ");
                    String name = scanner.next();
                System.out.print("초기입금액 : ");
                    int accountMoney = scanner.nextInt();
                if(number!=null && name!=null && accountMoney!=0){
                    Account addAccount = new Account(number, name, accountMoney);
                        System.out.println(addAccount);
                    for (int i=0 ; i<accountArray.length; i++){
                        if (accountArray[i] == null){
                            accountArray[i] = addAccount;
                            break;
                        }
                    }
                    System.out.println("계좌가 생성되었습니다.");
                }
            }   // IF END
            if(ch==2){  // IF START
                System.out.println("=========");
                System.out.println(" 계좌목록 ");
                System.out.println("=========");
                for (int i=0; i< accountArray.length; i++){
                    if(accountArray[i]!=null){
                        System.out.print(accountArray[i].number+"   ");
                        System.out.print(accountArray[i].name+"   ");
                        System.out.print(accountArray[i].accountMoney+"   ");
                        System.out.println();
                    }
                }
            }   // IF END
            if(ch==3){  // IF START
                System.out.println("=========");
                System.out.println(" 예금 ");
                System.out.println("=========");
                System.out.print("계좌번호 : ");
                    String number = scanner.next();
                System.out.print("예금액 : ");
                    int accountMoney = scanner.nextInt();
                for (int i=0; i<accountArray.length; i++){
                    if (number.equals(accountArray[i].number) && accountArray[i].number!=null){
                        accountArray[i].accountMoney += accountMoney;
                        break;
                    }
                }
            }   // IF END
            if(ch==4){  // IF START
                System.out.println("=========");
                System.out.println(" 출금 ");
                System.out.println("=========");
                System.out.print("계좌번호 : ");
                String number = scanner.next();
                System.out.print("예금액 : ");
                int accountMoney = scanner.nextInt();
                for (int i=0; i<accountArray.length; i++){
                    if (number.equals(accountArray[i].number) && accountArray[i].number!=null){
                        accountArray[i].accountMoney -= accountMoney;
                        break;
                    }
                }
            }   // IF END
            if(ch==5){  // IF START
                break;
            }   // IF END
/*
            if(ch==6){  // IF START
                System.out.print("계좌번호 : ");
                    String number = scanner.next();
                System.out.print("예금액 : ");
                    int accountMoney = scanner.nextInt();
                for (int i=0; i<accountArray.length; i++){
                    if(number.equals(accountArray[i].number) && accountArray[i].number!=null){
                       Account.inMoney(accountMoney);
                    }
                }
            }   // IF END
*/
        }   // WHILE {END
    }   // MAIN END
}   // CLASS END
