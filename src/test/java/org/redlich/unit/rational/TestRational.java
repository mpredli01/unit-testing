package org.redlich.unit.rational;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TestRational {
	private Rational rational1;
	private Rational rational2;

	public TestRational() {
		}

	@Before
	public void setup() {
		rational1 = new Rational(3,2);
		rational2 = new Rational(1,2);
		}

	@Test
	public void testDefault() {
		assertEquals(rational1.getNumerator(),3);
		assertEquals(rational1.getDenominator(),2);
		}

	@Test
	public void testPrimary() {
		assertEquals(rational2.getNumerator(),1);
		assertEquals(rational2.getDenominator(),2);
		}

	@Test
	public void testSameDenominator() {
		assertEquals(rational1.sameDenominator(rational2),true);
		}

	@Test
	public void testAdd() {
		Rational rational3 = rational1.add(rational2);
		assertEquals(rational3.getNumerator(),4);
		assertEquals(rational3.getDenominator(),2);
		}
	}
