package Projects.Student_Grade_Project;

public class InvalidGradeException extends RuntimeException {

	private static final long serialVersionUID = 5740828066209550012L;

	public InvalidGradeException(String message) {
		super(message);
	}

}