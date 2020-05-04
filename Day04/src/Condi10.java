
public class Condi10 {

	public static void main(String[] args) {

		int dan ; //단을 저장
		int j;
		
		for(dan=2; dan <=9; dan++) {
			System.out.println("**"+dan+"단**");
			for(j=1;j<=9;j++) {
				System.out.println(dan+" x " + j + " = " + (dan*j));
			} //inner for
		System.out.println("\n----------------");
		}//outer for
		
		//별표 *****5개씩 각행에 출력
		
		 for(int i=1; i<=5;i++) {
			 for(int k=1; k<=5;k++) {
				 System.out.print("* ");
			 }
		         System.out.println(); //줄바꿈
		 }
		System.out.println("\n--------------------------");
	
		
		
		
		
		
	}

}
