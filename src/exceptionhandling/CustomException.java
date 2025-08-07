package exceptionhandling;

//here we are going to create the custom exception where we use our own business logic

class InvalidAgeException extends Exception {
	public InvalidAgeException(String message) {
		super(message);
	}
}

class AgeValidator {
	public void Age(int age, char gender) throws InvalidAgeException {
		if (age >= 18 && gender == 'm')
			System.out.println("you are eligible");
		else
			throw new InvalidAgeException("age must be 18+ and that should be male only");
	}
}

public class CustomException {
	public static void main(String[] args) throws InvalidAgeException {
		AgeValidator obj = new AgeValidator();
		obj.Age(2, 'F');
	}
}