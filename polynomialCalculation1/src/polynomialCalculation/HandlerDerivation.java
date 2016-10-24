package polynomialCalculation;

/**
 * @author Administrator
 *
 */
public class HandlerDerivation extends Handler {
    /**
     * 
     */
    public static final int FOUR = 4;
	/**
	 * @param c
	 */
	public HandlerDerivation(final Calculator c) {
		super(c);
	}

	/* (non-Javadoc)
	 * @see polynomialCalculation.Handler#doCmd(java.lang.String)
	 */
	@Override
	public void doCmd(final String cmd) {
		c.derivation(cmd.substring(FOUR));
	}

}
