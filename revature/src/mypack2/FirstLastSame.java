package mypack2;

import java.util.Scanner;

public class FirstLastSame {

	public static void main(String[] args) {
		int n = 0;
		Scanner sc = new  Scanner(System.in);
		String s = sc.nextLine();
		String arr[] = s.split(" ");
		String a[] = new String[arr.length];
		for(int i=0; i<arr.length;i++) {
			int l = arr[i].length();
			if(l == 1) {
				continue;
			}
			String s1 = arr[i];
			if(s1.charAt(0)!= (s1.charAt(l-1))) {
				a[n++] = arr[i];
			}
		}
		for(int i = 0;i<n; i++) {
			System.out.println(a[i]+" ");
		}

	}

}
