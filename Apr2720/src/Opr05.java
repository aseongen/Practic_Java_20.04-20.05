
public class Opr05 {

	public static void main(String[] args) {

		int a =12;
		int b = 20;
	    int c = a&b;
	    System.out.println(a + "&" + b + ":" + c);
	    
	    c=a |b;
	    System.out.printf("a|b:%d\n",c);
	
	    c=a^b;
	    System.out.printf("a^b:%d\n",c);
		
		c= ~a;
		System.out.printf("~a:%d\n",c);
	    
		//직접 계산해봐야함. 
	    byte x =15;
	    System.out.printf("x<<12: %d\n",(x<<2));
	    System.out.printf("x>>2 : %d\n",(x>>2));
	    System.out.printf("-8 >> 3: %d\n", (-8>>3)); 
	    System.out.printf("-8 >>>3 : %d\n",(-8>>>3));
	    
	    
	    
	    
	    
	    
	    
	}

}
