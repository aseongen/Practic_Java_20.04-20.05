
public class Ex1_03 {
	
	static int add (int [] score) {
		int total =0;
		for (int i=0; i<score.length; i++) {
			total+=score[i];
		}
		return total;
		
	}//static
	
public static void main(String[] args) {
	int sum = add(new int [] {100,90,100});
	System.out.println("배열 원소 총합 = " + sum);
}//main
}