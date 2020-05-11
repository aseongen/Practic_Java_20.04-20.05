import java.util.Scanner;

public class FinalTest12 {
	private static Account[] accountArray = new Account[100]; 
	//배열 크기가 100인 정적배열 생성
	private static Scanner scanner= new Scanner(System.in);
	
	public static void main(String[] args) {
    boolean run = true;
    
    while(run) {
    	System.out.println("----------------------------------------------------------------------------");
    	System.out.println("1.계좌 생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료");
    	System.out.println("----------------------------------------------------------------------------");
        System.out.print("선택>>>");    	
    	
        int selectNo = scanner.nextInt(); //정수숫자로 읽어드림
        
        if(selectNo==1) {
        	createAccount(); //계좌 생성 메서드 호출 
        } else if(selectNo==2) {
        	accountList(); //계좌와 목록보는 메서드 호출 
        } else if(selectNo==5) {
        	run=false; //무한루프 while 반복문 종료
        } else if (selectNo ==3) {
            deposit(); //예금하기 
        } else if (selectNo ==4) {
        	withdraw();//출금하기
        }
        
 /*뮨제)
  * 예금하기 메서드를 참조하여 출금하기 withdraw메서드를 완성하시오 
  */
    }//무한 루프문while
		System.out.println("프로그램 종료");
	}//main
	//예금하기
	 static void deposit() {
		 System.out.println("-------------------------------------------------------------------------------");
		 System.out.println("예금");
		 System.out.println("-------------------------------------------------------------------------------");
		 System.out.print("계좌번호: ");
         String ano = scanner.next();
         System.out.println("예금액: ");
         int money = scanner.nextInt();
         Account account = findAccount(ano); //계좌검색
         if (account == null) {
        	 System.out.println("결과: 계좌가 없습니다.");
         }
         account.setBalance(account.getBalance()+money); //계좌잔행+입금액
         System.out.println("결과: 예금이 성공되었습니다.");
	 }//deposit()
	 
	 //배열로 부터 ano와 동일한 Account 계좌객체 찾기
	 static Account findAccount(String ano) {
		 Account account=null;
		 for(int i=0;i<accountArray.length;i++) {
			 if(accountArray[i] !=null) {
				 String dbAno = accountArray[i].getAno();//
				 if(dbAno.equals(ano)) {
					 account = accountArray[i];
					 break;//for  반복문 종료
				 }
			 }
		 }//for
		 return account;
	 }//findAccount()
	  
	 //출금하기
	 static void withdraw() {
		 System.out.println("-------------------------------------------------------------------------------");
		 System.out.println("출금");
		 System.out.println("-------------------------------------------------------------------------------");
		 System.out.print("계좌번호: ");
         String ano = scanner.next();
         System.out.println("출금액: ");
         int money = scanner.nextInt();
         Account account = findAccount(ano); //계좌검색
         if (account == null) {
        	 System.out.println("결과: 계좌가 없습니다.");
         }
         account.setBalance(account.getBalance()-money); //계좌잔행+입금액
         System.out.println("결과: 출금이 성공되었습니다.");
	 }//withdraw()
	 
 
	//계좌생성하기
	private static void createAccount() {
		System.out.println("---------------------------------------------------------------------------------");
		System.out.println("계좌생성");
		System.out.println("---------------------------------------------------------------------------------");
	
	    System.out.print("계좌번호: ");
	    String ano = scanner.next(); //문자열로 읽어들임
	    
	    System.out.println("계좌주:  ");
	    String owner = scanner.next();
	    
	    System.out.println("초기입금액: ");
        int balance = scanner.nextInt();	   
        
        Account newAccount = new Account(ano,owner,balance); //오버로딩 된 생성자 호출
        for(int i =0; i<accountArray.length; i++) {
        	if(accountArray[i] == null) {
        		accountArray[i]= newAccount;
        		System.out.println("결과: 계좌가 생성되었습니다.");
        	    break; //for 반복문 종료 
        	}
        }//for
	
	}//createAccount
      static void accountList() {
    	  System.out.println("---------------------------------------------------------------------------------");
		  System.out.println("계좌목록");
		  System.out.println("---------------------------------------------------------------------------------");
	
          for(int i=0;i<accountArray.length;i++) {
        	  Account account = accountArray[i];
        	  if(account != null) {
        		  System.out.print(account.getAno());
        	      System.out.print("      ");
        	      System.out.print(account.getOwner());
        	      System.out.print("      ");
        	      System.out.print(account.getBalance());
        	      System.out.println(); //개행
        	   } //if
          }//for
      }//accountList()
}//class