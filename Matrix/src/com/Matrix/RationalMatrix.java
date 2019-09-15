package com.Matrix;

public class RationalMatrix extends GenericMatrix<Rational>{

	@Override
	protected Rational add(Rational e1, Rational e2) {
		// TODO Auto-generated method stub
		return e1.add(e2);
	}

	@Override
	protected Rational multiply(Rational e1, Rational e2) {
		// TODO Auto-generated method stub
		return e1.multiply(e2);
	}

	@Override
	protected Rational zero() {
		// TODO Auto-generated method stub
		return new Rational(0, 1);
	}
	public void testRationalMatrix() {
		Rational[][] r1 = new Rational[3][3];
		Rational[][] r2 = new Rational[3][3];
		for (int i = 0; i < r1.length; i++)
			for (int j = 0; j < r1[0].length; j++) {
				r1[i][j] = new Rational(i + 1, j + 5);
				r2[i][j] = new Rational(i + 1, j + 6);
			}
		
		GenericMatrix<Rational> rm = new RationalMatrix();
		
		rm.printResult(r1, r2, rm.matrixAdd(r1, r2), '+');
		System.out.println("");
		rm.printResult(r1, r2, rm.matrixMultiply(r1, r2), '*');
	}

}
