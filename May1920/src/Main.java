

class A {
	//기본생성자 정의
	A(){
		System.out.println("A 객체가 생성됨");
	}
	
	/* 인스턴스 멤버 클래스 정의 */
	class B {
		//B클래스 생성자
	    B(){
         System.out.println("B 객체가 생성됨.");
	    }
	    int field1; //인스턴스변수 올 수 있다.
	    
//	    static int filed2; -> 정적변수는 올 수 없다. 
	    
	    void method1() {} // 인스턴스 메서드는 올 수 있다. 
	    
//	    static odi method2{} ->정적 메서드는 올 수 없다.
	    
	    
	} //class B -> 네비게이터 : A$B.class 컴파일 됨.
	
	/* 정적 멤버 클래스  */
	static class C{
		C(){System.out.println("C 객체가 생성됨 ");}
		   //인스턴스 변수
		   int field1;
		   
		   // 정적 변수가 올 수 있다.
		   static int field2;
		   
		  //인스턴스 메서드가 올 수 있다. 
		   void method1() {} 
		   
		  //정적 메서드가 올 수 있다. 
		   static void method02() {} 
		   
	}//static class C : A$C.class
	
	/* 로컬(지역)클래스  */
     void method01() {
         class D {
        	 D() {System.out.println("D 객체가 생성됨. "); } 
        	 
        	//지역클래스에는 인스턴스 변수가 올 수 있다. 
        	 int filed1;
        	 
//        	 static int field2; -> 정적 변수는 올 수 없다.
        	 
        	//인스턴스 메서드는 올 수 있다.
        	 void method01() {} 
        	 
//        	 static void method02() {} -> 정적 메서드는 올 수 없다. 
        	 
         }
         
         D d = new D();
         d.method01();
         
     } //method01() : A$1D.class
}//class A

public class Main {
	public static void main(String[] args) {

		A a = new A();
		a.method01();
		
		//인스턴스 멤버클래스 객체 생성 
		A.B b =a.new B();
        b.field1=10;
        b.method1();

        //정적멤버 클래스 객체 생성
        A.C c = new A.C();
        c.field1=3; c.method1();
        A.C.field2=10;
        A.C.method02();
        
	}
       
}
