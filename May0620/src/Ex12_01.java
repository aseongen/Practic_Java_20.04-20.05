class Mp3 {
	private String comp;
	private int size;
	
	/* 매개변수가 없는 기본 생성자가 생략됨(자바 컴파일러가 기본제공함)
	 * 생성자이름은 클래스명과 같다.
	 *  
	 */
	
	public void setcomp(String new_comp) {
		comp = new_comp;
	}
	public String getcomp() {
		return comp;
	}
	public void setsize(int new_size) {
		size = new_size;
	}
	public int getsize() {
		return size;
	}
	
}

public class Ex12_01 {
	public static void main(String[] args) {

		Mp3 m = new Mp3();
		m.setcomp("갑을회사");
		m.setsize(8);
		
		System.out.println("회사명:"+ m.getcomp() + ",  메모리:"+ m.getsize() + "G");
	}
}
