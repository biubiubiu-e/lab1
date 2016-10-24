package polynomialCalculation;

/**
 * @author Administrator
 *
 */ 
public class node {	
	
	/**
	 * 
	 */ 
	protected node left;
	/**
	 * 
	 */
	protected node right;	
	
	/**
	 * 
	 */
	public node()
	{
		left = null;
		right = null;
	}

	/**
	 * @return null
	 */
	public node getLeft() { 
	    return null; 
	}
	/**
	 * @return null
	 */
	public node getRight() { 
	    return null; 
	}
	/**
	 * @return null
	 */
	public char[] get() { 
	    return null; 
	    }
	
	/**
	 * @param n
	 */
	public final void manageLeft(final node n) {
		this.left = n ;
	}
	
	/**
	 * @param n
	 */
	public final void manageRight(final node n) {
		this.right = n ;
	}

}