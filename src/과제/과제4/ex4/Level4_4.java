package 과제.과제4.ex4;

import javax.lang.model.element.NestingKind;
import java.time.LocalDateTime;
import java.util.Scanner;

public class Level4_4 {
	
	public static void main(String[] args) {
		System.out.println(" >> Level4_4 answer >> ");
		System.out.println(" >> answer time : " + LocalDateTime.now() +" >> \n" );
		Scanner scanner = new Scanner(System.in);

		String[] X_AXIS = new String[5];
		int x = 0;
		X_AXIS[ x ] = "★";

		while ( true ) {	// WHILE START
			/* 문제풀이 위치 */
			for (int i=0; i<X_AXIS.length; i++){	// FOR START
				System.out.print(X_AXIS[i]+" ");
			}	// FOR END

			System.out.println();
			System.out.print("1.전진 2.후진 선택> ");
			int ch = scanner.nextInt();

			if(ch==1 && x<4) {    // IF START
				x++;
				for (int i = 0; i < X_AXIS.length; i++) {	// FOR START
					X_AXIS[i] = null;
					if (i == x) {	// IF START
						X_AXIS[i] = "★";
					}	// IF END
				}    // FOR END
			}	// IF END
			if(ch==2 && x>0) {    // IF START
				x--;
				for (int i = 0; i < X_AXIS.length; i++) {	// FOR START
					X_AXIS[i] = null;
					if (i == x) {	// IF START
						X_AXIS[i] = "★";
					}	// IF END
				}    // FOR END
			}	// IF END
			/* ----------- */
		}	// WHILE END
	}
}
/* 
	[문제]
		1. String[] X_AXIS = new String[5]; : 문자열 배열 입니다.

		2. 기능선택
			1 입력시 별이 왼쪽으로 이동
			2 입력시 별이 오른쪽으로 이동
			- 만일 배열의 길이보다 벗어나면 최소 또는 최대 위치로 지정하시오.

		3. 그림과 배열의 항목/요소 들을 모두 출력하시오.

		4. 아래 변수들을 활용하시오.
			String[] X_AXIS = new String[5];
			int x = 0;
			X_AXIS[ x ] = "★";

			if (num==1){	// IF START
				String temp = "★";
				for (int i=0; i<X_AXIS.length; i++){// FOR START
					if(X_AXIS[i]!=null){
						if(i==X_AXIS.length-1)break;
						X_AXIS[i]=null;
						for(int j=i+1; i<X_AXIS.length; i++){
							if(j==X_AXIS.length)break;
							X_AXIS[j]=temp;
						}
					}
				}	// FOR END
			}	// IF END
			if(num==2){
				String temp = "★";
				for (int i=X_AXIS.length; i>0; i--){
					if (X_AXIS[i-1]!=null){
						X_AXIS[i]=null;

									if (num==1){	// IF START
				String temp = "★";
				for (int i=0; i<X_AXIS.length; i++){// FOR START
					if(X_AXIS[i]!=null){
						if(i==X_AXIS.length-1)break;
						X_AXIS[i]=null;
						for(int j=i+1; i<X_AXIS.length; i++){
							if(j==X_AXIS.length)break;
							X_AXIS[j]=temp;
						}
					}
				}	// FOR END
			}	// IF END
			if (num == 2) {
				String temp = "★";
				for(int i=X_AXIS.length-1; i>-1; i--){
					if(X_AXIS[i]!=null){
						if(i<0)break;
						X_AXIS[i]=null;
						for(int j=X_AXIS.length-2; j>-1; j--){
							X_AXIS[j]=temp;

						}
					}
				}
			}
					}
				}
			}
*/
