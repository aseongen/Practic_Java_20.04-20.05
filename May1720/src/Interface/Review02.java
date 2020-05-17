package Interface;

interface Dessert02{
	void choco (String name);
}//Desser02

abstract class Coffee02{
	Coffee02(){} //생성자 == 클래스이름 
	
	public abstract void Americano01(String name);
}//Coffee02

class Smoothie extends Coffee02 implements Dessert02{

	@Override
	public void choco(String name) {
		System.out.println(name+" 쿠키");
	}

	@Override
	public void Americano01(String name) {
		System.out.println(name + " 아이스");
	}
	
}//smoothie

public class Review02 {
	public static void main(String[] args) {

		Smoothie sm = new Smoothie();
		sm.choco("초코");
		sm.Americano01("아메리카노");
	}
}
