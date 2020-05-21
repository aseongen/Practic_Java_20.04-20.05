package net.daum.dao;

import java.util.ArrayList;
import java.util.List;

import net.daum.vo.BoardVo;

public class BoardDAOImp1 {

	public List<BoardVo> getBoardList() {
		
		List<BoardVo> li = new ArrayList<>();
	    
		li.add(new BoardVo ("제목1", "내용1"));
		li.add(new BoardVo ("제목2", "내용2"));
		
		return li;
	}

}
