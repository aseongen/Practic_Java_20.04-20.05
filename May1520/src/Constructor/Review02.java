package Constructor;
//메서드 오버로딩
class Alphabet {
	void p(int a) {
		System.out.println("a의 값: " + a);
	}

	void p(int a, int b) {
		System.out.println("a,b의 값: " + a + " , " + b);
	}
}// Alphabet

class Number{
	private int first;
	private int second;
	
	public int getFirst() {
		return first;
	}
	public void setFirst(int first) {
		this.first = first;
	}
	
	public int getSecond() {
		return second;
	}
	public void setSecond(int second) {
		this.second = second;
	}
	
}
public class Review02 {
	public static void main(String[] args) {

    Alphabet alpa = new Alphabet();
    alpa.p(3);
	alpa.p(5, 7);
	System.out.println();
	
	Number nb = new Number();
	nb.setFirst(15);
	nb.setSecond(22);
	
	System.out.println("1. " + nb.getFirst()+ "\t2. "+ nb.getSecond());
	
	}
}
