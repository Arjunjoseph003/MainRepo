package javaoopsconcepts;

public class StudentNameNotFoundException extends Exception {
	@Override
	public String getMessage() {
		String msg = "The Student name is not found";
		return msg;
	}

}
