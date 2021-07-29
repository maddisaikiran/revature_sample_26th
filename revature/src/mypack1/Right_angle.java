package mypack1;

import java.util.Scanner;

public class Right_angle {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		double c = Math.pow(a, 2) + Math.pow(b, 2);
		double d = Math.sqrt(c);
		System.out.println((int)d);
		sc.close();

	}

}
