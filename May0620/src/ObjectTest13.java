class MyDate12{
	private int year;
	private int month;
	private int day;

    MyDate12(){ //기본생성자 호출
         //생성자 옆괄호 : 매개변수
    	System.out.println("매개변수가 없는 기본생성자 호출 ");
    /* 생성자 특징) :Constructor
     * 생성자 이름은 클래스명과 같게 만들어야 한다.
     * 생성자명 앞에 리턴 타입이 없다.
     */
    }

    void pr() { //리턴값 없음
    	System.out.println(year + "/" + month + "/" + day);  // 기본값 0/0/0 출력예정
    }

}

public class ObjectTest13 {
	public static void main(String[] args) {

		MyDate12 m = new MyDate12(); //new MyDate12(); 에 의해서 생성자를 호출
		m.pr();
		
		
	}
}
//객체생성해서 접근하는 인스턴스변수
