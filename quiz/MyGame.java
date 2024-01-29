package quiz;

import java.util.Random;
import java.util.Scanner;

public class MyGame {
//가위바위보 게임 만들기
	// 0=가위~ 띄우고 입력받기
	//입력받은 값을 컴퓨터와 비교하고
	// 승부결과 출력하고 종료여부 확인 후
	// 다시 무한루프
	// 종료한다고 하면 전체 게임수 중 내가 이긴 횟수는 몇 회 띄우기
	public static void main(String[] args) {
		Random ran = new Random();
		Scanner sc = new Scanner(System.in);
		int total = 0; 	//전체 게임수 저장 변수
		int win = 0;	//승수 저장 변수
		
		//switch 편하게 쓰기 위해
		String[] numToKor = {"가위","바위","보"}; //출력을 위한 문자배열 생성
		String result = ""; 
		String[] resultStr = {"승리하셨습니다.","패배하셨습니다."};  
		//시작
		System.out.println("가위바위보 게임을 시작합니다"); 
		
		//게임 반복을 위한 for 시작
		for(;;) {
			System.out.println("종료하시려면 입력란에 [x]를 입력하세요");
			System.out.println("******************입력란************************");
			System.out.println("다음 중 하나를 입력하세요 (0=가위, 1=바위, 2=보, x=종료)");
			System.out.printf("입력: ");
			String input = sc.nextLine();
			//게임 종료 여부 체크
			if(input.equalsIgnoreCase("x")) {
				System.out.println("***********************게임종료**********************");
				break;
			}
			//0~2의 정수인지 유효성검사
			if(!input.matches("[0-2]+")) {
				System.out.println("잘못입력했습니다잘못입력했습니다잘못입력했습니다잘못입력했습니다잘못입력했습니다잘못입력했습니다잘못입력했습니다잘못입력했습니다잘못입력했습니다\n");
				System.out.println("다시 입력해주세요(0~2까지의 정수만 입력해주세요)");
				continue;
			}
			total++; //게임 수 카운트
			int me = Integer.parseInt(input); // 결과를 내기 위해 입력값 정수변환
			int com = ran.nextInt(2); //컴퓨터 선택
			
			if(me==com) { //switch문 간결하게 하기 위해 무승부 결과는 따로 뺌
				result="무승부입니다.";
			}
			else { 
				switch (me) {
					case 0:
						if(com==2) {
							result= resultStr[0]; //승
							win++; //승수 카운트
						} 
						else if(com==1) {
							result=resultStr[1]; //패
						}
						break;
					case 1:
						if(com==0) {
							result=resultStr[0];
							win++;
						}
						else if(com==2) {
							result = resultStr[1];
						}
						break;
					case 2:
						if(com==1) {
							result = resultStr[0];
							win++;
						}
						else if(com == 0) {
							result = resultStr[1];
						}
						break ;
				}
			}
			System.out.println("***************결과창***************************");
			System.out.printf("나: \"%s\"  컴퓨터: \"%s\"%n",numToKor[me],numToKor[com]);
			System.out.printf("%s%n",result);
			result="";

			
		}//게임 반복을 위한 for 끝
		
		System.out.printf("게임결과 전체 %d게임중 %d게임을 이기셨습니다.",total,win);
		

		
		
		
	}

}
