package mypack4;

import java.util.Scanner;

public class CodingChallenge1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		System.out.println(Palidrome(str));    
		
		}
	public static String Palidrome(String str) {
		String result = "";
		//String str = "abab";
		int l = str.length();
		String s = str.substring(l-1)+str;	
		
		StringBuffer sb = new StringBuffer(s);
		sb.reverse();
	
		if(s.equals(sb.toString())) {
			result= s.substring(0,1);
			return result;
		}else {
			return "Z";
		}
	}

}
