package day04;

import java.util.Iterator;

public class 별_찍기 {

	public static void main(String[] args) {
		/*		 
		[문제1]
		★
		★★
		★★★
		★★★★
		[문제2]
		    *
		   **
	      ***
	     ****
		
		[문제3]
		  *
		 ***
		*****
		 
		  */
		
//		별찍기_quiz.quiz1();
//		별찍기_quiz.quiz2();
		별찍기_quiz.quiz3();
	}

}


class 별찍기_quiz{
	static void quiz1(){
		for(int i=0;i<4;i++) {
			for(int j=0;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	
	static void quiz2(){
		for(int i=4;i>0;i--) {
			for(int j=1;j<=4;j++) {
				if(i>j) {
					System.out.printf(" ");
				}
				else System.out.printf("*");
			} System.out.printf("%n");

		}
		
	}
	
	static void quiz3(){
		for (int i = 1; i < 4; i++) {
			for (int j = 1; j < 6; j++) {
				if(i==1) {
					if(j!=3) System.out.printf(" ");
					else System.out.printf("*");
				}
				if(i==2) {
					if(j==1||j==5) System.out.printf(" ");
					else System.out.printf("*");
				}
				if(i==3) {
					System.out.printf("*");
				}
			} 
			System.out.println();
		}
	}
	
	
	
	
	
	
	
}