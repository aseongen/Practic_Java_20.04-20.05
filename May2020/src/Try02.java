
public class Try02 {
	public static void main(String[] args) {
		
		// 이클립스 상단 Run -> Run Configuration -> Arguments -> 값을 입력하면 -> 배열에 값이 할당 된다.  
		
		if (args.length == 2) { //length 속성은 배열크기 반환
			String data01 = args[0];
			String data02 = args[2];
		    System.out.println("args[0]: " + data01);	
		    System.out.println("args[1]: " + data02);	

		}else{
            System.out.println("[실행방법]");
            System.out.println("값1 값2 2개의 배열원소값을 전달해야한다.");
		
		}//if ~else
	}

}
