package com.Matrix;

public class Rational extends Number implements Comparable<Object>{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private long numerator;// ·Ö×Ó
	private long denominator;// ·ÖÄ¸
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rational rational1 = new Rational(1, 10);
		Rational rational2 = new Rational(1, -10);
		System.out.println(rational1.add(rational2));
		System.out.println(rational1.subtract(rational2));
		System.out.println(rational1.multiply(rational2));
		System.out.println(rational1.divide(rational2));
		}
	public Rational() {
		// TODO Auto-generated constructor stub
		this(0, 1);
		}
	public Rational(long numerator, long denominator) {
		long gcd = gcd(numerator, denominator);
		this.numerator = (denominator > 0 ? 1 : -1) * numerator / gcd;
		this.denominator = Math.abs(denominator) / gcd;
		}
	public static long gcd(long a, long b) {
		long n1 = Math.abs(a);
		long n2 = Math.abs(b);
		long remainder = n1 % n2;
		while (remainder > 0) {
		n1 = n2;
		n2 = remainder;
		remainder = n1 % n2;
		}
		return n2;
		}
	public long getNumerator() {
		return numerator;
		}
	public long getDenominator() {
		return denominator;
		}
	public Rational add(Rational secondRational) {
		long n = numerator * secondRational.getDenominator() + denominator
		* secondRational.getNumerator();
		long d = denominator * secondRational.getDenominator();
		return new Rational(n, d);
		}
	public Rational subtract(Rational secondRational) {
		long n = numerator * secondRational.getDenominator() - denominator
		* secondRational.getNumerator();
		long d = denominator * secondRational.getDenominator();
		return new Rational(n, d);
		}
	public Rational multiply(Rational secondRational) {
		long n = numerator * secondRational.getNumerator();
		long d = denominator * secondRational.getDenominator();
		return new Rational(n, d);
		}
	public Rational divide(Rational secondRational) {
		long n = numerator * secondRational.getDenominator();
		long d = denominator * secondRational.getNumerator();
		return new Rational(n, d);
		}
	@Override
	public boolean equals(Object obj) {
	// TODO Auto-generated method stub
	if (this.subtract((Rational) obj).getNumerator() == 0) {
	return true;
	}
	else {
	return false;
	}
	}
	@Override
	public String toString() {
	// TODO Auto-generated method stub
	if (denominator == 1) {
	return String.valueOf(numerator);
	}
	else {
	return numerator + "/" + denominator;
	}
	}
	@Override
	public int intValue() {
	// TODO Auto-generated method stub
	return (int) doubleValue();
	}
	@Override
	public long longValue() {
	// TODO Auto-generated method stub
	return (long) doubleValue();
	}
	@Override
	public float floatValue() {
	// TODO Auto-generated method stub
	return (float) doubleValue();
	}
	@Override
	public double doubleValue() {
	// TODO Auto-generated method stub
	return numerator * 1.0 / denominator;
	}
	@Override
	public int compareTo(Object o) {
	// TODO Auto-generated method stub
	if (this.subtract((Rational) o).getNumerator() > 0) {
	return 1;
	}
	else if (this.subtract((Rational) o).getNumerator() < 0) {
	return -1;
	}
	else {
	return 0;
	}
	}
}
