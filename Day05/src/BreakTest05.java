import java.util.Scanner;

public class BreakTest05 {
	public static void main(String[] args) {

    int menu=0;
    
    Scanner sc = new Scanner(System.in);
    
    while(true) {
    	System.out.println("원하는 점심 메뉴를 (1~3)선택하세요");
    	System.out.println("1) 떡볶이 ");
    	System.out.println("2) 아이스크림 ");
    	System.out.println("3) 케이크 ");
        System.out.print(">>> ");
        
    menu=Integer.parseInt(sc.nextLine()); //nextLine()메서드로 문자열로 읽어들여서,parseInt 정수숫자로 변경한다.
    
    if (menu == 0) {
    	System.out.println("프로그램을 종료합니다.");
    	break; //반복문 중단 
    } else if (!(1<=menu && menu <=3)) {
    	System.out.println("잘못된 메뉴 선택입니다.(종료 0)");
    	continue;
    } //if else if 
    
    if (menu == 1 ) {
        System.out.println("오늘의 점심 메뉴는~~~??? : 떡볶이 입니다.");
        System.out.println("------------------------------");
    }else if (menu == 2) {
    	System.out.println("오늘의 점심 메뉴는~~~??? : 아이스크림 입니다.");
    	System.out.println("------------------------------");
    }else if(menu == 3){
    	System.out.println("오늘의 점심 메뉴는~~~??? : 케이크 입니다. ");
    	System.out.println("------------------------------");
    }//if else if 
    
    }//while
	
	
	
	}
}
