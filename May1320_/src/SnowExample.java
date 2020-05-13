import net.daum.model.Tire;
import net.daum.model2.SnowTire;

public class SnowExample {

	public static void main(String[] args) {

/*문제
 * 1. net.daum.model 패키지 에 Tire 클래스를 정의하고, void run 메서드를 만들고 실행결과값으로 "일반타이어가 굴러갑니다" 
 * 2. net.daum.model2패키지에 Tire를 상속받은 자손클래스 SnowTire 를 만들고 run()메서드를 오버라이딩 한다. 
 *    실행문장으로 "스노우 타이어가 굴러갑니다."
 * 3. main() {} Tire 객체를 만든다음 instanceof 연산자를 활용하여 다운캐스팅한 snowTire 객체를 생성해서 오버라이딩 한 메서드를 호출합니다.
 * 4. Tire 클래스 객체 tire2를 생성해서 조상클래스메서드를 호출합니다.
 */
		Tire tire = new SnowTire(); //업캐스팅
		
		if( tire instanceof SnowTire) {//다운캐스팅
			SnowTire SnowTire = (SnowTire)tire;
			SnowTire.run();
		}
		
		Tire tire2 = new Tire();
	    tire2.run();
		
	}

}
