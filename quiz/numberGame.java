package quiz;

import java.util.Random;
import java.util.Scanner;

public class numberGame {

	public static void main(String[] args) {

		
		String hint_Smaller = "더 작은 수를 입력하세요";
		String hint_Biger = "더 큰 수를 입력하세요";
		Scanner sc = new Scanner(System.in);
		Random r = new Random();
		
		while(true) {
			
			int answer = r.nextInt(101);
			if(answer==0) continue;
			int User;
			int count = 0;
		
		System.out.println("::컴퓨터가 낸 숫자를 맞춰보세요::");
		
			while(true) { 
				count++;
				System.out.printf("%d회차 도전%n>>",count);
				User = Integer.parseInt(sc.nextLine());
				System.out.println();
				if(count==7) {
					System.out.printf("기회를 모두 사용하셨습니다ㅜㅜ\n아쉽지만 게임을 다시 시작해주세요\n정답은 %d입니다.\n",answer);
					System.out.println();
					break;
				}
				
				if(answer==User) {
					System.out.println("정답입니다.");
					System.out.printf("%d번 만에 맞췄네요^^%n",count);
					System.out.printf("컴퓨터 숫자: %d%n", answer);
					System.out.print("계속하시려면 아무 키나 누르십시오 . . .\n>>");
					String str = sc.nextLine();
					if(str!=null)
					break;
				}
				
				else if(answer>User) { 
					System.out.println(hint_Biger);
					continue;
				}
				
				else if(answer<User) {
					System.out.println(hint_Smaller);
					continue;
				}
			} 
		}
		
		
		
		
	}

}
