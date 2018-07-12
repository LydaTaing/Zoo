/**
 * @author tainglyda
 * CSC 143
 * April 17, 2018
 * 
 * Animal is a parent class. 
 * It has a single private int attribute hunger to hold how hungry the Animal is.
 * 
 *
 */
public abstract class Animal{
	public int hungry;

	/**
	 * @param hungry
	 */
	public Animal() {
		hungry = 0;
	}

	/**
	 * @return the hungry, the number of hunger animal. 
	 */
	public int getHunger() {
		return hungry;
	}
	
	abstract public void talk();
	
	/** 
	 * timePasses call to add up hunger number. 
	 */
	public void timePasses () {
		this.hungry++;
		
	}
	/**
	 * 
	 * @return hungry to zero 
	 */
	public int feed() {
		return (this.hungry = 0);
	}
	
	/*
	 * (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	public String toString() {
		return "Animal";
	}
}
