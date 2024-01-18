package 과제.과제6; // PACKAGE NAME

import day10.Account;

import java.util.Scanner;

public class Member {   // CLASS START

// =============================== 필드 =============================== //
    private String id;
    private String pw;
    private String name;
    private String phone;
    private String age;

// =============================== 생성자 =============================== //

    Member(){}
    Member(String id, String pw, String name, String phone, String age) {
        this.id = id;
        this.pw = pw;
        this.name = name;
        this.phone = phone;
        this.age = age;
    }

// =============================== 메소드 =============================== //

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


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPw() {
        return pw;
    }

    public void setPw(String pw) {
        this.pw = pw;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }
}   // CLASS END
