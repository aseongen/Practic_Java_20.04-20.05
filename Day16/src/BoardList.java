import java.util.List;
import net.daum.dao.BoardDAOImp1;
import net.daum.vo.BoardVo;
public class BoardList {
	
	public static void main(String[] args) {

		BoardDAOImp1 bdao = new BoardDAOImp1();
		List<BoardVo> blist = bdao.getBoardList();
		
		
/* 문제1)
 *  다음과 같은 출력 결과물이 나오는 게시판 목록을 가져오는 메서드 getBoardList() 메서드를 작성하자
 *  제목1 - 내용 1
 *  제목2 - 내용2

 *  문제2) 
 *  main () 메서드에서 향상된 확장 for 반복문을 사용하여 위의 게시판 목록 출력물을 나오게 하자.
 */

		for(BoardVo bv : blist) {
			System.out.println(bv.getTitle() +" - " + bv.getContent());
		} //for 
		
	  	System.out.println("-------------------------------------");
		
	  	bdao = new BoardDAOImp1("제목1" , "내용1");
	  	bdao.p();
	  	
	 	bdao = new BoardDAOImp1("제목2" , "내용2");
	  	bdao.p();
	     
	     System.out.println("------------------------------------");
	     
	    for(BoardVo bd : blist) {
	    	System.out.println(bd.getTitle() +" - " + bd.getContent());
	     }
	     
	     

	     
	     
	   
	   
		
		
		
		
	}//main
}
