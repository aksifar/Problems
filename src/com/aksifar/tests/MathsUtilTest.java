package com.aksifar.tests;

import static org.junit.Assert.*;

import org.junit.Test;

import com.aksifar.Util.MathsUtil;

public class MathsUtilTest {

	@Test
	public void testGcd1() {
		int actual = MathsUtil.gcd(14, 42);
		int expected = 14;
		assertEquals(expected, actual);
	}
	
	@Test
	public void testGcd2() {
		int actual = MathsUtil.gcd(3, 2);
		int expected = 1;
		assertEquals(expected, actual);
	}

}
