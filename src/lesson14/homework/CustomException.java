package lesson14.homework;

/**
 * Пользовательский класс исключений
 * 
 * @author nedis
 * @version 1.0
 */
public class CustomException extends RuntimeException {
	private static final long serialVersionUID = -1347918112213969278L;
	
	public CustomException(String message, Throwable cause) {
		super(message, cause);
	}

	public CustomException(String message) {
		super(message);
	}

	public CustomException(Throwable cause) {
		super(cause);
	}

}
