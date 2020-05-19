class Button2{
	interface OnClickListener{
		void onClick(); //추상메서드
	}//중첩 인터페이스 => Button2$OnClickListener.class
	
	OnClickListener listener;
	
	void setOnClickListener(OnClickListener listener) {
		this.listener = listener;
	}
	
	void touch() {
		listener.onClick();//오버라이딩 된 메서드를 호출
	}
}//class Button2

class Window{
	Button2 button1 = new Button2();
	Button2 button2 = new Button2();
	
	Button2.OnClickListener listener = new Button2.OnClickListener() {
		
		@Override
		public void onClick() {
		}
	};//익명클래스 :Widow$1.class

    //기본 생성자
	Window(){
	   button1.setOnClickListener(listener);//첫번째 버튼 이벤트 등록
	   button2.setOnClickListener(new Button2.OnClickListener() {
		
		@Override
		public void onClick() {
			System.out.println("메시지를 보냅니다.");
		}
	}); //익명클래스 : Window$2.class
	}
 }//class window


public class Main2 {
	public static void main(String[] args) {
		
		Window w = new Window();
		w.button1.touch();
		w.button2.touch();

	}
}
