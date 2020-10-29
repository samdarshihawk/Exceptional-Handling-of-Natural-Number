

public class ErrConstrException extends Exception {
	public ErrConstrException(String s) {
		super(s);
	}
	
	public ErrConstrException() {
		this("Argument passed in the constructors is less than zero!!");
	}
	
}
