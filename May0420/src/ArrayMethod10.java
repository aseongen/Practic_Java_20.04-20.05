import java.util.Calendar;

public class ArrayMethod10 {
	public static void main(String[] args) {

   Week today = null;//열거타입  Week로 참조변수 선언 가능, null 대입가능 
   Calendar cal = Calendar.getInstance();
   /*calendar 추상클래스 특징
    * -추상클래스로 new 로 객체 생성을 못한다.
    * -이 클래스는  년 월일, 시분초값을 구할때 사용된다
    * 
    */
		
    int week = cal.get(Calendar.DAY_OF_WEEK);//일요일은1~토요일은 7까지의 정수숫자를 반환한다. 
    switch(week) {
    case 1: today=Week.SUNDAY; break;//열거타입 열거 상수 대입
    case 2: today=Week.MONDAY; break;
    case 3: today=Week.TUESDAY; break;
    case 4: today=Week.WEDNESDAY; break;
    case 5: today=Week.THURSDAY; break;
    case 6: today=Week.FRIDAY; break;
    case 7: today=Week.SATURDAY; break;
    }
    System.out.println("오늘 요일은 " + today);
	
    if(today == Week.SUNDAY) {
    	System.out.println("일요일에는 등산을 합니다.");
    }else {
    	System.out.println("월욜~토욜 : 자바공부를 합니다.");
    }
	
	
	
	
	
	
	
	
	
	
	
	
	}
}
