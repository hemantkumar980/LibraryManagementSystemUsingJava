package pkg_exception;

public class BookNotFoundException extends Exception {

	private static final long serialVersionUID = 1L;

	public BookNotFoundException() {
		
	}

	@Override
	public String toString() {
		return "BookNotFoundException is Generated";
	}
	
}
