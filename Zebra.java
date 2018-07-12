/**
 * @author tainglyda
 * CSC 143
 * April 17, 2018
 * 
 * Zebra is a subclass of Animal.
 * Add talk, and override timePasses. 
 * @param <implement>
 *
 */
public class Zebra extends Animal  {
	public Zebra() {
		super();
	}

	@Override
	public void talk() {
		if(super.getHunger()>=1) {
			System.out.println( "Roar!");
		}else {
			System.out.println( "The Zebra quietly chews..");
		}
	}
	
	/**
	 * Express how hungry animal is when calling timePasses.
	 */
	public void timePasses() {		
		this.hungry++;
		
		if (super.getHunger()>=3) {
			System.out.println("The Zebra paces hungrily");
		}  
	}
	
	/**
	 * return hunger to zero.
	 */
	public int feed() {
		System.out.println( "The Zebra starts pacing.");
		return (this.hungry = 0);
	}

	/**
	 * return string Zebra, type of animal.
	 */
	public String toString() {
		return "Zebra";
	}
		
}
