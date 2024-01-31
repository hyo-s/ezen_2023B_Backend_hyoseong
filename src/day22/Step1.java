package day22;  // PACKAGE NAME

public class Step1 {    // CLASS START
    public static void main(String[] args) {    // MAIN START

        // 1. 특정 타입의 필드가 아닌 다형성을 이용한 다양한 타입의 필드
        Box box = new Box();
        // 2. Object타입 필드에 문자 데이터 대입
        box.content = "안녕하세요";
        // 3. 꺼내기
        System.out.println( box.content );
            //String content = box.content;
        String content = (String)box.content;
            // - 혹여나 자식클래스의 타입을 모르는경우 instanceOf 연산자
        // - 한계
        // Object타입 필드에 정수 데이터 대입
        box.content = 100;
        System.out.println( box.content );
            // int content2 = box.content;
        int content2 = (Integer) box.content;
    // ----------------------------------------------------- //
        // 1. 클래스로 객체생성 할때 <T> 제네릭 타입 정의
        Box2<String> box2 = new Box2<>();
        // 2.
        box2.content = "안녕하세요";
        System.out.println( box2.content );
        String content3 = box2.content;

        Box2<Integer> box3 = new Box2<>();
        box3.content = 100;
        System.out.println( box3.content );
        int content4 = box3.content;
    // -------------------------------------------------- //
        // 만일 제네릭에 타입을 지정을 안했을때 자동으로 Object
        Box2 box4 = new Box2();
    }   // MAIN END
}   // CLASS END
