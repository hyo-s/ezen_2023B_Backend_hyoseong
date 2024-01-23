package 팀과제.팀과제4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // 구현체 목록
        Music[] musics = new Music[6];
        musics[0] = new Ballade( "노래1",30 , "발라드");
        musics[1] = new Ballade( "노래2",35, "발라드");
        musics[2] = new Ballade( "노래3",31, "발라드");
        musics[3] = new Hiphop( "노래4",30, "힙합");
        musics[4] = new Hiphop( "노래5",35, "힙합");
        musics[5] = new Hiphop( "노래6",31, "힙합");

        Scanner scanner = new Scanner(System.in);

        Mp3 myMp3;

        while (true){
            System.out.println("============= 장르 선택 =============");
            System.out.println("1.발라드 | 2.힙합 | 3.아이돌 | 4.pop");
            System.out.print("선택 > ");
            int no = scanner.nextInt();

            if(no == 1){
                for(int i = 0; i < musics.length; i++){
                    if(musics[i].type.equals("발라드")){
                        System.out.println(musics[i].title.toString());
                    }
                }
                System.out.println("=============== mp3 ===============");
                System.out.println("1.재생 | 2.중지 | 3.다음곡 | 4.이전곡");
                System.out.print("선택 > ");
                int ch = scanner.nextInt();

                myMp3 = new Ballade();

                if(ch == 1){
                    myMp3.turnOn();
                }else if(ch == 2){
                    myMp3.turnOff();
                }else if(ch == 3){
                    myMp3.after();
                }else if(ch == 4){
                    myMp3.before();
                }
            }else if(no == 2){
                for(int i = 0; i < musics.length; i++){
                    if(musics[i].type.equals("힙합")){
                        System.out.println(musics[i].title.toString());
                    }
                }
                System.out.println("=============== mp3 ===============");
                System.out.println("1.재생 | 2.중지 | 3.다음곡 | 4.이전곡");
                System.out.print("선택 > ");
                int ch = scanner.nextInt();

                myMp3 = new Hiphop();

                if(ch == 1){
                    myMp3.turnOn();
                }else if(ch == 2){
                    myMp3.turnOff();
                }else if(ch == 3){
                    myMp3.after();
                }else if(ch == 4){
                    myMp3.before();
                }
            }

        }

    }
}
