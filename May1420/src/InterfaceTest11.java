interface Vehicle{
	void run();
}//Vehicle
class Bus implements Vehicle{

	@Override
	public void run() {
		System.out.println("버스가 달립니다. ");
	}
	
	public void checkFare() {
		System.out.println("승차요금을 체크합니다. ");
	}
}//Bus

class Taxi implements Vehicle{

	@Override
	public void run() {
	 System.out.println("택시가 달립니다.");
	}
}//Taxi

class Driver{
	void drive(Vehicle vehicle) { //다형성  -> 상속 + 업캐스팅 (모든 자손타입을 받을 수 있다.)
//업캐스팅 후 오버라이딩 된 메서드 호출 
		if(vehicle instanceof Bus) { //다운캐스팅 가능하면 참 
			Bus driver2 = (Bus)vehicle;//명시적 다운캐스팅 
			driver2.checkFare(); //승차요금 체크 
		}else {
			vehicle.run();
		}//if~else 
	}
}//Driver

public class InterfaceTest11 {
	public static void main(String[] args) {

		Driver driver = new Driver();
		Bus bus = new Bus();
		Taxi taxi = new Taxi();
		
		driver.drive(bus);
		driver.drive(taxi);
		
/* 문제)버스는 손님 고객이 탈때 승차요금 체크를 합니다. 
 * drive.drive(bus); 를 호출할때 해당메서드에서 어떤 자바코드를 하여 해당 메서드를 호출해 승차요금체크를 해주는 코드를 작성하세요.
 */
		//Vehicle bs = new Bus();
	}//main
}//class
