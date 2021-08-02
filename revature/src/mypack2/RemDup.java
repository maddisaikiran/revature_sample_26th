package mypack2;

import java.util.Arrays;
import java.util.Scanner;

public class RemDup {

	public static void main(String[] args) {
		int j = 0;
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		String arr[] = s.split(" ");
		Arrays.sort(arr);
		String a[] = new String[arr.length];
		for(int i = 0; i<arr.length-1;i++) {
			if(arr[i].equals(arr[i+1])) {
				continue;
			}
			else {
				a[j++] = arr[i];
			}
		}
		a[j] = arr[arr.length-1];
		for(int i = 0; i< j+1; i++) {
			System.out.println(a[i]+" ");
		}
		

	}

}
