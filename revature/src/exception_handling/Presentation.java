package exception_handling;

import java.util.Scanner;

public class Presentation {

	public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
		
		BusinessLayer check = new BusinessLayer();
		
		System.out.print("Enter the Aadhar Number to Validate : ");
		try {
			check.isValidAadharNumber(sc.nextLine());
		} catch (InvalidAadhar e) {
			System.out.println(e.getMessage());
		} catch(InvalidAadharLength e) {
			System.out.println(e.getMessage());
	} 
//			finally {
//			System.out.println("Error Handling Sucessfull!!!");
//		}
          System.out.println();
		
		BusinessLayer password = new BusinessLayer();
		
		System.out.print("Enter the password to validate : ");
		
		try {
			password.isValidPassword(sc.nextLine());
		} catch (InvalidPassword e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		} 
//		finally {
//			System.out.println("Error Handling Sucessfull!!!");
//		}
		sc.close();
		
	}

}
