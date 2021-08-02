package mypack2;

import java.util.Scanner;

	public class Palirev {

		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			String s= sc.nextLine();
			String arr[] = s.split(" ");
			for(int i = 0; i < arr.length;i++ ) {
				StringBuffer sb = new StringBuffer(arr[i]);
				System.out.println(sb.reverse()+ " ");
			}
			

		}
}

