package 과제.과제3.ex2;

import java.time.LocalDateTime;
import java.util.Scanner;

public class Level3_2 {
	
	public static void main(String[] args) {
		System.out.println(" >> Level3_2 answer >> ");
		System.out.println(" >> answer time : " + LocalDateTime.now() +" >> \n" );
		Scanner scanner = new Scanner(System.in);
		
		
		/* 문제풀이 위치 */
		int num = 0;
		String strArray ="";
		String str;
		String[] array;
		while(true) {	// WHILE START
			System.out.print("문구를 입력하세요 : ");
			str = scanner.nextLine();
			strArray += str + ",";
			num++;
			array = strArray.split(",");
			for(int i=0; i<array.length; i++){	// FOR1 START
				if(array[i].equals("end")) {	// IF END
					for (int j = 0; j < array.length; j++) {	// FOR2 START
						System.out.println(j + 1 + "회 입력 : " + array[j]);
					}	// FOR2 END
					System.out.println("안내) 프로그램 종료 합니다.[총" + i + "회 입력]");
				}	// IF END
			}	// FOR1 END
		}	// WHILE END
		/* ----------- */
	}
}
/* 
	[문제] 
		그림과 같이 무한적으로 문자열을 입력 받다가 end 입력시 
		입력받은 횟수와 문구를 출력후 종료되는 반복문을 구현하시오.
	[조건] 
		1. 문제풀이 위치 외 코드는 수정 불가 합니다.

*/

/*
			System.out.print("문구를 입력하세요 : ");
			str = scanner.nextLine();
			num++;
			array = new String[num];
			array[num] = str;
			for(int i=0; i<num; i++){	// FOR START
				System.out.println(array[i]);
				if (array[i].equals("end")){	// IF START
					System.out.printf("%2d회 입력 : %s", i, array[i]);
					System.out.println();
					System.out.printf("프로그램 종료 합니다.[총 %2d회 입력]", num-1);
					break;
				}	// IF END
			}	// FOR END
*/
