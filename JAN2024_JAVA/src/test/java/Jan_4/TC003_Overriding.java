package Jan_4;


class Swipemachine{
	void readcard() {
		// Fuctionality to read cards only
		System.out.println("Read card");
	}
}

class Chipcardmachine extends Swipemachine{
	void readcard() {
		//Fuctionality to read chip card only
		System.out.println("Chip Card");
	}
}
public class TC003_Overriding {
	
	public static void main(String[] args) {
		
	Swipemachine sm = new Swipemachine();
	sm.readcard();
	
	Chipcardmachine cm = new Chipcardmachine();
	cm.readcard();
	}
	

}
