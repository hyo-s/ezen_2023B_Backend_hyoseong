package day11.exam01.package1;  // PACKAGE NAME

public class A2 {   // CLASS START

    // * 필드와 메소드 접근제한자
    public int field1;  // public 필드
    int field2;         // default 필드
    private int field3; // private 필드

    public A2(){
        field1 = 1; // public 필드는 내부에서 접근 가능
        field2 = 1; // default 필드는 내부에서 접근 가능
        field3 = 1; // private 필드는 내부에서 접근 가능

        method1();  // public 메소드는 내부에서 접근 가능
        method2();  // default 메소드는 내부에서 접근 가능
        method3();  // private 메소드는 내부에서 접근 가능
    }

    // * 메소드 접근제한자
    public void method1(){ }
    void method2(){ }
    private void method3(){ }

    // * 생성자 접근제한자
    public A2(boolean b){ }     // public 생성자
    A2 a1 = new A2(true);   // 내부에서 생성자 호출 가능

    A2(int b){ }            // (default) 생성자
    A2 a2 = new A2(1);      // 내부에서 생성자 호출 가능

    private A2(String s){ }     // private 생성자
    A2 a3 = new A2("문자열");      // 내부에서 생성자 호출 가능

    // 매개변수의 타입과 개수 순서에 따라 여러개 생성자를 만들어주는 것을 오버로딩

}   // CLASS END
