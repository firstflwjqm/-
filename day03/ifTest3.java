package day03;

import java.util.*;

public class ifTest3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		float kor = sc.nextFloat();
		float eng = sc.nextFloat();
		float total = eng+kor;
		double avg = total/2;
		char grade;
		
		if(avg>=90) {grade = 'A';}
		else if(avg>80) {grade = 'B';}
		else if(avg>70) {grade = 'C';}
		else if(avg>60) {grade = 'D';}
		else {grade = 'F';}
		
		for(int i=0;i<11;i++)
			System.out.printf("*");
		System.out.printf("국어     영어");
		for(int i=0;i<11;i++)
			System.out.printf("*");
		System.out.printf("%f     %f",kor,eng);
		for(int i=0;i<11;i++)
			System.out.printf("*");
		System.out.printf("합계점수: %f%n평균점수: %f%n학  점: %c",total,avg,grade);
		// 국어 영어 점수를 받아서, 총합계 점수, 평균점수, 학점을 출력하는 프로그램을 작성하세요
				// 평균점수를 이용한 학점
						/* 100 ~90 : A
						 * 89 ~ 80 : B
						 * 79 ~ 70 : C
						 * 69 ~ 80 : D
						 * 그 외: F
						 * 
						 * */
				//성적 테이블표 형태로 출력
						/*-------------------------
						 * 국어		영어
						 * ----------------------
						 * 85.3		92.5
						 * -----------------------
						 * 합계점수: xx 점
						 * 평균점수: 
						 * 학   점: B
						 * -----------------------
						 * */
		
	
	}
}