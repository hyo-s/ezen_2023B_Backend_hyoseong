package 과제.과제1.ex8;

import java.time.LocalDateTime;
import java.util.Scanner;

public class Level1_8 {
	
	public static void main(String[] args) {
		System.out.println(" >> Level1_8 answer >> ");
		System.out.println(" >> answer time : " + LocalDateTime.now() +" >> \n" );
		Scanner scanner = new Scanner(System.in);
		
		String header = "\n============방문록===============\n번호\t 작성자 \t 방문록\n";
		String boardlist = "";
		String footer = "================================\n";
		String output = "";
		
		/* 문제풀이 위치 */

		String output1 = scanner.nextLine();
		String boardlist1 = scanner.nextLine();
		String output2 = scanner.nextLine();
		String boardlist2 = scanner.nextLine();
		String output3 = scanner.nextLine();
		String boardlist3 = scanner.nextLine();
		String output4 = scanner.nextLine();
		String boardlist4 = scanner.nextLine();
		String output5 = scanner.nextLine();
		String boardlist5 = scanner.nextLine();


		System.out.println("[1]작성자 : " + output1);
		System.out.println("[1]방문록 : " + boardlist1);

		System.out.println(header);
		System.out.println("1\t"+output1+"\t"+boardlist1);
		System.out.println(footer);


		System.out.println("[2]작성자 : " + output1);
		System.out.println("[2]방문록 : " + boardlist1);

		System.out.println(header);
		System.out.println("1\t"+output1+"\t"+boardlist1);
		System.out.println("2\t"+output2+"\t"+boardlist2);
		System.out.println(footer);

		System.out.println("[3]작성자 : " + output1);
		System.out.println("[3]방문록 : " + boardlist1);

		System.out.println(header);
		System.out.println("1\t"+output1+"\t"+boardlist1);
		System.out.println("2\t"+output2+"\t"+boardlist2);
		System.out.println("3\t"+output3+"\t"+boardlist3);
		System.out.println(footer);

		System.out.println("[4]작성자 : " + output1);
		System.out.println("[4]방문록 : " + boardlist1);

		System.out.println(header);
		System.out.println("1\t"+output1+"\t"+boardlist1);
		System.out.println("2\t"+output2+"\t"+boardlist2);
		System.out.println("3\t"+output3+"\t"+boardlist3);
		System.out.println("4\t"+output4+"\t"+boardlist4);
		System.out.println(footer);

		System.out.println("[4]작성자 : " + output1);
		System.out.println("[4]방문록 : " + boardlist1);

		System.out.println(header);
		System.out.println("1\t"+output1+"\t"+boardlist1);
		System.out.println("2\t"+output2+"\t"+boardlist2);
		System.out.println("3\t"+output3+"\t"+boardlist3);
		System.out.println("4\t"+output4+"\t"+boardlist4);
		System.out.println("5\t"+output5+"\t"+boardlist5);
		System.out.println(footer);
		/* ----------- */
	}
}
/* 
	[문제] 그림과 같이 기본자료형을 이용하여 변수 8개를 출력하시오.
	[조건] 
		1. 문제풀이 위치 외 코드는 수정 불가 합니다.
		2. 문자열클래스를 이용하여 그림과 같이 제목과 내용을 입력받습니다. [ 내용만 띄어쓰기가 가능하도록 입력받습니다 ]
		3. *반복문을 사용하지 않고 총 5개의 방문록이 작성 되도록 작성하시오.
		4. 방문록 1번 작성할때마다 방문록을 목록을 보여줍니다.
		5. 기존에 미리 작성된 변수를 최대한 활용합니다.
*/
