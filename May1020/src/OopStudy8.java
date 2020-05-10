//생성자 오버라이딩 
class Game{
	int people;
	int score;
	String member;
	
	Game (){
		this(100,2,"박지성");
	}
	//Alt+Shift+s -> 생성자 자동생성
	public Game(int people, int score, String member) {
		this.people = people;
		this.score = score;
		this.member = member;
	}
	void result() {
		System.out.println("사람수: "+ people + ", 점수: " + score + ", 선수: " + member);
	}
}
public class OopStudy8 {
	public static void main(String[] args) {

		Game ga = new Game();
		ga.result();
	}
}
