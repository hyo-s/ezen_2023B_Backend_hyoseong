package day13;  // PACKAGE NAME

public class Car {  // CLASS START
    public int speed;
    public void speedUp(){
        speed += 1;
    }
    public final void stop(){
        System.out.println("차를 멈춤");
        speed = 0;
    }
}   // CLASS END
