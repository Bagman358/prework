
public class Main8 {

	public static void main(String[] args) {
		int black = 16;
		int white = 15;
		boolean blackOrWhite = black < white;
		boolean good = true;
		boolean bad = false;
		boolean goodOrBad = good || bad;
		boolean comparison = blackOrWhite && goodOrBad;
		System.out.println(blackOrWhite); 	//false, bo 16 nie jest mniejsze od 15
		System.out.println(goodOrBad);		//true, bo przy || tylko 1 wartość musi być true, aby wyszło true
		System.out.println(comparison);		//false, bo przy && obydwie wartości muszą być true, aby wyszło true
	}

}
