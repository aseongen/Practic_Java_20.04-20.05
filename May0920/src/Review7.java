class Calc{
	
	int add (int x, int y) {
		int result = x + y;
		return result;
	}
	int multiply (int x, int y) {
		int result = x * y ;
		return result;
	}
}


public class Review7 {
public static void main(String[] args) {
	
	Calc ca = new Calc ();
	System.out.println("더하기: " + ca.add(10,20) );
	System.out.println("곱하기: " + ca.multiply(40, 60));
}
}
