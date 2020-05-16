package Constructor;
class Date02{
	int year = 2020;
	int month = 12;
	int day = 25;
}
class Date03{
	void change(Date02 d3) {
		d3.year=2021; d3.month = 05; d3.day = 8;
	}
}
class Date04{
	void change(Date02 d4) {
		d4.year=2022; d4.month = 04; d4.day = 16;
	}
}
public class Review03 {
	public static void main(String[] args) {

		Date02 d2 = new Date02();
		System.out.printf("크리스마스: %d년 %d월 %d일 ", d2.year,d2.month,d2.day);
		
		System.out.println();
//객체 주소 변경		
		Date02 d3 = d2;
		System.out.printf("어버이날: %d년 %d월 %d일", d3.year, d3.month, d3.day);
	
		System.out.println();
		
		Date04 d4 = new Date04();
		d4.change(d2);
		System.out.printf("세월호: %d년 %d월 %d일",d2.year,d2.month, d2.day);
	
		
	}
}