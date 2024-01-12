package 팀과제.팀과제2;

import java.util.Scanner;

public class Step1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Member[] memberArray = new Member[100];
        Service[] serviceArray = new Service[100];
        int num = 0;

        while(true){
            System.out.println("============== 메뉴 ===========");
            System.out.println(" 1.로그인 | 2.회원가입 | 3.종료 ");
            System.out.println("============================");
            System.out.print("선택 > ");
            int ch = scanner.nextInt();
            boolean btn = false;

            if(ch==1){
                System.out.print("아이디를 입력해주세요 : ");
                String id = scanner.next();
                System.out.print("비밀번호를 입력해주세요 : ");
                String pw = scanner.next();

                for(int i=0; i<memberArray.length; i++){
                    if(memberArray[i].id.equals(id) && memberArray[i].pw.equals(pw)){
                        System.out.println("로그인 성공!");
                        System.out.println(memberArray[i].toString());
                        btn = true;
                        num = memberArray[i].memberNum;
                        break;
                    }
                }
            }else if(ch==2){    // else if start
                System.out.print("아이디를 입력해주세요 : ");
                String id = scanner.next();
                System.out.print("비밀번호를 입력해주세요 : ");
                String pw = scanner.next();
                System.out.print("이름을 입력해주세요 : ");
                String name = scanner.next();
                System.out.print("주민등록번호를 입력해주세요 : ");
                String rrn = scanner.next();
                System.out.print("핸드폰번호를 입력해주세요 : ");
                String phone = scanner.next();
                Member.count++;
                Member member = new Member(id, pw, name, rrn, phone);
                for (int i=0; i<memberArray.length; i++){
                    if(memberArray[i]==null){
                        memberArray[i]=member;
                        System.out.println("회원가입 성공");
                        break;
                    }
                }
            }   // else if end
            while(btn){
                for(int i=0; i<serviceArray.length; i++){
                    if(num==serviceArray[i].memberNum){

                    }else{
                        System.out.println("============== 구독신청 ===========");
                        System.out.println(" 1.Basic | 2.Standard | 3.Premium");
                        System.out.println("============================");
                        System.out.print("선택 > ");
                        int no = scanner.nextInt();

                        if(no==1){

                        }
                    }
                }

            }
        }

    }
}
