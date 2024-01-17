package 과제.과제6;	// PACKAGE NAME
import java.util.Scanner;

public class MemberSys { // class s 
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Member[] 객체배열 = new Member[100];

		while(true) {

			System.out.println("\n\n--------- 회원 시스템 ---------");
			System.out.print("1.회원가입 2.로그인 3.아이디찾기 4.비밀번호찾기   선택> ");
			int ch = sc.nextInt();

			if( ch == 1 ) {		// IF CH=1 START
				System.out.print("아이디 > ");
				String id = sc.next();
				System.out.print("비밀번호 > ");
				String pw = sc.next();
				System.out.print("이름 > ");
				String name = sc.next();
				System.out.print("전화번호 > ");
				String phone = sc.next();
				System.out.print("나이 > ");
				String age = sc.next();

				Member member = new Member(id, pw, name, phone, age);

				for(int i=0; i<객체배열.length; i++){
					if(객체배열[i]==null){
						객체배열[i]=member;
						System.out.println("안내] 회원가입 성공!");
						System.out.println(member.toString());
						break;
					}
				}
			}	// IF CH=1 END
			else if( ch == 2 ) {	// IF CH=2 START
				System.out.print("아이디 > ");
				String id = sc.next();
				System.out.print("비밀번호 > ");
				String pw = sc.next();

				for(int i=0; i<객체배열.length; i++) {
					if (객체배열[i] != null && 객체배열[i].getId().equals(id)) {
						if (객체배열[i] != null && 객체배열[i].getPw().equals(pw)) {
							System.out.println("안내] 로그인 성공!");
							break;
						} else {
							System.out.println("안내] 로그인 실패!");
							break;
						}
					}
				}
			}	// IF CH=2 END
			else if( ch == 3 ) {	// IF CH=3 START
				System.out.print("이름 > ");
				String name = sc.next();
				System.out.print("전화번호 > ");
				String phone = sc.next();

				for(int i=0; i<객체배열.length; i++){
					if(객체배열[i]!=null && 객체배열[i].getName().equals(name) && 객체배열[i].getPhone().equals(phone)) {
						System.out.println("안내] 아이디 > " + 객체배열[i].getId());
						break;
					}else{
						System.out.println("안내] 찾으시는 아이디가 없습니다.");
						break;
					}
				}

			}	// IF CH=3 END
			else if( ch == 4 ) {	// IF CH=4 START
				System.out.print("아이디 > ");
				String id = sc.next();
				System.out.print("전화번호 > ");
				String phone = sc.next();

				for(int i=0; i<객체배열.length; i++){
					if(객체배열[i]!=null && 객체배열[i].getId().equals(id) && 객체배열[i].getPhone().equals(phone)) {
						System.out.println("안내] 비밀번호 > " + 객체배열[i].getPw());
						break;
					}else{
						System.out.println("안내] 찾으시는 아이디가 없습니다.");
						break;
					}
				}

			}	// IF CH=4 END

		} // w e
	} // m e 
} // class e 
/*
	주제 : 회원제 시스템 part2
	 	- Member , MemberSys 클래스를 이용하여 아래 조건에 따라. 코드를 완성하시오.
 		- Member , MemberSys 클래스 외 새로운 클래스를 생성 하지 마시오.
 		- main() 메소드 외 기능별 함수를 4개 생성하시오.

		[ Member 클래스 ]
 		0. 아래 필드를 가지는 클래스를 설계 하시오.
 			필드 : 아이디 , 비밀번호 , 이름 , 전화번호 , 나이
		1. 생성자 사용하시오.
		2. getter , setter 메소드를 사용하시오.

		[ MemberSys 클래스 ]
		0. 배열
			Member[] 객체배열 = new Member[100];

		1. 초기 메뉴
			1. 회원가입 2.로그인 3.아이디찾기 4.비밀번호찾기
			
		2. 조건 기능 
			1. 회원가입 메소드 
				1. 아이디 , 비밀번호 , 이름 , 전화번호 , 나이  각 입력받아 저장 
				2. Member 객체화
				3. 객체를 배열 저장 
				 
			2. 로그인 메소드
				1. 아이디 , 비밀번호 입력받아 저장 
				2. 입력받은 값과 배열내 동일한 값 찾기
					- 만약에 동일한 값 있으면 로그인 성공 
					- 아니면 실패
					 
			3. 아이디찾기 메소드
				1. 이름 , 전화번호 입력받아 저장
				2. 입력받은 값과 배열내 동일한 값 찾기
					- 만약에 동일한 값 있으면 찾은 아이디 출력 
					- 아니면 없다.
					 
			4. 비밀번호찾기 메소드 
				1. 아이디 , 전화번호 입력받아 저장
				2. 입력받은 값과 배열내 동일한 값 찾기
					- 만약에 동일한 값 있으면 찾은 비밀번호 출력
					- 아니면 없다.

			
*/














