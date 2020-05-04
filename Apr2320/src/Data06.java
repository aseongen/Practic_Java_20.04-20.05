import java.util.Scanner;

public class Data06 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
	/* 이클립스 개발툴에서 외부 패키지 폴더의 스캐너 클래스를 읽어들이는 단축키 :Ctrl+Shift+영문알파벳 o
	 * Scanner 클래스 자바 1.5 버전에서 추가되었고, 입력한 데이터를 읽어들일 때 사용한다. 
	 * System.in : 키보드 입력장치와 연결 
	 * new : 새로운 객체명 scan 생성
	 */
      
		System.out.print("이름입력>> ");
	    String name = scan.nextLine(); // 문자열로 읽어들임
	    System.out.print("나이 입력 >> ");
	    String age = scan.nextLine();	
	    
	    System.out.printf("이름:%s \n나이:%s" , name, age);
	
	
	}
}
