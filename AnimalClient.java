
public class AnimalClient {

	public static void main(String[] args) {
		Animal lena = new Lion();
		Animal Zena = new Zebra();
		Animal bena = new Bunny();
		
		Zoo cage = new Zoo(lena, Zena, bena);
		
		
		for (int i =0; i< 4; i++) {
			cage.timePasses();
		}
		lena.feed();
		cage.Alltalk();
		
		System.out.println(cage);
		
		
		
	
	}

}
