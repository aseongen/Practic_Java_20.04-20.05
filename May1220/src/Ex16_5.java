class TestSuper{
	TestSuper(){}
	TestSuper(int i) {}
}
//기본 생성자를 호출하지 않아서 2번쨰줄 주석처리하면 에러남 
class TestSub extends TestSuper{}


public class Ex16_5 {
  public static void main(String[] args) {
	  new TestSub();
   }
}
