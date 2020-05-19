class Member{ //extends Object 이 생략됨 
	String id; //회원 아이디
	
	Member(String id){
		this.id =id;
	}
//이클립스 메뉴로 equals() 메서드를 오버라이딩을 한다. 
//Object obj 로 업캐스팅 -> 다형서 문법 적용
	
	@Override
	public boolean equals(Object obj) {  //Object obj 로 업캐스팅 되면서 다형성 문법이 적용됨
	 if (obj instanceof Member) {// 다운캐스팅이 가능하면 true
		 Member member = (Member)obj; // 명시적인 강제 다운 캐스팅 
		 if(id.equals(member.id)) {// id 내용물만 비교
			 return true; // 같으면 true 반환 
		 }
	 }
	return false; //id가 다르면 false 를 반환 
	}//이클립스 메뉴로 equals() 메서드를 오버라이딩을 한다. 
	
}//Member
public class ObjectTest04 {

	public static void main(String[] args) {
		
		Member m01 = new Member("aaaa");
		Member m02 = new Member("bbbb");
		Member m03 = new Member("cccc");
		
		if(m01.equals(m02)) {
			System.out.println("id가 같습니다.");
		}else {
			System.out.println("id가 다릅니다.");
		}
		if(m01.equals(m03)) {
			System.out.println("id가 같다.");
		}else {
			System.out.println("id가 다릅니다.");
		}
	}
}
