package day22;  // PACKAGE NAME

public class Step5 {    // CLASS START
    public static void main(String[] args) {    // MAIN START

        // Applicant <T>
            // 왜 T? 응모자의 kind 타입을 여러개 하려고
            // 1. Object

        /*
            Applicant<Person> applicant1{
                public Person kind = person1;
            }
        */
        // 1. 모든 사람이 신청 가능
            // 1. 사람 객체
        Person person1 = new Person();
            // 2. 사람 객체를 등록자1에 대입
        Applicant<Person> applicant1 = new Applicant<>(person1);
        Course.registerCourse1(applicant1);
        Course.registerCourse1(new Applicant<Worker>(new Worker()));
        Course.registerCourse1(new Applicant<Student>(new Student()));
        Course.registerCourse1(new Applicant<HighStudent>(new HighStudent()));
        Course.registerCourse1(new Applicant<MiddleStudent>(new MiddleStudent()));

        // 2.
        // Course.registerCourse2(new Applicant<Person>(new Person()));
        // Course.registerCourse2(new Applicant<Worker>(new Worker()));
        Course.registerCourse2(new Applicant<Student>(new Student()));
        Course.registerCourse2(new Applicant<HighStudent>(new HighStudent()));
        Course.registerCourse2(new Applicant<MiddleStudent>(new MiddleStudent()));

        // 3.
        Course.registerCourse3(new Applicant<Person>(new Person()));
        Course.registerCourse3(new Applicant<Worker>(new Worker()));
        // Course.registerCourse3(new Applicant<Student>(new Student()));
        // Course.registerCourse3(new Applicant<HighStudent>(new HighStudent()));
        // Course.registerCourse3(new Applicant<MiddleStudent>(new MiddleStudent()));

        // Integer.parseInt("유재석"); // 실행예외
        // Class.forName("java.spring"); // 일반예외
        // 예외 : 예외클래스 라이브러리 지원 ( 라이브러리에 없는 오류는 지원X )
            // 1. 일반예외 : 컴파일 전에 예외 검사
            // 2. 실행예외 : 컴파일 후에 예외 검사
        // if
            // 예외( try{ }catch( ){ } ) vs if(흐름제어){ } : 검사
            // 데이터( 경우의 수가 특정하지 않을 때 ) 미리 만들어진 라이브러리 vs 경우의 수가 정해진 값/데이터 따른 검사 if
    }   // MAIN END
}   // CLASS END
