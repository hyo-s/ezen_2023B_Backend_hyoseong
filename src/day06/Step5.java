package day06;  // PACKAGE NAME

import java.net.Inet4Address;
import java.util.Scanner;

public class Step5 {    // CLASS START
    public static void main(String[] args) {    // MAIN START
        Scanner scanner = new Scanner(System.in);
        System.out.println("시간 (hh mm ss 형식) : ");
        String time = scanner.nextLine();
        System.out.println("시간 (숫자) : ");
        String second = scanner.nextLine();

        String result = "";
        // 입력받은 time에서 second만큼 지난 시간을 hh mm ss 형식으로 출력

        // 1. 입력받은 time의 초 추출
        int ss = Integer.parseInt(time.substring(4,6));     System.out.println("ss = " + ss);  // 4~5까지 인덱스 문자 추출
        // 2. 입력받은 second를 time의 초에 더한다.
        ss += Integer.parseInt(second);

        // 3. 분
        int mm = Integer.parseInt(time.substring(2,4));     System.out.println("mm = " + mm);  // 2~3까지 인덱스 문자 추출
        mm += (ss/60); // 초를 60으로 나눈값을 분에 더한다.

        // 4. 시
        int hh = Integer.parseInt(time.substring(0,2));     System.out.println("hh = " + hh);  // 0~1까지 인덱스 문자 추출
        hh += (mm/60); // 분을 60으로 나눈 값의 목을 시에 더한다.

        System.out.printf("%2d : %2s : %2d\n",
                hh<10? "0"+hh:hh,
                mm%60<10 ? "0"+mm%60 : mm%60,
                ss%60<10 ? "0"+ss%60 : ss%60);

        result = (hh <10?hh:hh)+":"+(mm%60<10?"0"+mm%60:mm%60)+":"+(ss%60<10? "0"+ss%60 : ss%60);

        System.out.println("ss+Integer.parseInt(second) = " + (ss+Integer.parseInt(second)));
        System.out.println("result = " + result);
        /*
            예]
                time = 145930
                        012345
                second = 70
                    result = 15:00:40
        */

    }   // MAIN END
}   // CLASS END
