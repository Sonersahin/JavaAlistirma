package methods2;

public class Main {

	public static void main(String[] args) {
		String mesaj ="Bugün Hava Çok Güzel.";
		String yeniMesaj = sehir();
		System.out.println(yeniMesaj + mesaj);
		int toplams = topla(5,8);
		System.out.println(toplams);
		int toplam = topla2(1,2,34,5);
		System.out.println(toplam);
		
	}
	public static void ekle() {
		System.out.println("Eklendi");
	}
	
	public static void sil() {
		System.out.println("Silindi");
	}
	
	public static void guncelle() {
		System.out.println("Güncellendi");
	}
	
	public static int topla(int sayi1,int sayi2) {
		return sayi1 +sayi2;
	}
	public static int topla2(int... sayilar) {
		int toplam=0;
		for(int sayi:sayilar) {
			toplam+=sayi;
		}
		
		return toplam;
	}
	
	public static String sehir() {
		return "Ankara";
	}

}
