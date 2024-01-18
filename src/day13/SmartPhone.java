package day13;  // PACKAGE NAME
/*
    상속
        - 클래스를 재사용해서 새로운 클래스를 만들때 중복되는 코드를 줄여 개발 시간을 단축시킨다.
        - 클래스의 수정을 최소화할 수 있다 부모 클래스를 수정하면 모든 자식 클래스에 수정 효과를 가져온다.
        1. 부모클래스와 필드/메소드를 자식클래스에게 물려받는다.
        2. 자식이 부모를 선택한다.
        3. 자식클래스 선언시 클래스명 뒤에 extends(연장하다)
        4. 자식클래스가 가질 수 있는 부모의 개수는 1개 = 다중 상속 불가능
            1. 설계
            2. 라이브러리 / 프레임워크
*/

public class SmartPhone extends Phone {   // CLASS START

    // 1. 필드
    public boolean wifi;

    // 2. 생성자 : 객체 생성시 초기화 담당 ( + 무조건 1번 )
    public SmartPhone(String model, String color) {
        // - 생성자 첫줄에 부모 생성자 호출한다. ( 생략가능 - 컴파일시 자동 추가 )
        // super(model, color);
        // * this : 현재 객체 뜻 하는 키워드
        this.model = model;
        this.color = color;
    }

    // 3. 메소드
        // 1. 매개변수 : boolean, 반환값 : X
    public void setWifi(boolean wifi){
        this.wifi = wifi;
        System.out.println("와이파이 상태를 변경했습니다.");
    }
        // 2. 매개변수 : X, 반환값 : X
    public void internet(){
        System.out.println("인터넷에 연결합니다.");
    }
}   // CLASS END
