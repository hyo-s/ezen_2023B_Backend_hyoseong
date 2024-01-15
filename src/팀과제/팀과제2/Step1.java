package 팀과제.팀과제2;

import java.util.Scanner;

public class Step1 {        // CLASS START
    public static void main(String[] args) {    // MAIN START
        Scanner scanner = new Scanner(System.in);
        Member[] memberArray = new Member[100];
        Service[] serviceArray = new Service[100];
        int num = 0;

// ======================================= 메뉴선택 ======================================= //
        while (true) {  // WHILE1 START
            System.out.println("============== 메뉴 ==============");
            System.out.println(" 1.로그인 | 2.회원가입 | 3.종료 ");
            System.out.println("==================================");
            System.out.print("선택 > ");
            int ch = scanner.nextInt();
            boolean btn = false;

// ======================================= 1.로그인 ======================================= //
            if (ch == 1) {
                System.out.print("아이디를 입력해주세요 : ");
                String id = scanner.next();
                System.out.print("비밀번호를 입력해주세요 : ");
                String pw = scanner.next();

                for (int i = 0; i < memberArray.length; i++) {
                    if (memberArray[i]!=null && memberArray[i].id.equals(id) && memberArray[i].pw.equals(pw)) {
                        System.out.println("로그인 성공!");
                        System.out.println(memberArray[i].toString());
                        btn = true;
                        num = memberArray[i].memberNum;
                        break;
                    }else{
                        System.out.println("회원가입을 진행해주세요.");
                        break;
                    }
                }

// ======================================= 2.회원가입 ======================================= //
            } else if (ch == 2) {    // else if start
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
                for (int i = 0; i < memberArray.length; i++) {
                    if (memberArray[i] == null) {
                        memberArray[i] = member;
                        System.out.println("회원가입 성공");
                        break;
                    }
                }
            }   // else if end

// ======================================= 로그인 성공 ======================================= //
            while (btn) {           // WHILE2 START
                for (int i = 0; i < serviceArray.length; i++) {

// ======================================= 구독이 되어있는 상태 ======================================= //
                    if (serviceArray[i]!=null && num==serviceArray[i].memberNum) {
                        System.out.println("============== 서비스 메뉴 ==============");
                        System.out.println(serviceArray[i].rating +" | "+serviceArray[i].volume +"GB"+" | "+serviceArray[i].period+"개월 구독"+" | "+"X.로그아웃");
                        System.out.println("=====================================");
                        System.out.println("Y.구독연장 신청 N.구독연장 신청안함");
                        System.out.print("선택 > ");
                        String y = scanner.next();
                        if(y.equals("Y")){
                            System.out.print("금액을 입력해주세요 : ");
                            int pay = scanner.nextInt();
                            if (pay == 5000) {
                                System.out.println("구독연장이 완료되었습니다.");
                                int num1 = (Integer.parseInt(serviceArray[i].period)+1);
                                serviceArray[i].period = Integer.toString(num1);
                                break;
                            }
                        }else if(y.equals("N")){
                            break;
                        }else if(y.equals("X")){
                            btn=false;
                            break;
                        }
// ======================================= 구독신청 ======================================= //
                    } else{
                        System.out.println("============== 구독신청 ==============");
                        System.out.println(" 1.Basic | 2.Standard | 3.Premium");
                        System.out.println("=====================================");
                        System.out.print("선택 > ");
                        int no = scanner.nextInt();

                        if (no == 1) {
                            System.out.println("선택등급 : Basic ");
                            System.out.print("금액을 입력해주세요 : ");
                            int pay = scanner.nextInt();
                            if (pay == 5000) {
                                System.out.println("구독이 완료되었습니다.");
                                Service.count++;
                                Service service = new Service();
                                service.standard();
                                serviceArray[i] = service;
                                System.out.println(serviceArray[i].toString());
                                break;
                            }
                        }
                        if (no == 2) {
                            System.out.println("선택등급 : Standard ");
                            System.out.print("금액을 입력해주세요 : ");
                            int pay = scanner.nextInt();
                            if (pay == 10000) {
                                System.out.println("구독이 완료되었습니다.");
                                Service.count++;
                                Service service = new Service();
                                service.basic();
                                serviceArray[i] = service;
                                System.out.println(serviceArray[i].toString());
                                break;
                            }
                        }
                        if (no == 3) {
                            System.out.println("선택등급 : Premium ");
                            System.out.print("금액을 입력해주세요 : ");
                            int pay = scanner.nextInt();
                            if(pay == 15000){
                                System.out.println("구독이 완료되었습니다.");
                                Service.count++;
                                Service service = new Service();
                                service.premium();
                                serviceArray[i] = service;
                                System.out.println(serviceArray[i].toString());
                                break;
                            }
                        }
                    }
                }
            }   // WHILE2 END
        }   // WHILE1 END
    }   // MAIN END
}   // CLASS END

