package day15;  // PACKAGE NAME

public class Step3 {    // CLASS START
    public static void main(String[] args) {    // MAIN START
        Dog dog = new Dog();
        dog.sound();

        Cat cat = new Cat();
        cat.sound();

        Animal dog1 = new Dog();

        animalSound( dog1 );
        animalSound( new Cat() );
        
    }   // MAIN END
    // 매개변수 다형성
    public static void  animalSound (Animal animal){
        animal.sound();
    }
}   // CLASS END
