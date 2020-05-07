//멤버변수오 ㅏ매개변수가 같을때 생기는 에러 
class Board14{
	private String writer;// 글쓴이
	private String title;//  제목

    Board14(){}//매개변수가 없는 생성자를 기본(default)  생성자라고 한다.
    
    Board14(String new_writer, String new_title){
    	writer = new_writer; title = new_title;
    } //매개변수 개수를 다르게 한 생성자 오버로딩

    void p() {
    	System.out.println("작성자: " +  writer);
    	System.out.println("제목: " +  title);
    } //p()메서드 
     
}


public class ObjectTest15 {
	public static void main(String[] args) {

		Board14 b = new Board14(); //기본 생성자 호출 
		b.p(); 
		
		Board14 b2 = new Board14("홍길동","제목입니다"); // 매개변수2개짜리 오버로딩된 생성자 호출
		b2.p();
		
	}

}
