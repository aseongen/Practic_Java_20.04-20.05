import com.abc.model.ShapeClass;
import com.abc.model2.Circ;
import com.abc.model2.Rect;
import com.abc.model2.Tria;

public class AbsTest05 {
	public static void main(String[] args) {

//외부 패키지 클래스 읽어 들이는 중. ..
		Circ c = new Circ();
		c.draw();
		
		Rect r= new Rect();
		r.draw();
		
		Tria t = new Tria();
		t.draw();
		
		System.out.println("-----------------------------------");
		
		ShapeClass ref; //추상클래스로 참조변수 선언
		ref = new Circ(); //업캐스팅
		ref.draw(); //업캐스팅 후 오버라이딩 된 메서드 호출 
		ref = new Rect();
		ref.draw();
		ref = new Tria();
		ref.draw();
		
		
		
		
		
		
		
	}
}