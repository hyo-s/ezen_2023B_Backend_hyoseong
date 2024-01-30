package day21;  // PACKAGE NAME

public class Click implements Button.ClickListener{    // CLASS START

    @Override
    public void onClick() {
        System.out.println("구현 객체를 이용한 OK버튼을 클릭했습니다.");
    }
}   // CLASS END
