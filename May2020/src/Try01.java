
public class Try01 {
	public static void main(String[] args) {
		/* 배열이 만들어지지 않은 상태에서 실행을 했기 때문에
		 * 배열 오류 :  ArrayIndexOutOfBoundsException 이 발생한다. 
		 */
		String data01 =args[0]; //첫번째 배열 원소값 저장
		String data02 =args[1]; //두번째 배열 원소값 저장 

		// 이클립스 상단 Run -> Run Configuration -> Arguments -> 값을 입력하면 -> 배열에 값이 할당 된다.  
		//단, 한칸 띌것!!
		
		System.out.println("arg[0] : " + data01);
		System.out.println("arg[1] : " + data02);
	}//main

}//class 
