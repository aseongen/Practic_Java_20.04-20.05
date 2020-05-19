package com.naver.model2;

import com.naver.model.IShapeClass;

public class Circ implements IShapeClass {
//new -> class -> interfaces -> Add -> 조상패키지 선택 -> 자동 오버라이드 생성
	@Override
	public void draw() {
		System.out.println("타원을 그린다.");
	}

}
