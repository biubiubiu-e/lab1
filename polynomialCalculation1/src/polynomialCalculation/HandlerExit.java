package polynomialCalculation;

/**
 * @author Administrator
 *
 */
public class HandlerExit extends Handler {

	/**
	 * @param c
	 */
	public HandlerExit(final Calculator c) {
		super(c);
	}

	/* (non-Javadoc)
	 * @see polynomialCalculation.Handler#isExit()
	 */
	@Override
	public boolean isExit() 
	{
		return true ;	
	}
	
}
