package polynomialCalculation;

/**
 * @author Administrator
 *
 */
public class Handler {
	
	/**
	 * 
	 */
	protected Calculator c ;
	
	/**
	 * @param c
	 */
	protected Handler(final Calculator c) {
		this.c = c ;
	}
	
	/**
	 * @param cmd
	 */
	public void doCmd(final String cmd) {
	}
	
	/**
	 * @return false
	 */
	public boolean isExit() { 
	    return false ;
	    }
}
