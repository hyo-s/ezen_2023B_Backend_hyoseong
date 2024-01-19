package day14;   // PACKAGE NAME

public class Step2 {    // CLASS STAR
    public static void main(String[] args) {    // MAIN START

        // 1. 자식 객체 생성
        Child child = new Child();

        // 2. 자식객체의 타입을 부모타입으로 변환 ( 자동 타입 변환 )
        Parent parent = child;
            // 자식 객체가 부모 타입으로 변환 시 자식 타입의 필드/메소드를 사용할 수 없다.
            // 단) 오버라이딩 된 메소드는 부모 타입이 아닌 자식 타입의 메소드가 우선 갖는다. 다형성

        // 3. 메소드 호출
        parent.method1();
        parent.method2();

        System.out.println(parent.field1);
        // 부모 타입에서 자식 타입의 필드 / 메소드 사용불가
        // System.out.println(parent.field2);

        // 강제 타입 변환
        Child child1 = (Child)parent;
        System.out.println(child1.field1);
            // 자식 타입에서 부모 타입의 필드/메소드 사용가능
        System.out.println(child1.field2);

        // 부모객체 자식객체 저장하는 배열
        Parent[] parents = new Parent[3];
        for (int i=0; i<3; i++){
            parents[i] = new Parent();
        }
        Child[] children = new Child[3];
        for (int i=0; i<3; i++){
            children[i] = new Child();
        }



    }   // MAIN END
}   // CLASS END

