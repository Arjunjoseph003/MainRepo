package javaoopsconcepts;

public class UserDefinedExceptionExample {

	public static void main(String[] args) {

		String studentName = "Arjun";

		if (studentName.endsWith("an")) {
			System.out.println("The student name is in the list");
		} else {
			try {
				throw new StudentNameNotFoundException();
			} catch (Exception e) {
				System.out.println("Student Name is not in the list");
				e.printStackTrace();
			}

		}

	}
}
