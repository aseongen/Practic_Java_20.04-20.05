package com.naver.model2;

import com.naver.model.IShapeClass;

public class Rect implements IShapeClass {

	@Override
	public void draw() {
		System.out.println("타원을 그린다.");
	}

}
