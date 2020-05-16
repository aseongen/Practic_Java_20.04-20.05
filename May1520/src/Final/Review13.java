package Final;
class Company{
	String department;
	String name;
	private int seat;
	
	//생성자 오버로딩
	Company(String department, String name) {
		this.department=department;
		this.name=name;
	}
	
	public int getSeat() {
		return seat;
	}

	public void setSeat(int seat) {
		this.seat = seat;
	}
	
}//Company
class Worker extends Company{
	//생성자
	 Worker(String department, String name) {
		 super(department,name);
	 }
    
	 void p() {
		 System.out.println("부서: "+super.department);
		 System.out.println("이름: "+super.name);
	 }
}//Worker
public class Review13 {
      public static void main(String[] args) {
	
    	  Worker wr = new Worker("IT","나나");
    	  wr.p();
    	  
    	  wr.setSeat(15);
    	  System.out.println("자리: " + wr.getSeat()+"번");
    	  
    	  
}
}
