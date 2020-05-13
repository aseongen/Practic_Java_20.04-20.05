package com.abc.model2;

import com.abc.model.ShapeClass;

public class Circ extends ShapeClass {
//공통된 기능을 일원화로 
	@Override
	public void draw() {
	    System.out.println("타원을 그린다");
	}
	

}
