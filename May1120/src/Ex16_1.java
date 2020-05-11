//문제) 잘못된 문장 선택
class Parent{
	private int a; int b;
	protected int c;
	public int d;
}
class Child extends Parent{
	public Child (int a, int b, int c, int d) {
//    this.a=a; 1번 
	//Parent 조상 클래스의 해당멤버 변수 a는 private 으로 정의되어 있기 때문에 외부 클래스 에서는 접근 못함 => 보안성 
     this.b=b;//2번
     this.c=c;//3번
     this.d=d;//4번
	
	}
	void func() {
//		System.out.println(a);  5번
		System.out.println(b);//6번
		System.out.println(c);//7번
		System.out.println(d);//8번
	}
}
public class Ex16_1 {

	public static void main(String[] args) {
		
		Child one = new Child (1,2,3,4);
		one.func();
		
//		System.out.println(one.a); 9번
		System.out.println(one.b);//10번
		System.out.println(one.c);//11번
		System.out.println(one.d);//12번 
	}
/* private a -> 같은 패키지 접근이 안된다. 
 */
	
}
