
public class Main5 {

	public static void main(String[] args) {
		int a = 1;
		int b;
		System.out.println(++a); //podniesienie wartości zmiennej a o 1 i wypisanie jej - wypisany rezultat 2
		System.out.println(a++); //wypisanie zmiennej a podniesienie jej wartości o 1 - wypisany rezultat 2
		System.out.println(a); //wypisanie zmiennej a - wypisany rezultat 3
		b=a++; //przypisanie wartości zmiennej a do zmiennej b i podniesienie wartości zmiennej a o 1
		System.out.println(b); //wypisanie zmiennej b - wypisany rezultat 3
		b=++a; //podniesienie wartości zmiennej a o 1 i przypisanie jej do zmiennej b
		System.out.println(++a); //podniesienie wartości zmiennej a o 1 i wypisanie jej - wypisany rezultat 6
	}

}
