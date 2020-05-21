import java.util.Hashtable;
import java.util.Map;
import java.util.Scanner;

public class ListMap10 {

	public static void main(String[] args) {

		Map<String,String> map = new Hashtable<>();
		//키, 값을 아이디와 비번으로 저장
		map.put("spring","12");	map.put("summer","123");  
		map.put("fall","1234"); map.put("winter","12345");

		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.println("아이디와 비번을 입력하세요");
			System.out.println("아이디>>>");

			String id = sc.nextLine();
			System.out.print(id);

			System.out.println("  비밀번호를 입력하세요");
			String password = sc.nextLine();
			System.out.print(password);
			System.out.println();

			if(map.containsKey(id)) {

				if(map.get(id).equals(password)) {
					System.out.println("로그인 되었습니다."); break;//반복문 중단

				} else {
					System.out.println("비번이 일치하지 않습니다.");
				}//inner if else
				
			}else {
				System.out.println("입력하신 아이디는 존재하지 않습니다.");

			}//outer if else

		}//while

	} //main

} //class
