package 과제.과제3.ex3;

import java.time.LocalDateTime;
import java.util.Scanner;

public class Level3_3 {
	
	public static void main(String[] args) {
		System.out.println(" >> Level3_3 answer >> ");
		System.out.println(" >> answer time : " + LocalDateTime.now() +" >> \n" );
		
		int july1 = 3532100; 
		int july2 = 9123700;
		int july3 = 5183400;
		int july4 = 11738700;
		
		/* 문제풀이 위치 */
		System.out.println("======== 7월 매출액 ========");
		int july1Data=july1/1000000;
		int july2Data=july2/1000000;
		int july3Data=july3/1000000;
		int july4Data=july4/1000000;

		if(july1>=1000000){	// IF1 START
			System.out.print("1주차 : ");
			for(int i=0; i<july1Data; i++){	// FOR START
				System.out.print("■");
			}	// FOR END
		}	// IF1 END
		System.out.print(july1/10000+"만원");
		System.out.println();

		if(july2>=1000000){	// IF1 START
			System.out.print("2주차 : ");
			for(int i=0; i<july2Data; i++){	// FOR START
				System.out.print("■");
			}	// FOR END
		}	// IF1 END
		System.out.print(july2/10000+"만원");
		System.out.println();

		if(july3>=1000000){	// IF1 START
			System.out.print("3주차 : ");
			for(int i=0; i<july3Data; i++){	// FOR START
				System.out.print("■");
			}	// FOR END
		}	// IF1 END
		System.out.print(july3/10000+"만원");
		System.out.println();

		if(july4>=1000000){	// IF1 START
			System.out.print("4주차 : ");
			for(int i=0; i<july4Data; i++){	// FOR START
				System.out.print("■");
			}	// FOR END
		}	// IF1 END
		System.out.print(july4/10000+"만원");
		System.out.println();

		/* ----------- */
	}
}
/* 
	[문제] 
		다음과 같이 july1,july2,july3,july4 변수는 7월의 1주차,2주차,3주차,4주차 의 매출액이 저장된 변수 입니다.
		1. 주차별로 100만원당 도형 '■' 출력하시오.
		2. 도형 뒤로는 그림과 같이 만원대 까지만 출력하시오.
	[조건] 
		1. 문제풀이 위치 외 코드는 수정 불가 합니다.

		만약 july1이 100만보다 크면{
		july1 나누기 100만  몫 만큼 ■출력
		july1 나누기 1만 목 출력

*/
