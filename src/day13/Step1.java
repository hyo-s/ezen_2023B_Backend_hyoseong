package day13;  // PACKAGE NAME

public class Step1 {    // CLASS START
    public static void main(String[] args) {    // MAIN START

        // p.286 ~

            // 왜? SmartPhone 클래스의 객체를 생성했는데 Phone 멤버 호출이 가능한 이유 : 상속 받아서 / 물려받았기 때문에

            // 1. SmartPhone 객체 ( + Phone )
        SmartPhone myPhone = new SmartPhone("갤럭시","은색");

            // 2. 객체 내 필드 호출 ( + Phone 필드 호출 )
        System.out.println("모델 : " + myPhone.model);
        System.out.println("모델 : " + myPhone.color);

            // 3. SmartPhone 객체 내 필드 호출
        System.out.println("와이파이 상태 : " + myPhone.wifi);

            // 4. SmartPhone 객체 내 메소드 호출 ( + Phone 메소드 호출 )
        myPhone.bell();
        myPhone.sendVoice("여보세요");
        myPhone.receiveVoice("안녕하세요! 저는 홍길동인데요.");
        myPhone.sendVoice("아~ 네 반갑습니다.");
        myPhone.hangUp();

            // 5. SmartPhone 객체 내 메소드 호출
        myPhone.setWifi(true);
        myPhone.internet();

    }   // MAIN END
}   // CLASS END
