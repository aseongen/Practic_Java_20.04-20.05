
public class OprData04 {
	public static void main(String[] args) {

		int apple = 1; //사과한조각
		
		int totalPiece = apple*10;
		int number = 7;
		int tmp = totalPiece - number ; //10-7
		
		double result = tmp/10.0;//3/10.0-> 자동산술법에 의해서 3.0 /10.0 -> 0.3
		
		System.out.println("사과 한 개에서 0.7 조각을 빼면: "+result +"조각이 남는다");
		
	}
}
