//내부적메서드 호출법
class Calculator{
	int plus(int x, int y) {
		return x + y;
	} //덧셈결과값 반환

	double avg(int x, int y) {
		double sum = plus(x,y);//int 타입 덧셈결과값이 double 실수타입으로 자동형변환이 되어져서
		//덧셈 결과값 저장 
		double result = sum / 2; //double /int - double/double ->double(자동산술법)
		return result;//평균이 몫과 나머지 함께 구한다. 
	} //평균이 반환됨
	 
	void execute() {
		double result = avg(7,10);// 평균을 반환
		print("평균 = "+ result);
	}
	void print(String message) {
		System.out.println(message); // 평균값 출력예제 
	}
	
}

public class ConsTest05 {
	public static void main(String[] args) {

		Calculator cal  = new Calculator();
		cal.execute();

	
	}
}
