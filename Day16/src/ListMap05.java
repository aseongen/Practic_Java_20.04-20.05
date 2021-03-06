import java.util.ArrayList;
import java.util.List;

public class ListMap05 {
	public static void main(String[] args) {

		List<String> list = new ArrayList<>();
		
		//3번째 지정된 값으로 저장 
		//앞에 숫자지정: 해당 배열 숫자를 의미 
		list.add("java"); list.add("JDBC"); list.add(1,"Servlet/JSP");
		list.add("mybatis"); list.add(2,"DataBase(oracle)"); 
	
		int size =  list.size(); //컬렉션 원소 개수
		System.out.println("총 개수: " + size);
	
		System.out.println();
		
		//3번째 원소값을 가져옴. 주소 인덱스 번호가 0부터 시작 
		String skill = list.get(2);
		System.out.println("세번째 원소값: " + skill);
		
		String skill2 = list.get(1);
		System.out.println("첫번째 원소값: " + skill2);
		
		System.out.println();
		
		//향상된 확장 for로 컬렉션 원소값 가져오기 
		for(String subject : list) {
			System.out.print(subject+ " ");
		}
		
		System.out.println();
		
		list.remove(2);//3번째 원소값 삭제 
		list.remove("mybatis"); //mybatis 삭제

		//문제) 일반 for 로  컬렉션 원소값을 가져와서 출력하자 

		for(int i=0; i<=list.size();i++) {
			System.out.print(list.get(i));
		}//for 
		
	
	}//main 
}//class
