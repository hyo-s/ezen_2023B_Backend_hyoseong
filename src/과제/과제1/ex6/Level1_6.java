package 과제.과제1.ex6;

public class Level1_6 {
	
	public static void main(String[] args) {
		System.out.println(" >> Level1_6 answer >> \n");
		
		
		short value1 = 30000;			
		int value2 = 2000000000;		
		long value3 = 40000000000L;		
		float value4 = 3.123123123F;	
		double value5 = 3.123123123;	
		
		/* 문제풀이 위치 */
		byte byteValue=(byte)value1;
		short shortValue=(short)value2;
		int intValue=(int)value3;
		long longValue=(long)value4;
		float floatValue=(float)value5;

		System.out.println("byte <- short = " + byteValue);
		System.out.println("short <- int = " + shortValue);
		System.out.println("int <- long = " + intValue);
		System.out.println("long <- float = " + longValue);
		System.out.println("float <- double = " + floatValue);
		/* ----------- */
	}
}
/* 
	[문제] 그림과 같이 기본자료형을 이용하여 변수 5개 선언되어 있습니다. 그림과 같이 강제 형변환을 하여 출력하시오.
	[조건] 
		1. 문제풀이 위치 외 코드는 수정 불가 합니다.
		2. 강제 형변환 만 사용하여 그림과 같이 출력합니다.
		
*/
