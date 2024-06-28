package exceptionConcepts;

public class Basic {

	public static void main(String[] args) throws InvalidAgeException {

		int age = 17;

		if (age >= 18) {
			System.out.println("Eligible to Vote");
		} else {
			//System.out.println("not eligible");
			throw new InvalidAgeException("you are not eligible");

		}
	}

}
