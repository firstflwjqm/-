package 문법정리;

import java.time.LocalDate;

public class C10_날짜와시간_형식화 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}

}

class 정리 {
/*

java.time 패키지를 사용하자
java.time.LocalDate; extends Object
java.time.LocalTime;
java.time.LocalDateTime;
java.time.ZoneDateTime;

#현재 소속된 로컬의 시간정보를 다루는 클래스
	1. LocalDate : 날짜정보만 다루는 클래스
	2. LocalTime : 시간정보만 다루는 클래스
	3. LocalDateTime : 날짜와 시간 둘다 다루는 클래스
	 
#특정 타임존의 날짜와 시간을 다루는 클래스
	1. ZoneDateTime = LocalDate,LocalTime, TimeZone이 합쳐진 형태

#날짜/시간 정보의 조회와 변경(static메서드)
	1. now() : 현재 시간을 기준으로 날짜 or 시간 정보를 갖는 객체(객체 그 자신)를 리턴
	2. of() : 각 객체가 가지는 요소들을 파라미터로 받아서 객체를 생성
		1)LocalDate는 년/월/일 정보
		2)LocalTime은 시/분/초

#localDateTime
	
	*static메서드
		**localDateTime.now(); -> 현재 시간을 기준으로 날짜 or 시간 정보를 갖는 객체(객체 그 자신)를 리턴
			1)localDateTime.now(ZoneId zone);
				-> 태평양표준시 America/Los_Angeles, 일본 JST, Asia/Seoul
				-> localDateTime.now(ZoneId.of("Asia/Seoul"));
				
		**LocalDateTime of(int year, int month, int dayOfMonth, int hour, int minute);
			1) (+int second, int nanoOfSecond); ->초, 밀리세컨드는 생략 가능, month는 enum형 사용가능
			2) localdatetime 인스턴스 생성
		
	*instance메서드
		
		**.format();
			***DateTimeFormatter.ofPattern(); ->(String반환)
				1) 패턴을 이용한 출력형식을 변환
				2) LocalDateTime.format(DateTimeFormatter.ofPattern("패턴ex:yyyy/MM/dd"));
		**getter
			(int) .getYear(); -년도 반환
			(Month) .getMonth(); - 달 반환
			(int) .getDayOfMonth(); - 일 반환
			(DayOfWeek) .getDayOfWeek(); - 요읿 ㅏㄴ환
			(int) .getDayOfYear(); - 1년중 몇 일인지 반환
			(int) .getHour(); - 시간반환
			(int) .getMinute(): - 분
			(int) .getSecond(); - 초
			(int) .getNano(); - 나노세컨
			
		**날짜 연산
			1) Plus (LocalDateTime 반환)
				***.plusYears(long years) - 인자만큼 년도 추가
				***.plusMonths(long months)
				***.plusWeeks(long num) - 인자만큼 주 추가  (이하 동일)
				***.plusDays 
				***.plusHours
				***.plusMinutes
				***.plusSeconds
				***.plusNanos
			
			2) Minus  
				***minusYears(long years) -인자만큼 년도 감소 (이하 동일)
				***Plus와 동일
				
			3) 비교
				*** .isAfter() - 인자보다 미래 시간이면 true반환
				*** .isBefore() - 인자보다 과거 시간이면 true 반환
				*** .isEqual() - 이낮와 같은 시간이면 true 반환
				*** .compareTo()
					> 0 : 인자보다 미래시간
					< 0 : 인자보다 과거 시간
					== 0 : 인자와 같은 시간
					
			4) LocalDate로변환
				*** .toLocalDate();
				
				
			


 */
	
	
	
}