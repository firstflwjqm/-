package day04;

public class DoWhileTest2 {

	public static void main(String[] args) {
	//[문제1]  1~100까지 정수를 다음과 같은 식으로 계산한 수식과
			//1+ (-2) + 3+(-4) + 5 + (-6) ....+(-100)
			
	//[문제2] 1+ (1+2) + (1+2+3) + (1+2+3+4)...+(1+2+...+10)
			
	//[문제3] Scanner이용해서 "구구단의 몇 단을 하시겠어요?" 입력받아 구구단식 출력하기
			

		While_Quiz.quiz1();
		While_Quiz.quiz2();
		While_Quiz.quiz3();
		While_Quiz_feedback.quiz1();
		
	}

}

class While_Quiz{
	
	static void quiz1(){
		int i = 1;
		int sum = 0;
		while(i<=100) {
		
			if(i==1) {
				System.out.print(i+"+");
			}			
			else if(i%2==0) {
				i=-i;
				System.out.printf("(%d)",i);
				sum+=i;
				i=-i;
			}
			
			else {
				System.out.printf("+%d+",i);
				sum+=i;
			}
			
			if(i==100) {
				System.out.println("\n"+sum);
			}			
			i++;	
			
			}
		}
	
	
	static void quiz2() {
		int sum = 0;
		int i = 1;
		while(i<11) {
			
			if(i==1) {
				System.out.print("1");
				sum+=1;
			} 
			
			else {
				System.out.print("+(");
				for(int j=1;j<=i;j++){
					if(i!=j) System.out.printf("%d+",j);
					else System.out.printf("%d",j);
					sum+=j;
				}
				System.out.print(")");
			}
			i++; 
		}
		System.out.println("\nsum="+sum);
	}		
	
	
	static void quiz3() {
		
		
		
		
	}
	
}

class While_Quiz_feedback{
	// 중첩if쓰기 싫은데
	// 그러면 '+'에 조건을 달면 어떻까? 조건을 달면 더 안 좋아지나?
	static void quiz1(){
		int i = 1;
		int sum = 0;
		int abs = -1;
		while(i<101) {
			
			if(i%2==0) {
				sum+=abs*i;
				if(i!=100) System.out.printf("(%d)+",abs*i);
				else System.out.printf("(%d)",abs*i);
			} else {
				sum+=i;
				if(i!=100) System.out.print(i+"+");
				else System.out.print(i);
			}
			if(i==100) System.out.println("\nsum="+sum);
			i++;
		}
	}
}