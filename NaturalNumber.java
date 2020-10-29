
public class NaturalNumber {
	public int x;
	
	public NaturalNumber() throws ErrConstrException {
		this(0);
	}
	
	public NaturalNumber(int x) throws ErrConstrException {
		if(x >= 0)
			this.x = x;
		else {
			throw new ErrConstrException();
		}
	}
	
	public void add(NaturalNumber y) {
		this.x += y.x ;
	}
	
	public void minus(NaturalNumber y) throws ErrModifException {
		if((this.x - y.x) < 0 )
			throw new ErrModifException();
		else
			this.x -=  y.x;
	}
	
	public int getnaturalnumber() {
		return(x);
	}
	
	public void setnaturalnumber(int x) {
		this.x = x;
	}
	
	public String toString() {
		return("The natural number is "+x);
	}
	
	
}
