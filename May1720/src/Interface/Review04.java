package Interface;

interface Baking{
	void make();
}//Baking

class Cook implements Baking{

	@Override
	public void make() {
         System.out.println("요리사가 빵만듭니다.");		
	}
	public void mix() {
		System.out.println("섞는다.");
		}
	}//cook

class Me implements Baking{

	@Override
	public void make() {
		System.out.println("내가 요리합니다.");
	}
} //Me

class Teacher{
	//업캐스팅
	void teacher (Baking bakery) {
		//다운캐스팅
		if(bakery instanceof Cook ) {
			Cook ck = (Cook)bakery;
			ck.mix();
		}else {
			bakery.make();
		}
	}
}//Teacher
public class Review04 {
	public static void main(String[] args) {

		Teacher th = new Teacher();
		Me me = new Me();
		Cook ck = new Cook();
		
		th.teacher(me);
		th.teacher(ck);
		
	}
}
