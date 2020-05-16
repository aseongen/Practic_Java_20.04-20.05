package Constructor;
class Duplicate01{
	void arr01(int []arr) {
    int [] score = {75, 88,91,33,100,55,95};
		
		int max = score[0]; //배열 원소 최대값
		int min = score[0]; //배열 최소값
		
		for(int i = 1; i < score.length; i++) {
			if( max < score[i]) {
				max = score[i];
				
			} else if (min > score [i]){
				min = score[i];
			}
			
		}//for 문 
		System.out.println("최대값 " + max);
		System.out.println("최소값 " + min);
  }
}//Duplicate01

class Duplicate02{
	int sum1(int [] arr2) {
     	int sum=0;
		for(int k:arr2) {
			sum+=k;
		}
		return sum;
	}
}//Duplicate03
//구구단

class Duplicate03{
	 void gugudan(int n) {
		System.out.println(n + "단");

		for (int i = 1; i < 9; i++) {
			System.out.println(n + "*" + i + "=" + (n * i));
		}
		System.out.println();
	}
}//Duplicate03

public class Review06 {
	public static void main(String[] args) {

		//Dup
		Duplicate01 dup = new Duplicate01();
        dup.arr01(null);
	
        System.out.println();
        
        //Dup02
        Duplicate02 dup2 = new Duplicate02();
        int [] arr2 = {1,2,3,4,5};
        int result = dup2.sum1(arr2);
        System.out.println("배열총합: "+result);
        
        System.out.println();    
        
        //Dup03
        Duplicate03 dup03 = new Duplicate03();
        dup03.gugudan(5);
	}
}
