package sayiBulma;

public class Main {

	public static void main(String[] args) {
		int[] sayilar = {1,2,4,6,7,8,5};
		int aranacak = 11;
		boolean varMi =false;
		
		for (int sayi : sayilar) {
			if (sayi==aranacak) {
				varMi = true;
				break;
			}
		}
		
		if (varMi) {
			System.out.println("Sayı Mevcuttur!");
		}else {
			System.out.println("Sayi mevcut değildir!!!!!!");
		}

	}

}
