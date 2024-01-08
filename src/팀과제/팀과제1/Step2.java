package 팀과제.팀과제1;

import java.util.Scanner;

public class Step2{     // CLASS START
    public static void main(String[] args) {    // MAIN START

        Scanner scanner = new Scanner( System.in);
        String[] 층 = new String[3];
        String[] 시 = new String[3];
        String[] 분 = new String[3];

        for(int i=0; i<3; i++){
            층[i]=""; 시[i]=""; 분[i]="";
        }

        while(true){    // WHILE START

            String 출차층 = ""; String 출차시 = ""; String 출차분 = ""; int 금액=0;

            System.out.println("층1: "+층[0]+"\t층2 :"+층[1]+"\t층3 :"+층[2]);
            System.out.println("층1시 :"+시[0]+"\t층2시 :"+시[1]+"\t층3시 :"+시[2]);
            System.out.println("층1분 :"+분[0]+"\t층2분 :"+분[1]+"\t층3분 :"+분[2]);

            System.out.println("입차/출차 : ");
            String 입출 = scanner.next();

            if(입출.equals("입차")){    // IF1 START
                System.out.print("입차를 희망하는 층 선택해주세요(1~3) : ");
                scanner.nextLine();
                String 입력받은층 = scanner.nextLine();
                int 입력받은층수 = Integer.parseInt(입력받은층) - 1;

                if(입력받은층수==0 || 입력받은층수==1 || 입력받은층수==2) {   // IF2 START
                    if (층[입력받은층수].equals("")) {     // IF3 START
                        System.out.print("차량번호를 입력해주세요 : ");
                        층[입력받은층수] = scanner.nextLine();
                        System.out.print("입차 '시'를 입력해주세요 : ");
                        시[입력받은층수] = scanner.nextLine();
                        System.out.print("입차 '분'을 입력해주세요 : ");
                        분[입력받은층수] = scanner.nextLine();
                        System.out.println("\n");
                    }else{              // IF3 END
                        System.out.println("입차불가");
                    }
                }else{          // IF3 END
                    System.out.println("잘못된 층을 입력하셧습니다\n");
                }
            }else if(입출.equals("출차")){      // IF 1 END // ELSE IF START
                System.out.println("층을 입력해주세요 : ");
                출차층 = scanner.next();
                int 출차층수 = Integer.parseInt(출차층) - 1;

                if(출차층수==0 || 출차층수==1 || 출차층수==2) {      // IF4 START
                    if (층[출차층수].equals("")) {       // IF5 START
                        System.out.println("입차량이 없습니다.");
                    } else {                // IF5 END      // IF5 ELSE START
                        System.out.println("출차시를 입력하세요 : ");
                        출차시 = scanner.next();
                        System.out.println("출차분을 입력하세요 : ");
                        출차분 = scanner.next();

                        //금액 계산 - 10분당 1000원
                        if (Integer.parseInt(출차시) > Integer.parseInt(시[출차층수])) {    // IF6 START
                            금액 = (Integer.parseInt(출차시) - Integer.parseInt(시[출차층수]) - 1) * 6000
                                    + (60 - Integer.parseInt(분[출차층수]) + Integer.parseInt(출차분)) * 100;
                            System.out.println("출차완료[사용금액 : " + 금액 + "]원\n");
                            층[출차층수] = "";
                            시[출차층수] = "";
                            분[출차층수] = "";
                        } else if (Integer.parseInt(출차시) == Integer.parseInt(시[출차층수]) &&
                                Integer.parseInt(출차분) > Integer.parseInt(분[출차층수])) {
                            금액 = (Integer.parseInt(출차분) - Integer.parseInt(분[출차층수])) * 100;
                            System.out.println("출차완료[사용금액 : " + 금액 + "]원\n");
                            층[출차층수] = "";
                            시[출차층수] = "";
                            분[출차층수] = "";
                        } else {
                            System.out.println("잘못 입력하셨습니다.");
                        }
                    }       // IF5 ELSE END
                }else{      // IF4 END
                    System.out.println("입차된 차량이 없습니다.");
                }
            }else{          // ELSE IF END
                System.out.println("다시 입력해주세요.");
            }
        }   // WHILE END
    }   // MAIN END
}   // CLASS END