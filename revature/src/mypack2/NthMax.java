package mypack2;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class NthMax {

	public static void main(String[] args) {
		int j = 0;
		Scanner sc = new Scanner(System.in);
		String s= sc.nextLine();
		int N = sc.nextInt();
		String arr[] = s.split(" ");
		String a[] = new String[arr.length];
		Arrays.sort(arr,Collections.reverseOrder());
		for(int i = 0; i< arr.length-1;i++) {
			if(arr[i].equals(arr[i+1])) {
				continue;
			}
			else {
				a[j++] = arr[i];
			}
		}
		if(arr[arr.length-2].equals(arr.length-1)) {
		}
		else {
			a[j++] = arr[arr.length-1];
		}
		System.out.println(a[N-1]);
	}

}
