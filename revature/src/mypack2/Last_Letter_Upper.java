package mypack2;

import java.util.Scanner;

public class Last_Letter_Upper {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		StringBuffer sb = new StringBuffer();
		String arr[] = s.split(" ");
		for(int i = 0; i < arr.length; i++) {
			int l = arr[i].length();
			sb.append(arr[i].substring(0 , l-1)).append(Character.toUpperCase(arr[i].charAt(l - 1))).append(" ");

	}
System.out.println(sb.toString());
}
}
