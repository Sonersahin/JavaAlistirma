package mukemmelSayi;

public class Main {

	public static void main(String[] args) {
		int number = 27;
		int toplam = 0;
		
		for (int i = 1 ; i<number;i++) {
			if(number %i ==0) {
				toplam = toplam +i;
			}
		}
		
		if (toplam == number) {
			System.out.println("Mükemmel sayıdır!!");
		}else {
			System.out.println("Mükemmel sayı değildir!!!!!!!!");
		}
	}

}
