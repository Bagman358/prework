
public class Main7 {

	public static void main(String[] args) {
		int nr1 = 7;
		int nr2 = 4;
		int result = nr1 + nr2;
		System.out.println(result);
		nr1 = 10;
		result = nr1 + nr2;
		System.out.println(result);
		/*
		Wypisanie 2 różnych rezultatów działań wynika z kolejności działania programu:
		1. najpierw zadeklarowaliśmy wartości zmiennych nr1 i nr2
		2. zsumowaliśmy je
		3. wypisaliśmy wynik
		4. dopiero teraz zmieniliśmy wartość zmiennej nr1
		5. zsumowaliśmy zmienne już po zmiane wartości zmiennej nr1
		6. wypisaliśmy nowy, zaktualizowany wynik
		*/
	}

}
