public class Main11 {

        public static void main(String[] args) {
            //definicja zmiennej z liczbą rzędów i gwiazdek w wierszu
		int n = 10;
            //tworzymy pętlę która będzie generowała nam WIERSZE
		for (int i = 1; i <= n; i++){               	//zmienna która jest zerowana na początku każdej iteracji, przechowująca gwiazdki z wiersza
			String row1 = "";
                //tworzymy pętlę generującą nam gwiazdki w wierszu
			for (int j = 1; j <= n; j++) {
				if(i>=j){
					row1 += "* ";
				}else{
                                	row1 += j + " ";
                       		}
			}
			System.out.println(row1);
		}
        	for (int k = 1; k <= n; k++) {
			String row2 = "";
			for (int l = n-1; l >= 0; l--){
				if (k<=l+1){
					row2 += "* ";
				}else{
					row2 += n-l + " ";
				}
			}
			System.out.println(row2);
		}
        }

}



