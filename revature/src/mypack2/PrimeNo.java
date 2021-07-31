package mypack2;

import java.util.Scanner;

public class PrimeNo {

	public static void main(String[] args) {
		int j = 0;
		Scanner sc = new Scanner(System.in);
		String s= sc.nextLine();
		String arr[] = s.split(" ");
	
		for(int i =0;i < arr.length;i++) {
			int l = Integer.parseInt(arr[i]);
			if(l == 2) {
				System.out.println(arr[i]+" ");
				continue;
				
			}
			for(j = 2; j <(l/2)+1;j++) {
				if(l % j == 0) {
					break;
				}
			}
			
			if(j == (l/2)+1) {
				System.out.println(arr[i]+" ");
			}
		}
	}

}
