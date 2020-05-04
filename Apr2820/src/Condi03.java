
public class Condi03 {

	public static void main(String[] args) {

		int time = (int)(Math.random()*4)+8;
/* Math.random () : 0.0 이상, 1.0미만 -> *4하면 0.0 이상 4.0미만 -> 
 * (int)캐스팅하면 0이상 4미만 -> +8하면 =>  8이상 12미만 즉 11사이의 정수 숫자 난수 발생  
 */
 
		System.out.println("[현재시간 : "+time+"시]");
		switch(time) {
		case 8: System.out.println("출근합니다.");
		case 9: System.out.println("회의를합니다.");
		case 10: System.out.println("업무를합니다.");
		default: System.out.println("외근을 나갑니다.");
		}
		
		
	}

}
