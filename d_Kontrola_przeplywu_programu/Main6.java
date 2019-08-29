

public class Main6 {

	public static void main(String[] args) {
		int n = 101;
		for(int i=0; i<=n; i++){
			int x = i%2;
			if(x == 1){
			System.out.println(i + " - nieparzysta");
			}
			else{
			System.out.println(i + " - parzysta");
			}
		}
		int j = 0;
		while(j<=n){
			int y = j%2;
			if(y == 1){
			System.out.println(j + " - nieparzysta");
			}else{
			System.out.println(j + " - parzysta");
			}
			j++;
		}
	}

}
