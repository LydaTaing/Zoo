/**
 * @author tainglyda
 * CSC 143
 * April 17, 2018
 * 
 * Zoo is not inherit from Animal.
 * It has Zoo a single attribute called cage which stores an Animal.
 * It has Zoo methods timePasses, allTalk, and feedAll. 
 *
 */
public class Zoo {
	private Animal cage1;
	private Animal cage2;
	private Animal cage3;	
	
	/**
	 * @param cage1
	 * @param cage2
	 * @param cage3
	 */
	public Zoo(Animal cage1, Animal cage2, Animal cage3) {
		this.cage1 = cage1;
		this.cage2 = cage2;
		this.cage3 = cage3;
	}

	// Print the type of animals.
	public String toString () {
		String output="";
		System.out.println("The zoo contains ");
		if (cage1!= null) {
			output = cage1.toString();
		}if (cage2!= null) {
			output = output +"\n"+(cage2.toString());
		}if (cage3!= null) {
			output = output +"\n"+(cage3.toString());	
		}
		
		return output;
	}
	public void timePasses() {
		cage1.timePasses();
		cage2.timePasses();
		cage3.timePasses();
	}
	
	public void feedAll() {
		cage1.feed();
		cage2.feed();
		cage3.feed();
		
	}
	public void Alltalk() {
		cage1.talk();
		cage2.talk();
		cage3.talk();
	}
	
	
	
	

}
