package day22;  // PACKAGE NAME

public class HomeAgency implements Rentable<Home> {   // CLASS START

    @Override
    public Home rent() {
        return new Home();
    }
}   // CLASS END
