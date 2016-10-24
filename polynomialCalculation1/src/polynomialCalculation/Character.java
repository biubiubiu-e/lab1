package polynomialCalculation;

/**
 * @author Administrator
 *
 */
public class Character extends Data {

	/**
	 * 
	 */
	private String word;
	/**
	 * 
	 */
	private int index;
	
	/**
	 * @param word
	 */
	public Character(final String word) { 
		this.word = new String(word);
		index = 1;
	}
	/**
	 * @param word
	 */
	public Character(final char[] word) { 
		this.word = new String(word); 
		index = 1;
	}
	
	/**
	 * @return * *
	 */
	public String getContent() { 
	    return word; 
	}
	/**
	 * @return * *
	 */
	public int getIndex() { 
	    return index; }
	
	/**
	 * @param word
	 */
	public void set(final String word) { 
	    this.word = new String(word); }
	/**
	 * @param index
	 */
	public void setIndex(final int index) { 
	    this.index = index; }
	/* (non-Javadoc)
	 * @see polynomialCalculation.node#get()
	 */
	@Override
	public char[] get() { 
	    return word.toCharArray(); } 

}
