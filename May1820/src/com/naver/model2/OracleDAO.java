package com.naver.model2;

import com.naver.model.DataAccessObject;

public class OracleDAO implements DataAccessObject {

	@Override
	public void select() {
		System.out.println("오라클 DB에서 자료검색 하나.");
	}

	@Override
	public void insert() {
		System.out.println("오라클 DB에서 자료검색 삽입.");
	}

	@Override
	public void update() {
		System.out.println("오라클 DB에서 자료를 저장.");
	}

	@Override
	public void delete() {
		System.out.println("오라클 DB에서 자료를 삭제.");
	}

}
