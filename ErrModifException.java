

public class ErrModifException extends Exception {
	
	public ErrModifException(String s) {
		super(s);
	}
	
	public ErrModifException() {
		this("Subraction from the value of integer is less than zero!!");
	}
	
}
