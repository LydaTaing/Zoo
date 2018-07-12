/**
 * @author tainglyda
 * CSC 143
 * April 17, 2018
 * 
 * Lion is a subclass of Animal.
 * @param <implement>
 *
 */
public class Lion extends Animal {

	public Lion() {
		super();
	}
	@Override
	public void talk() {
		if(super.getHunger()>=1) {
			System.out.println( "Roar!");
		}else {
			System.out.println( "The Lion quietly chews.");
		}
	}
	
	/**
	 * Express how hungry animal is when calling timePasses.
	 */
	public void timePasses() {		
		this.hungry++;
		
		if (super.getHunger()>=3) {
			System.out.println("The Lion paces hungrily");
	}
	  
	}
	/**
	 * return hunger to zero.
	 */
	public int feed() {
		System.out.println( "The lion starts pacing.");
		return (this.hungry = 0);
	}
	
	/**
	 * return String lion, type of animal.
	 */
	public String toString() {
		return "Lion";
	}
}
