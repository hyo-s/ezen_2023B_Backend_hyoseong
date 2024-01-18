package day13.step4.package1;   // PACKAGE NAME

public class B {    // CLASS START

    public void method(){
        // 같은 패키지끼리 가능
        A a = new A();
        a.field = "value";
        a.method();
    }
}   // CLASS END
