import java.util.Scanner;

public class Ex5_10 {

	static void name() { //void는 리턴타입이 없다.(반환값이 없다)
		System.out.println("자기이름: 홍길동");
	}
	
    static void guDan(int dan) {
    	System.out.println(" "+dan+"단");
    	for(int i=1;i<=9;i++) {
    		System.out.println(dan + " * " + i+ " = " +(dan*i));
    	}
    }
	
	public static void main(String[] args) {
	name(); //이름을 출력
	 Scanner sc = new Scanner(System.in);
	 
	 System.out.println("구구단(2~9사이만 입력)>>>");
      int k =sc.nextInt();
      if (2 <= k && k<=9) {
    	  guDan(k);
    	 
    	  /*문제)
    	   * 입력한 해당 숫자의 구구단을 출력하는 프로그램을 완성하세요 (메소드를 활용해서)
    	   */
    	  
      }else {
    	  System.out.println("2~9사이 정수값만 입력하세요!");
      }
      
/*      static void guDan(int k) {
    	  System.out.println(k+"단");
          for(int i=1;i<=9;i++) {
        	 System.ou.println(k+"*"+i+"="+(k*i)); 
          }*/
      }
	}
