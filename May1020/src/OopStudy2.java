//참조형 반환타입 
class Data3{
	int x;
}
public class OopStudy2 {
	
	static Data3 copy(Data3 d3) {
		Data3 tmp = new Data3();
		tmp.x = d3.x;
		return tmp;
	}
	public static void main(String[] args) {

		Data3 d3 = new Data3();
		d3.x=10;
		
		Data3 d4 = copy(d3);
		System.out.println("d3 = "+ d3.x);
		System.out.println("d4 = " + d4.x);
	}
}
