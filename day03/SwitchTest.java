package day03;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class SwitchTest {
	/*switch문에 들어갈 수 있는 자료형
	 * 	[1] int형 이하 (byte,short,char,int) [o] long형은 안됨[x]
	 *  [2] String형도 가능
	 * 
	 *   switch(변수 or 수식){
	 *   	case 값1: 실행문; break;
	 *   	case 값2: 실행문; break;
	 *   	case 값3: 실행문; break;
	 *   	default: 실행문;
	 *   }
	 * 
	 * */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("수강하는 과목 입력=>");
		String subject = sc.next();
		Map<String, String> map = new HashMap();
		map.put("자바", "1103호로 가세요");
		map.put("파이썬", "1102호로 가세요");
		map.put("리눅스", "1104호로 가세요");
		
		String notice = "1100호로 가세요";
		
		switch (subject) {
		case "자바":
			System.out.println(map.get("자바"));
			break;
		case "파이썬":
			System.out.println(map.get("파이썬"));
			break;
		case "리눅스":
			System.out.println(map.get("리눅스"));
			break;

		default: System.out.println("카운터에 문의하세요");
			break;
		}
		
	}

}
