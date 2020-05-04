
public class Condi12_Ex07_02 {

	public static void main(String[] args) {
		
//07 다양한 제어문의 활용 예제_문제1)
		
		int i;
		int tot=0;
		
		for (i=1;i<=100; i++) {
			tot+=i; //누적합
			if(i % 10 == 0) {
				System.out.println("1 ~ " + i + "까지의 합 : "+ tot);
			}//if
		} //for
	
		System.out.println("\n----------------------------------------------------------------------------\n");
		
//문제 2) 
	   for (i=2; i<=100; i+=2) {
		   System.out.print(i+ "\t");
		   if (i%20==0) {
			   System.out.print("\n");
		   }//if
	   }//for
	   
	   System.out.println("\n----------------------------------------------------------------------------\n"); 
	   int a;
	   int b;
	   
	   for (a=1;a<=5;a++) {
		   for(b=1;b<=6-a;b++) {
			   System.out.print("* ");
		   }
		   System.out.println();
	   }
	   
	   
	   System.out.println("\n----------------------------------------------------------------------------\n"); 
	   for (a=1;a<=5;a++) {
		   for(b=5;b>a-1;b--) {
			   System.out.print("* ");
		   }
		   System.out.println();
	   }
	   
	  
	} //main 
}//class
