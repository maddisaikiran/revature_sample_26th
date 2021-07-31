package mypack2;


import java.util.Scanner;

public class Mid_cap {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	String s = sc.nextLine();
	StringBuffer sb = new StringBuffer();
	String arr[] = s.split(" ");
	for(int i = 0; i < arr.length; i++) {
		int l = arr[i].length();
		if(l % 2 == 0) {
			sb.append(Character.toUpperCase(arr[i].charAt(0))).append(arr[i].substring(1)).append(" ");
			
		}else
		{
			int h = l/2;
			sb.append(arr[i].substring(0 , h)).append(Character.toUpperCase(arr[i].charAt(h))).append(arr[i].substring(h+1)).append(" ");
			
		}
	}
	System.out.println(sb.toString());
	}
}

