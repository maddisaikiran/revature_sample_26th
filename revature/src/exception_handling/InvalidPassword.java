package exception_handling;

public class InvalidPassword extends RuntimeException {

	public InvalidPassword() {
		super();
	}

	public InvalidPassword(String message) {
		super(message);
	}

}
