
public class Opr08 {
	public static void main(String[] args) {

    int x =10;
    int y = 5;
    System.out.println((x>7) && (y <=5));  //true && true = true
    System.out.println((x%3 ==2) || (y%2 !=1));	 //false || false = false
    
    System.out.println("--------------------------------------------");
    
    int a =7;
    int b =8;
    String c = (a % 2 == 0 ? "짝수이다." : "홀수이다.");
    String d = (b % 3 == 0 ? "홀수이다." : "짝수이다.");
    System.out.println("7은  " + c);
    System.out.println("8은  " + d);
    
	}
}
