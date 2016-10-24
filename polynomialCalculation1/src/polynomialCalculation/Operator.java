package polynomialCalculation;

import java.util.ArrayList;

/**
 * @author Administrator
 *
 */
public class Operator extends node {
	
	/**
	 * 
	 */
	private char ch;
	/**
	 * 
	 */
	public ArrayList<node> son = new ArrayList<node>();
	
	/**
	 * @param ch
	 */
	public Operator(final char ch) { 
	    this.ch = ch ; 
	    }
	
	/**
	 * @param ch
	 */
	public final void set(final char ch) { 
	    this.ch = ch ; }
	/**
	 * @return ch
	 */
	public char getContent() { 
	    return ch; }
	/**
	 * @param n
	 */
	public void addSon(final node n) { 
	    son.add(n); }
	
	/* (non-Javadoc)
	 * @see polynomialCalculation.node#get()
	 */
	@Override
	public char[] get() {
		char[] ch = new char[1];
		ch[0] = this.ch ;
		return ch ;
	}

	/* (non-Javadoc)
	 * @see polynomialCalculation.node#getLeft()
	 */
	@Override
	public node getLeft() { 
	    return left; }

	/* (non-Javadoc)
	 * @see polynomialCalculation.node#getRight()
	 */
	@Override
	public node getRight() { 
	    return right; }

}
