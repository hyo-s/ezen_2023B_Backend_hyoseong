package 과제.과제7; // PACKAGE NAME

import java.util.Scanner;

public class View { // CLASS START
    // 싱글톤 필드
    private static View view = new View();

    // 싱글톤 생성자
    private View(){}

    // 싱글톤 메소드
    public  static View getInstance(){
        return view;
    }

    Scanner scanner = new Scanner(System.in);

    public void run(){
        while (true){
            System.out.println("======= 메인페이지 ======");
            System.out.println("1.회원가입 | 2.로그인 | 3.아이디 찾기 | 4.비밀번호 찾기");
            System.out.print("선택> ");
            int ch = scanner.nextInt();

            if(ch==1){
                signup();
            }
            if(ch==2){
                login();
            }
            if(ch==3){
                findId();
            }
            if(ch==4){
                findPw();
            }
        }
    }

    public void signup(){
        System.out.print("아이디 > ");
        String id = scanner.next();
        System.out.print("비밀번호 > ");
        String pw = scanner.next();
        System.out.print("이름 > ");
        String name = scanner.next();
        System.out.print("전화 > ");
        String phone = scanner.next();
        System.out.print("나이 > ");
        String age = scanner.next();

        MemberDto memberDto = new MemberDto(id, pw, name, phone, age);
        System.out.println(memberDto.toString());

        boolean result = Controller.getInstance().signup(memberDto);

        if(result){
            System.out.println("회원가입 성공!");
        }else {
            System.out.println("회원가입 실패!");
        }
    }

    public void login(){
        System.out.print("아이디 : ");
        String id = scanner.next();
        System.out.print("비밀번호 : ");
        String pw = scanner.next();

        MemberDto memberDto = new MemberDto();
        memberDto.setId(id);
        memberDto.setPw(pw);

        boolean result = Controller.getInstance().login(memberDto);

        if(result){
            System.out.println("로그인 성공!");
        }else{
            System.out.println("로그인 실패!");
        }

    }

    public void findId(){
        System.out.print("이름 > ");
        String name = scanner.next();
        System.out.print("전화번호 > ");
        String phone = scanner.next();

        MemberDto memberDto = new MemberDto();
        memberDto.setName(name);
        memberDto.setPhone(phone);

        boolean result = Controller.getInstance().findId(memberDto);

        for(int i=0; i<MemberDao.getInstance().memberDtos.size(); i++){
            if(result){
                if(name.equals(MemberDao.getInstance().memberDtos.get(i).getName())){
                    if(phone.equals(MemberDao.getInstance().memberDtos.get(i).getPhone())){
                        System.out.println("아이디 > " + MemberDao.getInstance().memberDtos.get(i).getId());
                    }
                }
            }else {
                System.out.println("찾으시는 아이디가 없습니다.");
            }
        }
    }

    public void findPw(){
        System.out.print("아이디 > ");
        String id = scanner.next();
        System.out.print("전화번호 > ");
        String phone = scanner.next();

        MemberDto memberDto = new MemberDto();
        memberDto.setName(id);
        memberDto.setPhone(phone);

        boolean result = Controller.getInstance().findPw(memberDto);

        for(int i=0; i<MemberDao.getInstance().memberDtos.size(); i++){
            if(result){
                if(id.equals(MemberDao.getInstance().memberDtos.get(i).getId())){
                    if(phone.equals(MemberDao.getInstance().memberDtos.get(i).getPhone())){
                        System.out.println("비밀번호 > " + MemberDao.getInstance().memberDtos.get(i).getPw());
                    }
                }
            }else{
                System.out.println("찾으시는 아이디 및 비밀번호가 없습니다.");
            }
        }
    }

    public static void main(String[] args) {
        View.getInstance().run();
    }
}   // CLASS END
