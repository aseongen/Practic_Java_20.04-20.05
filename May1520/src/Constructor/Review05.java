package Constructor;
class Tablet{
	String brand = "삼성";
	String model;
	String color;
	int price;
	
	Tablet(){}
	
	Tablet( String model, String color, int price) {
		this.model = model;	this.color = color;	this.price = price;
	}
	
    void p() {
    	System.out.printf("brand: " + brand + ", model: " + model );
        System.out.printf(", color: " + color + ", price: " + price);
    }
}
public class Review05 {
    public static void main(String[] args) {
		
         Tablet tb = new Tablet("플랙스","흰색",100);
         tb.p();
  }
}
