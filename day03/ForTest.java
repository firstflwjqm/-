package day03;

import java.time.LocalDate;

public class ForTest {

	public static void main(String[] args) {
		//[1]for루프 이용해서 1~10까지의 합과 곱을 구해 출력하세요
		//1+2+3+....+10=55
		//1*2*3* ....*10=3628800
				
				
		//[2] 1~20까지 정수 중 (2 또는 3의 배수)가 아닌 수를
		//출력하고, 이 수들의 총합을 구하세요

				
		//[3] 알파벳 대문자A,B...Z 를 for루프 이용해 출력하기
		System.out.println("[1]번문제");
		int sum1 = 0;
		int multiply = 1;
		for(int i=1;i<11;i++) {
			sum1+=i;
			multiply*=i;
		}
		
		System.out.println("합: "+sum1+" 곱 :"+multiply);
		
		System.out.println("[2]번문제");
		
		int sum2=0;
		for(int i=1;i<21;i++) {
			if(i%2!=0&&i%3!=0) {
				if(i==1) {
					System.out.print(i);
				} else { 
					System.out.printf(", %d",i);
					sum2+=i;
				}
			}//if끝
		}
		System.out.print("\n합은 :"+sum2);
		System.out.println("[3]번문제");
		int a = 'A';
		int z = 'Z';
		for(int i='A'-'0';i<='Z'-'0';i++) {
			char c = (char)(i+'0');
			System.out.print(c+",");
		}
		
	}

}
