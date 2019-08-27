
public class Main3 {

	public static void main(String[] args) {
		short nr1 = 5;
		double nr2 = 3.1415;
		double result = 0; //result powinien mieć typ double, żeby nie utracić cyfr po przecinku (lub analogicznie float, gdyby nr2 była zmienną typu float)

		result = nr1 + nr2;
		System.out.println(result);
	}

}
