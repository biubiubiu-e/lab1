package polynomialCalculation;

/**
 * @author Administrator
 *
 */
public class HandlerSimplify extends Handler {
    /**
     * 
     */
    public static final int NIAN = 9;
    
	/**
	 * @param c
	 */
	public HandlerSimplify(final Calculator c) {
		super(c);
	}

	/* (non-Javadoc)
	 * @see polynomialCalculation.Handler#doCmd(java.lang.String)
	 */
	@Override
	public void doCmd(final String cmd) {
		c.simplify(cmd.substring(NIAN));
	}

}
