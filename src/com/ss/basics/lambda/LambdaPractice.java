/**
 * 
 */
package com.ss.basics.lambda;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * @author Matthew Hader
 *
 */

interface PerformOperation {
	boolean check(int x);
}

public class LambdaPractice {

	public static void main(String[] args) {
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		LambdaPractice test = new LambdaPractice();
		PerformOperation operation;
		boolean returnValue = false;
		String toPrint = "";
		
		try {
			int testCases = Integer.parseInt(reader.readLine());
			while(testCases --> 0) {
				String s = reader.readLine().trim();
				StringTokenizer st = new StringTokenizer(s);
				int op = Integer.parseInt(st.nextToken());
				int num = Integer.parseInt(st.nextToken());
				if(op == 1) {
					operation = test.isOdd();
					returnValue = test.checker(operation, num);
					toPrint = (returnValue) ? "Odd" : "Even";
				}
				else if(op == 2) {
					operation = test.isPrime();
					returnValue = test.checker(operation, num);
					toPrint = (returnValue) ? "Prime" : "Not prime";
				}
				else if(op == 3) {
					operation = test.isOdd();
					returnValue = test.checker(operation, num);
					toPrint = (returnValue) ? "Palindrome" : "Not palindrome";
				}
				System.out.println(toPrint);
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		

	}
	
	public boolean checker(PerformOperation p, int num) {
		return p.check(num);
	}
	
	public PerformOperation isOdd() {
		return (x) -> ((x % 2) == 1);
	}
	
	public PerformOperation isPrime() {
		return (x) -> {
			for(int i = 2; i <= (x / 2); i++) {
				if(x % i == 0)
					return false;
			}
			return true;
		};
	}
	
	public PerformOperation isPalindrome() {
		return (x) -> Integer.toString(x).equals(new StringBuilder(Integer.toString(x)).reverse().toString());
	}

}
