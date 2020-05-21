import java.util.Stack;

class Coin{
	private int value;
	
	public Coin (int value) {
		this.value=value;
 }

	public int getValue() {
		return value;
	}
	
}//Coin

public class ListMap15 {
	public static void main(String[] args) {
     
		Stack<Coin> coinBox = new Stack<>();
		coinBox.push(new Coin(500));// 스택에 객체를 넣는다. 
		coinBox.push(new Coin(100)); 
		coinBox.push(new Coin(50)); 
		coinBox.push(new Coin(10)); 
		
		while(! coinBox.isEmpty()){//동전케이스에 동전이 있다면
			//Coin coin = coinBox.pop()
			Coin coin = coinBox.pop();
			System.out.println("꺼내온 동전: " + coin.getValue() + "원");
			
		}
		
	}
}
