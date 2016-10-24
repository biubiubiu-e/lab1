package polynomialCalculation;

/**
 * @author Administrator
 *
 */
public class Digit extends Data {

	/**
	 * 
	 */
	private Integer d;
	
	/**
	 * @param d
	 */
	public Digit(final int d) { 
	    this.d = new Integer(d); }

	/**
	 * @return int
	 */ 
	public int getContent() { 
	    return d.intValue(); 
	    }
	
	/**
	 * @param d
	 */
	public void set(final int d) { 
	    this.d = new Integer(d); }

	/* (non-Javadoc)
	 * @see polynomialCalculation.node#get()
	 */
	@Override
	public char[] get() { 
	    return d.toString().toCharArray();
	    } 
	
}
