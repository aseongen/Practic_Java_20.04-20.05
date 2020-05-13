class SubClass03 extends Object {
	int i = 3;

	public void p() {
		System.out.println("i= " + i);
	}
}

public class Ex17_3_Teacher {
	public static void main(String[] args) {

    Object o = new SubClass03(); //업캐스팅
	
	if(o instanceof SubClass03) { //다운캐스팅 가능 여부
	SubClass03 foo =(SubClass03) o; //다운캐스팅
       foo.p();
	}
	
	}
}
