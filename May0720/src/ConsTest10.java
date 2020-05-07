class St02{
	 
	/*정적변수는 매우 느리다. 따라서 잘 사용은 하지 않는다.
	 * 생성된 객체는 외부에서 생성되고 정적 메서드는 클래스 내에서 생성이된다.
	 * 따라서, 인스턴스 변수는 해당 클래스 주소를 알지 못하기 때문에 정적 메서드를 사용할 수 없다.
	 * 객체 생성은 가능하지만 해당 클래스에 직접 접근해야한다.->속도 빠름 따라서 this 를 사용할 수 없다. 
	 * 
	 * 인스턴스메서드 : 객체 입장에서 관리한다. 즉 ,클래스에서 관리하지 않기 때문에 클래스로 접근이 불가하다.
	 *             변수 생성후 접근된다. 
	*/
	
	//정적 메서드는 클래스 입장
	private static int a =10; //static 으로 정의된 정적 변수 a
	
	
	private int b =20; //인스턴스 변수 
	
/*	public static void setA (int a) { 인스턴스 입장 
		System.out.println(this.a); 정적 메소드의 int a 의 값을 가져옴. 왜냐면 클래스 입장이기 때문
	    this.a=a;  => 에러남
	    
    public static void setA(int a) { 
    	a=a; // 값이 저장되지 않는다.
    }
    
    static 키워드로 정의된 setA( ) 정적 메서드라고 한다. 
          정적 메서드는 해당 클래스명으로 직접 접근 할 수 있다.
          그래서 클래스 메서드라고도 한다. */
  
	//this는 인스턴스 변수 앞에서만 사용해라. 
    public static void setA(int new_a) { //값 저장
    	a=new_a; 
    }
    
    public static int getA() { //값 반환
    	return a;     
    }
 //   void p() {
    	
 //   }
}

public class ConsTest10 {
	public static void main(String[] args) {
 
		//St02.p() :인스턴스메서드 : 해당클래스로 접근이 안된다. 
		
		St02 s =new St02();
		s.setA(100);
		System.out.println("s.getA()= " + s.getA());
		
		//클래스 명으로 직접 접근해라. 
		//인스턴스 변수를 가리키는 참조변수가 this때문에 클래스 명으로 접근해라 
		St02.setA(1000);
		System.out.println("St02.getA()= "+St02.getA()); //1000
		
		//클래스 입장에서는 인스턴스 메모리 영역을(this) 모른다. 
		//객체가 관리하는 인스턴스 변수 // 클래스가 관리하는 정적 메서드  
	}
}
