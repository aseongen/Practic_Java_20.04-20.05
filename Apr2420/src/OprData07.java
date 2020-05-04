
public class OprData07 {

	public static void main(String[] args) {

		int x = -100;
		int result01 = +x;
		int result02 = -x;
		System.out.println("result01 = "+result01);
		System.out.println("result02 = "+result02);
		
		short s = 100;
//	    short result03 = -s // 부호 연산자를 사용하면 결과값 타입이 Int타입이다.
	    int result03 = -s;
	    System.out.println("result03: " + result03);
		
	    int var01 =1;
	    int var02 =3;
	    int var03 =2;
	    int result =var01+var02*var03; //곱셈이 덧셈보다 우선,
	    System.out.println(result);
	    
	    //덧셈 연산 우선으로 계산하기
	    result = (var01+var02) *var03;// 먼저 연산 수행을 하고 싶다면 ()를 사용한다
	    System.out.println(result);
	}

}
