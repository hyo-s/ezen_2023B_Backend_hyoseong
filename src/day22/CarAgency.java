package day22;  // PACKAGE NAME

// implements가 있어서 이 클래스는 구현 클래스
public class CarAgency implements Rentable<Car2> {    // CLASS START

    @Override
    public Car2 rent() {
        return new Car2();
    }
}   // CLASS END
