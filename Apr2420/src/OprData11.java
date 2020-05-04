
public class OprData11 {

	public static void main(String[] args) {

		int a=10, b=10;
		System.out.println(++a); //선행증가 후 결과 
		
		System.out.println(b++); // 출력 후 후행증가 
		System.out.println(b);
		
		a=b=10; 
		int c;
		c=++a; // 선행 증가 후 c 변수에 저장
		System.out.println(c); //11
		
		c=b++; //먼저 10 을 저장하고, 후행 1 증가 
		System.out.println(c); 
		System.out.println(b);
		
		int i=5, j=5;
		System.out.println(i++);
	    System.out.println("i = "+ i);
	    
	    System.out.println(++j);
	    System.out.println("j= "+j);
	    
	    
	}

}
