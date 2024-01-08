package day05;  // 패키지 이름

import java.util.Scanner;

public class Step4 {    // CLASS START
    public static void main(String[] args) {    // MAIN START

        // * 입력객체
        Scanner scanner = new Scanner(System.in);

        // 5. int형 데이터를 여러개 저장할 수 있는 배열 선언.
        int[] students = new int[0];

        // 1. 무한루프
        while(true) {       // WHILE START

            // 2. 출력
            System.out.println();
            System.out.println("======================================================");
            System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
            System.out.println("======================================================");

            // 3. 입력
            System.out.print("선택> ");
            String ch = scanner.nextLine();

            // 4. 경우의 수
            if (ch.equals("1")) {   // IF START
                System.out.println("학생수> ");
                String count = scanner.nextLine();
                // while 밖에서 입력받은 수 만큼 배열 선언 => 다른 if { }에서 사용하기 위해
                // [p.172] 입력받은 (문자 -> 정수 변환) 만큼 배열길이 초기화
                students = new int[Integer.parseInt(count)];
            } else if (ch.equals("2")) {
                // 6.[1]번에서 입력받은 학생 수 만큼 점수를 입력받기
                for(int i=0; i<students.length; i++){       // FOR START
                    System.out.printf("scores[%d]> ",i);
                    // 입력받은 문자열 -> 정수 변환해서 i번째 인덱스에 값 저장
                    students[i] = Integer.parseInt(scanner.nextLine());
                }   // FOR END
            } else if (ch.equals("3")) {
                // 7. 배열내 모든 학생 점수 출력
                for(int i=0; i<students.length; i++){   // FOR START
                    System.out.printf("scores[%d]: %3d \n", i, students[i]);    // i번째 인덱스의 값 호출
                }   // FOR END
            } else if (ch.equals("4")) {
                int max = 0;    // 임의 최저 점수 대입하고 시작
                double sum = 0;    // 총 합계
                for(int i=0; i<students.length; i++){
                    // 만약에 i번째 인덱스의 값이 max보다 크면 대입
                    if(students[i] >= max){
                        max = students[i];
                    }
                    // [평균에서 사용할 총합계]
                    sum += students[i];
                }
                System.out.println("max = " + max);

                // 총합계 / 학생수(배열의 길이)
                double avg = sum / students.length;
                System.out.printf("avg = %.1f \n", avg);

            } else if (ch.equals("5")) {
                System.out.println("프로그램 종료");
                break;
            } else {

            }
        }   // WHILE END
    }   // MAIN END
}   // CLASS END
