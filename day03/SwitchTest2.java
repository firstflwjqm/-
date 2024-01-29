package day03;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class SwitchTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.printf("사번을 입력하세요 [예 A100EX]=>");
		String no = sc.next();
		System.out.println("no: "+no);
		
		char major = no.charAt(0);
		String number = no.substring(1,no.length());
		Map<Character, String> map = new HashMap<Character, String>();
		map.put('A', "기획부 사원이며 사원의 고유 번호는 "+number+"입니다");
		map.put('B', "총무부 사원이며 사원의 고유 번호는 "+number+"입니다");
		map.put('C', "개발부 사원이며 사원의 고유 번호는 "+number+"입니다");
		
		
		switch (major) {
		case 'A':
			System.out.printf("%c: %s",major,map.get(major));
			break;
		case 'B':
			System.out.printf("%c: %s",major,map.get(major));
			break;
		case 'C':
			System.out.printf("%c: %s",major,map.get(major));
			break;

		default: System.out.println("해당 부서 없음");
			break;
		}
		
	}

}
