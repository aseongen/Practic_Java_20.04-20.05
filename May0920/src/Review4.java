
public class Review4 {
	
	public static void main(String[] args) {
	
		int max=0;
		int min=0;
		int[] array = {1,5,3};
		
		for(int i=0;i<array.length;i++) {
			if(array[i] >max) {
				max=array[i];
			}else if(array[i]<min){
				min=array[i];
			}
		}
		System.out.println(max);
		System.out.println(min);
		
}
}
