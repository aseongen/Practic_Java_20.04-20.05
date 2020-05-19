import java.util.Random;

public class ObjectTest13 {
	public static void main(String[] args) {

		int num = (int)(Math.random()*6)+1; //random()에 의해 0.0 이상, 1.0 미만 사이 실수 숫자 난수발생
		//=>*6하면 0.0 ~ 6.0미만 ->int 로 형변환 : 0이상 6미만 => +1 => 1~7미만 즉 1~6까지 임의의 정수숫자 난수 발생 
    
		
		System.out.println("임의의 주사위 눈번호 : " + num);
		
		Random r = new Random();
		int[] selectNumber = new int[6];
		System.out.print("로또번호: ");
		for(int i =0; i< selectNumber.length; i++) {
			selectNumber[i] = r.nextInt(45)+1; 
			//nextInt(45)는 0~45미만 임의의 정수 숫자 난수 => +1 하면 =>1~46미만 -> 즉,1~45까지 
			System.out.print(selectNumber[i]+ " ");
		}
	}

}
