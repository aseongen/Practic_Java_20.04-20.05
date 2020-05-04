
public class Data08 {
	public static void main(String[] args) {
    byte byteValue =10; //byte -> int 로 자동형변환
    int intValue = byteValue;
    System.out.println(intValue);
    
    intValue =500; // -> int -> long 자동 형변환 
    long longValue=intValue;
    System.out.println(longValue);
    
    intValue =200;// -> int -> double 변환
    double doubleValue = intValue;
    System.out.println(doubleValue);
	}
}
