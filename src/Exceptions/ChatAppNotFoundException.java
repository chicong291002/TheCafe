package Exceptions;

public class ChatAppNotFoundException extends Exception {

	private static final long serialVersionUID = 1L;
	public ChatAppNotFoundException(String message) {
        super(message);
    }
}
