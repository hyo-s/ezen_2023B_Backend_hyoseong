package 팀과제.팀과제3.model;

import java.util.ArrayList;

public class BankDao {
    // 싱글톤
    private BankDao(){}
    private static BankDao memberDAO = new BankDao();
    public static BankDao getInstance(){return memberDAO;}

    // 배열 생성(ArrayList)
    ArrayList<BankDto> bankArray = new ArrayList<>();


    public boolean 계좌생성(BankDto){
        if(은행번호 == 1){
            bankArray.add(은행객체);
        }else if(은행번호 == 2){
            bankArray.add(은행객체);
        }else if(은행번호 == 3){
            bankArray.add(은행객체);
        }
        return true;
    }

    public int 계좌찾기(){
        // 신한 배열 찾아서 입력한 계좌번호가 저장된 계좌번호랑 일치하면 1 반환
        for(int i = 0; i < bankArray.size(); i++){
            if(bankArray.get(i).get계좌번호().equals(은행객체.get계좌번호())){
                return bankArray.get(i).get은행코드();
            }
        }

        return 0;
    }

    public boolean 입금(){
        if(은행번호 == 1){
            bankArray.add(마일리지);
            return true;
        }else if(은행번호 == 2){
            bankArray.add(쿠폰);
            return true;
        }else if(은행번호 == 2){
            bankArray.add(포인트);
            return true;
        }
        return false;
    }

    public boolean 출금(){
        if(은행번호 == 1){
            return true;
        }else if(은행번호 == 2){
            return true;
        }else if(은행번호 == 2){
            return true;
        }
        return false;
    }
}
