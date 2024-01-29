package day04;

public class DoWhileTest {

	public static void main(String[] args) {
	/*변수 선언문 및 초기화식 
	 do{실행문, 증감식} while(조건식)
	 hello 문자열을 5번 출력
	 */
		int i = 0;
		do {
			System.out.println("Hello");
			i++;
		} while(i<5);
	}

}
