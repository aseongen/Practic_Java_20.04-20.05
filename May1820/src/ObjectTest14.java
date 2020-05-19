import java.text.SimpleDateFormat;
import java.util.Date;

//날짜 클래스
public class ObjectTest14 {
	public static void main(String[] args) {

		//Date : 날짜 표현
		Date now = new Date();

		//년 월 일 시 분 초 : 출력 형태 
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 hh시 mm분 ss초");
		
		String now2 = sdf.format(now);
		//영어버전(기본)
		System.out.println(now);
		//한국어버전
		System.out.println(now2);
		
	}//main
}//class
