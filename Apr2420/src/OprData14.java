
public class OprData14 {

	public static void main(String[] args) {

		int v01=5;
		int v02=2;
	
		int result01 = v01+ v02;
		System.out.printf("%d + %d = %d \n", v01,v02,result01);
		
        System.out.printf("%d - %d = %d \n", v01,v02,(v01-v02));		
		
        result01 = v01*v02;
        System.out.printf("%d * %d = %d \n", v01,v02,(v01*v02));	
	
        result01 = v01/v02;
        System.out.println(v01 + " / " + v02 + " = " + result01);
	    System.out.println(v01 + " % " + v02 + " = " + (v01%v02));
	    
	    /*문제)
	     * 나눗셈을 하여 결과값 2.5를 구해본다.
	     */
	
	    result01 = v01 / v02;
        System.out.println((double)result01+ 0.5);
	}
}
