package com.ss.basics.recursion.test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.Test;

import com.ss.basics.recursion.Recursion;

/**
 * @author Matthew Hader
 *
 */
public class RecursionTest {
	
	Recursion test = new Recursion();
	
	int start = 0;
	int[] nums = {2, 4, 8};
	int[] nums2 = {1, 2, 4, 8, 1};
	int[] nums3 = {2, 4, 4, 8};
	int target = 14;
	
	@Test
	public void groupSumClumpTestOne() {
		assertTrue(test.groupSumClump(start, nums, target));
	}
	
	@Test
	public void groupSumClumpTestTwo() {
		assertTrue(test.groupSumClump(start, nums2, target));
	}
	
	@Test
	public void groupSumClumpTestThree() {
		assertFalse(test.groupSumClump(start, nums3, target));
	}
}
