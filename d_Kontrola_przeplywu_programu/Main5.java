
public class Main5 {

	public static void main(String[] args) {
		int resultFor = 0;
		int resultWhile = 0;
		for(int i=1; i<11; i++){
			resultFor = resultFor + i;
		}
		int j =0;
		while(j++<10){
			resultWhile = resultWhile + j;
		}
		System.out.println(resultFor);
		System.out.println(resultWhile);
	}

}
