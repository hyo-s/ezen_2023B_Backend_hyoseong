package day21;  // PACKAGE NAME

public class Button {   // CLASS START

    // 중첩 인터페이스
    public static interface ClickListener{
        void onClick();
    }

    // 필드
    private ClickListener clickListener;

    public void setClickListener(ClickListener clickListener){
        this.clickListener = clickListener;

    }
    public void click(){
        this.clickListener.onClick();
    }

}   // CLASS END
