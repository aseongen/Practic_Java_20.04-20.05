class Product{
	private String name;
	private int price;
	
	public void setName(String new_nameString) {
		name = new_nameString;
	}public String getName() {
		return name;
	}
	
	public void setPrice(int new_price) {
		price = new_price;
	}public int getPrice() {
		return price;
	}
}

public class ObjectTest05 {
	public static void main(String[] args) {

	 System.out.println("자판기 => 제품목록: ");
	
	 Product Product = new Product();
	 Product.setName("커피");
     Product.setPrice (150);
     System.out.println(Product.getName()+Product.getPrice() +"원,");
     
	 Product.setName("비타500");
     Product.setPrice (500);
     System.out.println(Product.getName()+"  "+Product.getPrice()+"원");
     
	}
}
