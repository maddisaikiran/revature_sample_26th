package mypack1;

import java.util.Scanner;

public class Domain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		if(s.startsWith("https")) {
			System.out.println("Secure");
		}else if(s.startsWith("http")){
			System.out.println("Not Secure");
		}else {
			System.out.println("not valid website");
		}
	sc.close();

	}

}
