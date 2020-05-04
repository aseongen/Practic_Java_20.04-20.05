
public class OprData10 {
	public static void main(String[] args) {

		int a = 10;
		a =a+10; //10+10=20
		System.out.println("a= " + a); //20
		
		a=a-5; //복합 대입 연산자
		System.out.println("a= " + a);
		
		a+=5;
		System.out.println("a= " + a);
		
		a-=3;
		System.out.println("a= " + a );

/* 증가/감소(증감) 연산자)
 * i++ (나중에 1증가 -> 후행증가), ++i (먼저 1증가 -> 선행증가)
 * i-- (나중에 1감소 -> 후행감소), --i (먼저 1 감소 -> 선행감소)
 */

		a=10; int b=10;
		++a;
		System.out.println(a); //11
		b++;
		System.out.println(b);//11
		
	}
}
