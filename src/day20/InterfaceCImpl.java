package day20;  // PACKAGE NAME

public class InterfaceCImpl implements InterfaceC {   // INTERFACE START
    // 자식 인터페이스를 구현할 때 부모 인터페이스 구현 해야한다.
    // * 추상메소드도 상속이 가능하다.
    @Override
    public void methodA() {
        System.out.println("InterfaceCImpl.methodA");
    }

    @Override
    public void methodB() {
        System.out.println("InterfaceCImpl.methodB");
    }

    @Override
    public void methodC() {
        System.out.println("InterfaceCImpl.methodC");
    }
}   // INTERFACE END
