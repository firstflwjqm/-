package day03;
import java.util.Date;
import java.util.Scanner;
public class DateTest {

	public static void main(String[] args) {
		Date date=new Date();
		int year = date.getYear()+1900;
		int month2 = date.getMonth()+1;
		int dd = date.getDate(); //일수를 리턴받음
		int hh = date.getHours();
		int mm = date.getMinutes();
		int ss = date.getSeconds();
		int dy = date.getDay();
		
		String[] dayStr = {"일","월","화","수","목","금","토"};
		Scanner sp = new Scanner(System.in);
		System.out.println("월을 입력하세요");
		int month = Integer.parseInt(sp.nextLine());
		
		date.setDate(month-1);
		int day = date.getDate();
		System.out.printf("%d월은 %d일까지 있습니다.",month,day);
		//[1] month
		//28 : 2월
		//31 : 1, 3, 5, 7,8,10,12
		//30 : 4,5,9,11
		//switch ~case문 이용해서 "9월은 30일까지 있습니다"
		//스캐너로 월을 입력받고 "?월은 3?일까지 있습니다
	}

}
