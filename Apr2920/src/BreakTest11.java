
public class BreakTest11 {
	public static void main(String[] args) {
		/*
		 * 문제) 1부터 100까지의 정수 중 제일 큰 7의 배수를 구하시오.
		 */
		for (int i = 100; i > 0; i--) {
			if (i % 7 == 0) {
				System.out.print(" " + i);
			}
		}
		
		System.out.println("-----------------");
				int sum = 0;
				for(int i=1; i<=5; i++) {
					if(i==3) {
						continue;
					}
					sum=sum+i;
					
				}
				System.out.println("1+2+3+4+5 = " +sum);
			}
	
}
		

	
