/**
 * @author tainglyda
 * CSC 143
 * April 17, 2018
 * 
 * Bunny is a subclass of Animal.
 * @param <implement>
 *
 */

public class Bunny extends Animal{
	public Bunny() {
		super();
	}
	
	public void talk() {
		if(super.getHunger()>=1) {
			System.out.println( "Roar!");
		}else {
			System.out.println( "The Bunny quietly chews..");
		}
		
	}
	
	/**
	 * Express how hungry animal is when calling timePasses.
	 */
	public void timePasses() {		
		this.hungry++;
		
		if (super.getHunger()>=3) {
			System.out.println("The Bunny paces hungrily");
		}  
	}
	
	/**
	 * return hunger to zero.
	 */
	public int feed() {
		System.out.println( "The Bunny starts pacing.");
		return (this.hungry = 0);
	}

	/**
	 * return String Bunny, type of animal.
	 */
	public String toString() {
		return "Bunny";
	}

}
