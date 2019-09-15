/**
 * @author 15052
 * ÕûĞÍ¾ØÕóÀà
 */
package com.Matrix;

public class IntegerMatrix extends GenericMatrix<Integer>{

	@Override
	protected Integer add(Integer e1, Integer e2) {
		// TODO Auto-generated method stub
		return e1 + e2;

	}

	@Override
	protected Integer multiply(Integer e1, Integer e2) {
		// TODO Auto-generated method stub
		return e1 * e2;

	}

	@Override
	protected Integer zero() {
		// TODO Auto-generated method stub
		return 0;

	}
	public void testIntegerMatrix() {
		GenericMatrix<Integer> gm = new IntegerMatrix();
		Integer[][] m1 = {{1, 2, 3}, {4, 5, 6}, {1, 1, 1}};
		Integer[][] m2 = {{1, 1, 1}, {2, 2, 2}, {0, 0, 0}};
		
		gm.printResult(m1, m2, gm.matrixAdd(m1, m2), '+');
		System.out.println("");
		gm.printResult(m1, m2, gm.matrixMultiply(m1, m2), '*');		
	}


}
