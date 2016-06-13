package org.redlich.unit.rational;

public class Rational {
	private int numerator;
	private int denominator;

	public Rational() {
		this(0,0);
		}

	public Rational(int numerator,int denominator) {
		this.numerator = numerator;
		this.denominator = denominator;
		}

	public int getNumerator() {
		return numerator;
		}

	public int getDenominator() {
		return denominator;
		}

	public boolean sameDenominator(Rational rational) {
		return(getDenominator() == rational.getDenominator());
		}

	public Rational add(Rational rational) {
		return new Rational(getNumerator() + rational.getNumerator(),getDenominator());
		}
	}
