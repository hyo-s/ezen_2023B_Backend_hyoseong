package 과제.과제5; // PACKAGE NAME


public class Member {   // CLASS START

    // 필드
    String id;
    String pw;
    String name;
    String phone;
    String age;

    // 생성자
    Member(String id, String pw, String name, String phone, String age){
        this.id = id;
        this.pw = pw;
        this.name = name;
        this.phone = phone;
        this.age = age;
    }
    @Override
    public String toString() {
        return "Member{" +
                "id='" + id + '\'' +
                ", pw='" + pw + '\'' +
                ", name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                ", age='" + age + '\'' +
                '}';
    }
}   // CLASS START
