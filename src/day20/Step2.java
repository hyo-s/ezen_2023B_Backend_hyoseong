package day20;  // PACKAGE NAME

public class Step2 {    // CLASS START
    public static void main(String[] args) {    // MAIN START

        // SmartTelevision 객체 생성
        RemoteControl2 rc = new SmartTelevision();

        rc.turnOn();
        rc.turnOff();
        // rc.search("주소");

        Searchable searchable = new SmartTelevision();
        searchable.turnOn();
        // searchable.turnOff();
        searchable.search("주소");

    }   // MAIN END
}   // CLASS END
