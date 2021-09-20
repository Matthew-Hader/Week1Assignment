package com.ss.basics.functional.test;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

import com.ss.basics.functional.Functional;

/**
 * @author Matthew Hader
 *
 */
public class FunctionalTest {

	Functional test = new Functional();
	
	List<Integer> numList = Arrays.asList(1, 22, 33, 64, 5);
	List<Integer> numList2 = Arrays.asList(1, 2, 3, 4, 5);
	List<Integer> numList3 = Arrays.asList(2, 4, 6, 8, 10);
	
	List<String> strList = Arrays.asList("xaxx", "bbxb", "ccc", "dx");
	List<String> strList2 = Arrays.asList("a", "bbb", "ccc", "d");
	
	@Test
	public void rightmostDigitTest() {
		assertEquals(test.rightmostDigit(numList), numList2);
	}
	
	@Test
	public void timesTwoTest() {
		assertEquals(test.timesTwo(numList2), numList3);
	}
	
	@Test
	public void removeXTest() {
		assertEquals(test.removeX(strList), strList2);
	}
}
