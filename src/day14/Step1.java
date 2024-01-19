package day14;  // PACKAGE NAME

/*
            A
        B       C
        D       E
*/

class A{ }

class B extends A{ }    // B의 부모는 A

class C extends A{ }    // C의 부모는 A

class D extends B{ }    // D의 부모는 B

class E extends C{ }    // E의 부모는 C

public class Step1 {    // CLASS START
    public static void main(String[] args) {    // MAIN START

        B b = new B();
        D d = new D();
        C c = new C();
        E e = new E();

        // A 타입으로 자동 타입 변환
        A a1 = b;
        A a2 = c;
        A a3 = d;
        A a4 = e;

        // B, C 타입으로 자동 타입 변환
        B b1 = d;
        C c1 = e;
        // B b2 = e;   // 불가능
        // C c2 = d;   // 불가능

    }   // MAIN END
}   // CLASS END
