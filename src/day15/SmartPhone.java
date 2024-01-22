package day15;  // PACKAGE NAME

public class SmartPhone extends Phone {   // CLASS START

    // 부모의 생성자를 호출
    SmartPhone( String owner){
        super(owner);
    }

    void internetSearch(){
        System.out.println("인터넷 검색을 합니다.");
    }
}   // CLASS END
