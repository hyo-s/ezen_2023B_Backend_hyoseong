package 과제.과제1.ex2;

import java.time.LocalDateTime;

public class Level1_2 {
	
	public static void main(String[] args) {
		System.out.println(" >> Level1_2 answer >> ");
		System.out.println(" >> answer time : " + LocalDateTime.now() +" >> \n" );
		System.out.printf("%-10s   %15s   %30s\n" , "type" , "value" , "range" );
		System.out.println("-------------------------------------------------------------");
		/* 문제풀이 위치 */
		boolean booleanValue=true;
		System.out.println("boolean \t\t\t\t" + booleanValue + "\t\t\t\t\ttrue or false");
		byte byteValue=100;
		System.out.println("byte \t\t\t\t\t" + byteValue + "\t\t\t\t\t\t\t-128 ~ 127");
		char charValue='A';
		System.out.println("char \t\t\t\t\t" + charValue + "\t\t\t\t0~65535[ character 1 ]");
		short shortValue=30000;
		System.out.println("short \t\t\t\t\t" + shortValue + "\t\t\t\t\t-32768 ~ 32767");
		int intValue=2000000000;
		System.out.println("int \t\t\t\t\t" + intValue + "\t\t\t\t-+2000 million");
		long longValue=40000000000L;
		System.out.println("long \t\t\t\t\t" + longValue + "\t\t-+2000 million Excess");
		float floatValue=3.123F;
		System.out.println("float \t\t\t\t\t" + floatValue + "\t\t\t\t8 decimal places");
		double doubleValue=3.12312312;
		System.out.println("double \t\t\t\t\t" + doubleValue + "\t\t\t17 decimal places");
		/* ----------- */
	}
}
/* 
	[문제] 그림과 같이 기본자료형을 이용하여 변수 8개 선언하고 임의값을 대입하여 출력하시오.
	[조건] 
		1. 모든 기본자료형 8개 사용
		2. printf() 메소드 사용
*/
