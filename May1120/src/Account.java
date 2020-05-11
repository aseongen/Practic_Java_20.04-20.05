
public class Account {
     private String ano;
     private String owner;
     private int balance;
     
	  public Account () {}

	  public Account(String ano,String owner, int balance) {
		  this.ano=ano; this.owner=owner; this.balance=balance;
	}
	     //각자 이클립스 메뉴로 Setter(),getter ()메서드 생성
		public String getAno() {
			return ano;
		}
		public void setAno(String ano) {
			this.ano = ano;
		}
		public String getOwner() {
			return owner;
		}
		public void setOwner(String owner) {
			this.owner = owner;
		}
		public int getBalance() {
			return balance;
		}
		public void setBalance(int balance) {
			this.balance = balance;
		}	  
}
