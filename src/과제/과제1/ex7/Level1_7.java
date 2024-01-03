package 과제.과제1.ex7;

import java.time.LocalDateTime;
import java.util.Scanner;

public class Level1_7 {
	
	public static void main(String[] args) {
		System.out.println(" >> Level1_7 answer >> ");
		System.out.println(" >> answer time : " + LocalDateTime.now() +" >> \n" );
		Scanner scanner = new Scanner(System.in);
		
		String output = "";
		
		/* 문제풀이 위치 */
		String str = scanner.nextLine();
		boolean bool = scanner.nextBoolean();
		byte b = scanner.nextByte();
		char ch = scanner.next().charAt(0);
		short s = scanner.nextShort();
		int i = scanner.nextInt();
		long l = scanner.nextLong();
		float f = scanner.nextFloat();
		double d = scanner.nextDouble();

		System.out.println("회원명 String = " + str);
		System.out.println("상태 boolean = " + bool);
		System.out.println("회원번호 byte = " + b);
		System.out.println("성별 char = " + ch);
		System.out.println("나이 short = " + s);
		System.out.println("포인트 int = " + i);
		System.out.println("예금액 long = " + l);
		System.out.println("키 float = " + f);
		System.out.println("몸무게 double = " + d);
		System.out.println("==========회원 개인정보=============");
		System.out.println("|\t\t\t"+"회원명 : " + str+"\t\t|");
		System.out.println("|\t\t\t"+"상태 : " + bool+"\t\t\t|");
		System.out.println("|\t\t\t"+"회원번호 : " + b+"\t\t|");
		System.out.println("|\t\t\t"+"성별 : " + ch+"\t\t\t\t|");
		System.out.println("|\t\t\t"+"나이 : " + s+"\t\t\t|");
		System.out.println("|\t\t\t"+"포인트 : " + i+"\t\t|");
		System.out.println("|\t\t\t"+"예금액 : " + l+"\t\t|");
		System.out.println("|\t\t\t"+"평균 : " + f+"\t\t\t|");
		System.out.println("|\t\t\t"+"평균 : " + d+"\t\t\t|");


		/* ----------- */
	}
}
/* 
	[문제조건] 
		1. 문제풀이 위치 외 코드는 수정 불가 합니다.
		2. 기본 자료형8개 + 문자열클래스 변수 1개 를 이용한 9개변수를 입력 받습니다.
		3. 입력받은 9개 변수를 그림과 같이 출력합니다.
		4. 기존에 미리 작성된 변수를 최대한 활용합니다.
		
*/
