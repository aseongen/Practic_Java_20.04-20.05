//애플리케이션 통합시험
class Gu{
      public void guguDan() {
    //코드 작성
    	  for(int i =2 ;i<=9 ; i++) {
    	    	 System.out.println(i +"단");
    	         for(int k=1;k<=9; k++) {
    	        	 System.out.println(i + " * " + k + " = " +(i*k));
    	         }
    	         System.out.println("--------------------");
    	     }
      }
}//Gu class
public class Ex1_01 {
    public static void main(String[] args) {
      Gu g=new Gu();//new로 객체생성
      g.guguDan(); 
    }
}