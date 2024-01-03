package day02;

import java.util.Scanner;

public class Step3 { // c s
    public static void main(String[] args) { // m s
        // [p.70] 콘솔에서 키보드로부터 입력 받고 변수에 저장
            // [ 준비물 ]
            // 1. Scanner 클래스 : 입력에 관련된 메소드/속성 제공 하는 설계도.
            // 2. Scanner 클래스 이용한 객체 생성
                // Scanner scanner = new Scanner( System.in );
                // 클래스명 변수명     new 클래스명( 매개변수 );
                    // System.in : 시스템 입력 = 키보드
                    // System.out : 시스템 출력 = 모니터(콘솔)

            // 3. 객체/변수 이용한 입력값 호출 메소드
                // 객체/변수명.nextLine() : 엔티 키가 입력되면 지금까지 입력된 모든 내용을 읽는다.

            // [1] 객체 생성
        // new Scanner( System.in);
            // [2] 객체 생성 했으면 담아야 변수(타입:객체의타입) 에 한다.
        Scanner scanner = new Scanner( System.in);
            // [3] 객체를 통한 메소드 호출.
        //scanner.nextLine();
            // [4] 메소드 호출의 결과을[return] 또 다른 변수에 저장한다.
        String str = scanner.nextLine();
        System.out.println("str = " + str); // soutv

        // [ Scanner 제공하는 메소드 ]
        // 1. 입력받은 문자열(String) 반환.  띄어쓰기 포함 불가
        String str1 = scanner.next();
        System.out.println("str1 = " + str1);

        scanner.nextLine(); // 의미 없는 nextLine() 추가하기.
        // 2. 입력받은 문자열(String) 반환   띄어쓰기 포함 [ 주의할점 : 앞에 next() 있을경우 하나로 취급 ]
        String str2 = scanner.nextLine();       System.out.println("str2 = " + str2);
        // 3. 입력받은 논리(boolean) 반환
        boolean bool = scanner.nextBoolean();    System.out.println("bool = " + bool);
        // 4. 입력받은 바이트(byte) 반환 
        byte b = scanner.nextByte();             System.out.println("b = " + b);
        // 5. 입력받은 쇼트(short) 반환
        short s = scanner.nextShort();           System.out.println("s = " + s);
        // 6. 입력받은 인트(int) 반환
        int i = scanner.nextInt();               System.out.println("i = " + i);
        // 7. 입력받은 롱(long)반환
        long l = scanner.nextLong();             System.out.println("l = " + l);
        // 8. 입력받은 플롯(float) 반환
        float f = scanner.nextFloat();           System.out.println("f = " + f);
        // 9. 입력받은 더블(double) 반환
        double d = scanner.nextDouble();         System.out.println("d = " + d);
        // 10. 입력받은 문자(char) 반환 없음
            //--> "문자열".charAt(추출인덱스) : 문자열에서 문자1개 추출 함수
        char ch = scanner.next().charAt(0); // 첫글자 추출
        System.out.println("ch = " + ch);

        // *    기본타입 비교시 ==
        //          vs 참조타입(문자열) 비교시 "문자열".equals("비교할문자열");









    } // m e
} // c e
/*
    타입
        1.기본타입( int , double , float 등 소문자. )
        2.참조타입( String , Scanner , System , Integer 등등 )

*/


/*
        // p.73 ~ 75 확인문제.
            // 1. (4)
                1. 변수 : 하나의 값만 저장  VS 배열 : 여러개의 값 저장.
                2. 선언시 사용한 타입의 허용 범위내 데이터 저장.
                3. { } 안에서 선언된 변수는 { } 밖에서 호출이 불가능하다.
                4. 없다. [ 필드는 초기값이 없으면 기본값이 할당 ]

            // 2. (2,3,6,7)
                int modelName;
                int class;
                int 6hour;
                int $value;
                int _age;
                int #name;
                int int;

            // 3.
                byte    short   int     long
                        char
                                float   double
                boolean

            // 4.
                타입 : int , double
                변수이름 : age , price
                리터럴 : 10 , 3.14;

            // 5. (3)
                byte : -128 ~ 127
                char : unsigned(부호x) 0~65535

                1. int = byte   [자동]    4바이트 <- 1바이트
                2. int = char   [자동]    4바이트 <- 1바이트
                3. short = char [자동]    2바이트 <- 2바이트  [ unsigned ]
                4. double = byte [자동]   8바이트 <- 1바이트

            // 6. (4)
                int 10           char 'A'
                double 5.7       String "A" <-- 1바이트
                1. double = (double)int   8바이트 <- 4바이트
                2. byte = (byte)int       1바이트 <- 4바이트
                3. int = (int)double      4바이트 <- 8바이트
                4. char = (char)String    2바이트 <- ?????

            // 7. (3)
                int var1 = 10;
                long var2 = 1000000000000L;
                char var3 = '';  // char '' 사용불가능 , 공백 ' ' 띄어쓰기
                float var4 = 10;
                String var5 = "abc\ndef";
                String var6 = """
                        abc
                        def
                        """;

            // 8. (3)
                바꾼다 -> 출력한다.

            // 9. (1) : byte , short 무조건 int 반환
                byte 10    float 2.5f   double 2.5
                1. byte = byte + byte           byte + byte = > int     [x]
                2. int = 5 + byte               int + byte = > int
                3. float = 5 + float            int + float => float
                4. double = 5 + double          int + double => double

            // 10. (2)
                Int.parseInt()      [X]
                Integer.parseInt()  [O]

            // 11. 지역변수의 허용범위 : { } 안에서 선언된 변수는 밖으로 호출/사용 불가능.
                    int v1= 1;
                    System.out.println("v1 = " + v1);
                    if( true ){
                        int v2 = 2;
                        if( true ){
                            int v3 = 2;
                            System.out.println("v1 = " + v1);
                            System.out.println("v2 = " + v2);
                            System.out.println("v3 = " + v3);
                        }
                        System.out.println("v1 = " + v1);
                        System.out.println("v2 = " + v2);
                        // System.out.println("v3 = " + v3); // 여기
                    }
                    System.out.println("v1 = " + v1);
                    //System.out.println("v2 = " + v2); // 여기
*/

