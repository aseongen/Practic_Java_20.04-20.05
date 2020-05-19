import com.naver.model.IShapeClass;
import com.naver.model2.Circ;
import com.naver.model2.Rect;
import com.naver.model2.Tria;

public class Ex19_01 {
	public static void main(String[] args) {
/* 문제)
 *  1.com.naver.model 패키지에  IShapeClass 라는 인터페이스를 정의하고 추상메서드로 void draw()를 만든다. 
 *  2.com.naver.model2 패키지에  IShapleClass 인터페이스를 구현 상속한 자손클래스 Circ, Rect, Tria를 만들고 추상 메서드를 오버라이딩 한다. 
 *  3.실행문장으로 타원을 그린다. 사각형을 그린다. 삼각형을 그린다 출력하시오 
 *  4. main() 메서드 나머지 코드를 PT 를 보고 완성한다. 
 */
		IShapeClass ref = new Circ(); //업캐스팅
		ref.draw();
		
		ref = new Rect();
		ref.draw();
		
		ref = new Tria();
		ref.draw();
		
	}
}
