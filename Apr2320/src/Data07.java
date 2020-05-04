
public class Data07 {
	public static void main(String[] args) {

		int a=10;
	    int b=012;//8진수로 저장(0으로 시작 -> 8진수)
	    int c=0xA; //16  진수로 저장
	    
	     System.out.println(a); 
	     System.out.println(b);
	     System.out.println(c);
	     System.out.println("=======================");
	    
	    /*자바의 자동 형변환 => 자동 산술법
	     * byte(1) -> short, car (2) -> int(4) ->long (8) float (4)
	     * -> doubled(8)손으로 자료형 키기가 커진다. 자동 산술법에 의한 자동형 변환이 
	     *  컴파일러에 의해서 이뤄진다. 

	     */
	    
	     float result=10+10.5f;
	     System.out.println(result);
	     
		
	}
}
