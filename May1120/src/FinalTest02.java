import com.abc.model.MemberVO;

public class FinalTest02 {

	public static void main(String[] args) {

		MemberVO m =new MemberVO();
		
		m.setId("AAAA"); m.setName(" 이순신");
		m.setPhone("010-0000-0000"); m.setEmail("sdif@naver.com");
		
		System.out.println("아이디: " + m.getId());
		System.out.println("이름: "+ m.getName());
        System.out.println("폰번호: " + m.getPhone());		
		System.out.println("전자우편: " + m.getEmail());
		
	}
}
 