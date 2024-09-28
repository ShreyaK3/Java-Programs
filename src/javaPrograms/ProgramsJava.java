package javaPrograms;

import java.util.HashMap;
import java.util.Scanner;

public class ProgramsJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Java program to convert lowercaseletters to uppercase without using function");
		String original;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the string:");
		original = sc.nextLine();
		lowerToUpper(original);
		System.out.println("\n");
		upperToLower(original);
		ProgramsJava pj = new ProgramsJava();
		pj.uniquePairs();
	}
	//1. Program for converting lower case chracters to upper case
	public static void lowerToUpper(String temp) {
		char chars[] = temp.toCharArray();
		char upperChars[] = new char[chars.length];
		char ch;
		int ascii;
		for(int i=0; i<chars.length; i++) {
			ch= chars[i];
			ascii= ch;
			if(ascii>=97 && ascii<=122) {
				ascii= ascii -32;
				ch= (char)ascii;
				upperChars[i] = ch;
			}
			else {
				upperChars[i] = ch;upperChars[i] = ch;
			}
		}
		System.out.println("The Upper Case string is:");
		for(int j=0; j<upperChars.length;j++) {
			System.out.print(upperChars[j]);
		}
	}

	//2. Program for converting lower case chracters to upper case
	public static void upperToLower(String temp) {
		char chars[] = temp.toCharArray();
		for(int i=0; i<chars.length; i++) {
			if(chars[i]>='A' && chars[i]<='Z') {
				chars[i]=(char)((int)chars[i]+32);
			}
		}
		System.out.println("The Lower Case string is:");
		for(int j=0; j<chars.length;j++) {
			System.out.print(chars[j]);
		}
	}

	//3. Program for finding the unique pairs in an array
	public void uniquePairs() {
		int [] nums = {2,1,3,1,3,2,5};
		HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
		for(int i=0; i<nums.length; i++) {
			Integer count = map.get(nums[i]);
			if(count == null) {
				map.put(nums[i], 1);
			}
			else {
				map.put(nums[i], count + 1);
			}
		}
		int uniqueCount=0;
		for(Integer j: map.values()) {
			if(j==2) {
				uniqueCount+=1;
			}
		}
		System.out.println("The number of unique pairs is:" +uniqueCount);
	}

}
