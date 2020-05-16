package Constructor;
class Soccer {
	String player;
	String team;
	private int fanCount;

	public int getFanCount() {
		return fanCount;
	}

	public void setFanCount(int fanCount) {
		this.fanCount = fanCount;
	}
}

class Baseball {
	int score;
	String mascoat;
}

public class Review01 {
	public static void main(String[] args) {
 
//Soccer 타입의 참조변수 sc를 선언, 생성된 Soccer 인스턴스의 주소를 저장 
    Soccer Sc = new Soccer();
    Sc.player="손흥민";
    Sc.team="토트넘 ";
//private 객체 초기화 및 호출 
    Sc.setFanCount(100);
    System.out.println("선수: " + Sc.player + "\t팀: " + Sc.team);
    System.out.println("fanCoung: "+Sc.getFanCount());
	
    System.out.println();
    
//Baseball 참조변수선언
    Baseball bb = new Baseball();
    bb.score=(15); bb.mascoat="나나";
    System.out.println("점수: "+bb.score+"\t마스코트: " +bb.mascoat);
    
    
    
	}
}
