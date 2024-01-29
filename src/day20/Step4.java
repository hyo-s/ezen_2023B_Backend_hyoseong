package day20;  // PACKAGE NAME

public class Step4 {    // CLASS START
    // 1.
    public static void printLength(String data){    // METHOD START

        // 예외가 발생할 것 같은 코드
        try{
        int result = data.length(); // . (도트) 접근연산자 : 참조객체의 인스턴스 멤버 호출
        System.out.println("문자수 = " + result);
            // 만약에 try에서 예외가 발생하면 catch 실행
        }catch (NullPointerException e){
            System.out.println(e);
            System.out.println(e.getMessage());
                // System.out.println(e.toString());
                // e.printStackTrace();
        }finally {
            System.out.println("[마무리 실행]");
        }
    }   // METHOD END

    public static void main(String[] args) {    // MAIN START

        // 1. [실행예외 - 컴파일 시 예외 검사 안함] NullPointerException
        System.out.println("[프로그램 시작]");
        printLength("ThisIsJAVA");
        printLength(null);  // null 참조가 없으므로 . 접근연산자 불가능
        System.out.println("[프로그램 종료]");

        // 2. [일반예외 - 컴파일 시 예외 검사 진행]  ClassNotFoundException
        try {
            Class.forName("java.lang.String");
            // Class.forName("java.lang.string2");
        } catch (ClassNotFoundException e){
            System.out.println(e);
            e.printStackTrace();
        }
        System.out.println("[프로그램 종료]");

        // 3. 다중 catch 가능
        String[] array = {"100","1oo"};
        for (int i = 0 ; i<array.length; i++){  // FOR START
            try {
                int value = Integer.parseInt(array[i]); // NumberFormatException "1oo"는 정수타입으로 변환 불가능
                        // ArrayIndexOutOfBoundsException : 2 인덱스는 존재하지 않는다
            }catch (NullPointerException | NumberFormatException e){
                System.out.println(i + "숫자로 변환 할 수 없음" + e.getMessage());
            }catch (ArrayIndexOutOfBoundsException e){
                System.out.println(i + "배열 인덱스가 초기화 됨" + e.getMessage());
            }catch (Exception e){
                System.out.println("상위 예외클래스");
            }
        }   // FOR END
    }   // MAIN END
}   // CLASS END
