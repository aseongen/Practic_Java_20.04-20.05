import java.util.Arrays;

public class Review2 {

	public static void main(String[] args) {
//배열의 요소의 순서를 반복해서 바꾼다(숫자 섞기, 로또번호 생성)
//100번 수행하는 배열을 랜덤으로 생성해라 
		int[] numArr= {0,1,2,3,4,5,6,7,8,9};
		System.out.println(Arrays.toString(numArr));
		
		for(int i=1;i<100;i++) {
			int n =(int)(Math.random()*10); //인덱스범위가0~9까지
			int tmp = numArr[0];
			numArr[0] = numArr[n];
			numArr[n] = tmp;
		}
		System.out.println(Arrays.toString(numArr));
		
	System.out.println("--------------------------------------------");	
	
	int[] ball = new int[45];
	for(int i=0; i<ball.length;i++) {
		ball[i] = i+1;
		
		int tmp=0; //두 값을 바꾸는데 사용할 임시변수
		int k=0;//임의의 값을 얻어서 저장할 변수
		//배열의 i 번째 요소와 임의의 요소에 저장된 값을 서로 바꿔서 값을 저장
		//0번째 부터 5번째 요소까지 모두 6개만 바꾼다.
		
		for(int j=0; j<6; j++) {
			j=(int)(Math.random()*10);
			tmp=ball[i];
			ball[i]=ball[j];
			ball[j]=tmp;
			
		}
		System.out.println(Arrays.toString(ball));
	}
	
	
	
	}

}
