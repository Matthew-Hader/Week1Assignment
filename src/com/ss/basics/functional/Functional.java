/**
 * 
 */
package com.ss.basics.functional;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

/**
 * @author Matthew Hader
 *
 */
public class Functional {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Functional test = new Functional();
		Scanner sc = new Scanner(System.in);
		
		List<Integer> numList = Arrays.asList(1, 22, 93);
		List<String> strList = Arrays.asList("ax", "bb", "xc");
		
		List<Integer> numList2 = test.rightmostDigit(numList);
		for(int i = 0; i < numList2.size(); i++)
			System.out.println(numList2.get(i));
		
		numList2 = test.timesTwo(numList);
		for(int i = 0; i < numList2.size(); i++)
			System.out.println(numList2.get(i));
		
		List<String> strList2 = test.removeX(strList);
		for(int i = 0; i < numList2.size(); i++)
			System.out.println(strList2.get(i));
		
		

	}
	
	public List<Integer> rightmostDigit(List<Integer> numList){
		
		List<Integer> returnList = numList.stream().map(num -> num % 10).collect(Collectors.toList());
		
		return returnList;
	}
	
	public List<Integer> timesTwo(List<Integer> numList) {
		
		List<Integer> returnList = numList.stream().map(num -> num * 2).collect(Collectors.toList());
		
		return returnList;
	}
	
	public List<String> removeX(List<String> strList) {
		
		List<String> returnList = strList.stream().map(str -> str.replace("x", "")).collect(Collectors.toList());
		
		return returnList;
	}

}
