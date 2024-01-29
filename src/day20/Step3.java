package day20;  // PACKAGE NAME

public class Step3 {    // CLASS START
    public static void main(String[] args) {    // MAIN START

        // 1. 구현 객체 생성
        InterfaceCImpl impl = new InterfaceCImpl();

        // 2. 구현객체가 자식과 부모 인터페이스의 모두
        InterfaceA ia = impl;
        ia.methodA();
        // ia.methodB();
        // ia.methodC();
        System.out.println();

        InterfaceB ib = impl;
        // ib.methodA();
        ib.methodB();
        // ib.methodC();
        System.out.println();

        InterfaceC ic = impl;
        ic.methodA();
        ic.methodB();
        ic.methodC();

    }   // MAIN END
}   // CLASS END
