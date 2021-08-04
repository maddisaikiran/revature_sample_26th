package exception_handling;

public class BusinessLayer {
public void isValidAadharNumber(String aadharNumber) throws InvalidAadhar, InvalidAadharLength{
	aadharNumber = aadharNumber.replace(" ", "").trim();
	if(aadharNumber.matches("[0-9]{12}")) {
		System.out.println("Aadhar Number is Valid");
	}else if(aadharNumber.length()>12) {
		throw new InvalidAadharLength(" Invalid Aadhar Number Length");
	}else {
		throw new InvalidAadhar("Invalid Aadhar Number");
	}
}
public void isValidPassword(String password) throws InvalidPassword{
	if(password.matches("[A-Z]{1}[0-9]{1}[!@#$%&*]{1}[a-zA-Z]{5,18}")) {
		System.out.println(password + "is a valid passowrd");
	}else {
		throw new InvalidPassword(password +"is a valid password");
	}
}
}

