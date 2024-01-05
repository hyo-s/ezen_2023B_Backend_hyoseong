package day04;  // 패키지 이름

public class Step2 {    // CLASS START
    public static void main(String[] args) {    // MAIN START

        // p.125
        // 1. 1~10까지 출력하는 코드
        System.out.print(1 + " ");
        System.out.print(2 + " ");
        System.out.print(3 + " ");
        System.out.print(4 + " ");
        System.out.print(5 + " ");
        System.out.print(6 + " ");
        System.out.print(7 + " ");
        System.out.print(8 + " ");
        System.out.print(9 + " ");
        System.out.print(10 + " ");

        // 2. for 변환
        for(int i=1; i<=10; i++){   // FOR START
            System.out.print(i + " ");
        }   // FOR END

        // 1~100까지 합.
        int sum = 0;    // 누적합계, for 안에서도 쓰고 밖에서도 쓰려고
        int i = 1;
        for(i=1; i<=100; i++){  // FOR START
            sum += i;   // vs sum sum +i;
        }   // FOR END
        System.out.println("1~" + (i-1) + "합 : " + sum);

        // 3. 구구단 : 중첩 for문
        for(int 단 = 2; 단 <=9; 단++){ // FOR1 START
            for(int 곱 = 1; 곱 <=9; 곱++){ // FOR2 START
                // System.out.print("열/곱 " + 곱);
                // System.out.print(단 + " X " + 곱 + " = " + (단+곱));
                System.out.printf("%3d X %-3d = %-3d ", 단, 곱, (단+곱));
            }   // FOR2 ENd
            // System.out.println("행/단 " + 단);
            System.out.println();
        }   // FOR1 END

        // 4. for -> while 1~10 출력
        int j = 1;
        while(j <= 10){   // WHILE START
            System.out.print(j + " ");
            j++;
        }   // WHILE END

        // 5. for -> while 1~100까지 누적합계
        int sum2 = 0;
        int m = 1;
        while(m <= 100){    // WHILE START
            sum2 += m;
            m++;
        }   // WHILE END
        System.out.println("1~" + (m-1) + "합 : " + sum2);

    }   // MAIN END
}   // CLASS END
