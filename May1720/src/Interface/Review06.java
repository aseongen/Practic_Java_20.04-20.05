package Interface;

interface Mine{
	void method();
	
	default void method2() {
		System.out.println("Mine 디폴트");
	}
}//Mine

class MineB implements Mine{

	@Override
	public void method() {
        System.out.println("B method");		
	}
}//Mine

class MineC implements Mine{

	@Override
	public void method() {
		System.out.println("C method");
	}

	@Override
	public void method2() {
		Mine.super.method2(); //생략가능 
		System.out.println("C method2()");
	}
}//MineC

public class Review06 {
	
	void m (Mine mi) {
		mi.method(); mi.method2();
	}
	
       public static void main(String[] args) {
	
    	  Mine mi = new MineB();
    	  mi.method(); mi.method2();
    	  
    	  System.out.println();
    	  
    	  Mine mi2 = new MineC();
    	  mi2.method(); mi2.method2();
    	  
    	  System.out.println("-----------");
    	  
    	 Review06 rv = new Review06();
    	 rv.m(new MineB());
    	 
    	 System.out.println("---------");
    	 rv.m(new MineC());
}
}
