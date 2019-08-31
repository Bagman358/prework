
import java.util.Random;

public class Main7 {

	public static void main(String[] args) {
		Random generator = new Random();
	//	generator.nextInt(21);
		int randNumbers[]= new int[100];
		for (int i = 0; i <100; i++){
			randNumbers[i] = generator.nextInt(21);
			if (i == randNumbers.length-1){
				System.out.println(randNumbers[i]);
			}else{
				System.out.print(randNumbers[i] + ", ");
			}
		}
		int sum =0;
		for (int j = 0; j < randNumbers.length; j++){
			sum += randNumbers[j];
		}
		System.out.println("Suma 100 losowych liczb od 0 do 20 to: " + sum);
	}

}
