package 팀과제.팀과제3.view;

import java.util.Scanner;
import 팀과제.팀과제3.model.BankDto;
import 팀과제.팀과제3.model.KbDto;
import 팀과제.팀과제3.model.ShDto;
import 팀과제.팀과제3.model.NhDto;
import 팀과제.팀과제3.controller.Controller;
public class View {

    // 싱글톤
    private View(){};
    private static View view = new View();
    public static View getInstance(){return view;}
    
    // 실행 메서드
    public void run(){
        while (true){
            Scanner scanner = new Scanner(System.in);
            System.out.println("===== 메인페이지 =====");
            System.out.println("1.계좌생성 2.입금 3.출금 4.종료");
            System.out.print("선택 >");
            int ch = scanner.nextInt();

            if ( ch == 1 ){
                계좌생성();
            }
            else if ( ch == 2 ){
                입금();
            }
            else if( ch == 3 ){
                출금();
            }
            else if ( ch == 4 ){
                break;
            }else if(ch == 5){
                조회();
            }else {
                System.out.println("올바른 선택이 아닙니다.");
            }

        } // w e
    } // run 메소드 end

    // 계좌생성 메서드 시작
    public void 계좌생성(){
        Scanner scanner = new Scanner(System.in);
        // 계좌 생성
        System.out.println("===== 은행을 선택해 주세요 =====");
        System.out.print("1.신한은행 2.국민은행 3.농협은행");
        int 은행코드 = scanner.nextInt();
        scanner.nextLine(); // nextInt 엔터값 초기화
        if (은행코드 == 1){ // 신한
            // 신한은행 계좌 가입
            System.out.print("계좌번호 : ");
            String 계좌번호 = scanner.next();
            System.out.print("예금주 : ");
            String 예금주 = scanner.next();
            System.out.print("입금액 : ");
            int 금액 = scanner.nextInt();
            scanner.nextLine(); // nextInt 엔터값 초기화

            // 객체 생성
            ShDto shDto = new ShDto(계좌번호 , 예금주 , 금액);

            // Controller 에 전달
            boolean result = Controller.getInstance().계좌생성(shDto);

            // 결과 값 처리
            if (result){
                System.out.println("계좌가 생성 되었습니다.");
            }else {
                System.out.println("계좌 생성에 실패 하였습니다.");
            }
        }
        else if (은행코드 == 2){ // 국민
            // 국민은행 계좌 가입
            System.out.print("계좌번호 : ");
            String 계좌번호 = scanner.next();
            System.out.print("예금주 : ");
            String 예금주 = scanner.next();
            System.out.print("입금액 : ");
            int 금액 = scanner.nextInt();
            scanner.nextLine(); // nextInt 엔터값 초기화

            // 객체 생성
            KbDto kbDto = new KbDto(계좌번호 , 예금주 , 금액);

            // Controller 에 전달
            boolean result = Controller.getInstance().계좌생성(kbDto);

            // 결과 값 처리
            if (result){
                System.out.println("계좌가 생성 되었습니다.");
            }else {
                System.out.println("계좌 생성에 실패 하였습니다.");
            }
        }
        else if (은행코드 == 3){ // 농협
            // 농협 계좌 가입
            System.out.print("계좌번호 : ");
            String 계좌번호 = scanner.next();
            System.out.print("예금주 : ");
            String 예금주 = scanner.next();
            System.out.print("입금액 : ");
            int 금액 = scanner.nextInt();
            scanner.nextLine(); // nextInt 엔터값 초기화

            // 객체 생성
            NhDto nhDto = new NhDto(계좌번호 , 예금주 , 금액);

            // Controller 에 전달
            boolean result = Controller.getInstance().계좌생성(nhDto);

            // 결과 값 처리
            if (result){
                System.out.println("계좌가 생성 되었습니다.");
            }else {
                System.out.println("계좌 생성에 실패 하였습니다.");
            }
        }
        else {
            System.out.println("은행 번호를 확인해주세요.");
        }
    }

    public void 입금(){
        Scanner scanner = new Scanner(System.in);
        // 1 입력
        System.out.print("계좌번호 : ");
        String 계좌번호 = scanner.next();
        System.out.print("입금액 : ");
        int 금액 = scanner.nextInt();
        scanner.nextLine(); // 엔터값 초기화
        // 객체
        BankDto bankDto = new BankDto();
        bankDto.set계좌번호(계좌번호);
        bankDto.set금액(금액);

        // 전달
        boolean result = Controller.getInstance().입금(bankDto);
        // 결과 처리
        if (result){
            System.out.println(금액 + " 입급하였습니다.");
        }else {
            System.out.println("입급에 실패 하였습니다.");
        }
    }
    
    public void 출금(){
        Scanner scanner = new Scanner(System.in);
        // 1 입력
        System.out.print("계좌번호 : ");
        String 계좌번호 = scanner.next();
        System.out.print("출금액 : ");
        int 금액 = scanner.nextInt();
        scanner.nextLine(); // 엔터값 초기화
        // 객체
        BankDto bankDto = new BankDto();
        bankDto.set계좌번호(계좌번호);
        bankDto.set금액(금액);

        // 전달
        boolean result = Controller.getInstance().출금(bankDto);

        // 결과 처리
        if (result){
            System.out.println(금액 + " 출금하였습니다..");
        }else {
            System.out.println("출금에 실패 하였습니다.");
        }

    }

    public void 조회(){
        Scanner scanner = new Scanner(System.in);
        // 1 입력
        System.out.print("계좌번호 : ");
        String 계좌번호 = scanner.next();

        // 객체
        BankDto bankDto = new BankDto();
        bankDto.set계좌번호(계좌번호);
        
        // 전달
        String str = Controller.getInstance().조회(bankDto);

        // 처리
        System.out.println(str);
    }

} // c e
