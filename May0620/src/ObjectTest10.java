//레퍼런스에 의한 호출 방식 예제
class MyDate09{
	int year =2019;
	int month =12;
	int day =31;
}

class RefMethod{
	void changeDate(MyDate09 t) { //MyDate09 t =d가 된다. 주소값을 공유한다.
		t.year=2020; t.month =12; t.day=11;
	}
	
}


public class ObjectTest10 {
	public static void main(String[] args) {
 
		MyDate09 d = new MyDate09();
		RefMethod rf = new RefMethod();
		
		System.out.println("함수 호출 전: " + d.year+ "/" + d.month + "/" + d.day);

		rf.changeDate(d); //이때, 주소값이 할당된다.
	
		System.out.println("함수 호출 후: "+ d.year +"/" +d.month + "/" + d.day);
	
	
	
	
	
	
	}
}
