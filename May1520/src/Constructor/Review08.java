package Constructor;
//Math.max, Math.min
public class Review08 {
	public static void main(String[] args) {

		int a =40,b=30,re=0;
		re=Math.max(a, b);//a,b 두수 중 최대값을 구함. 여기서 사용하는 max() 는 정적 메서드
		System.out.println(a + "와 " + b + "두 수중 최대값 = " + re);
		
		re=Math.min(a, b);
		System.out.println(a + "와 " + b + "두 수중 최소값 = " + re);
	
	}

}
