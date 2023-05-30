import java.util.Scanner;

public class SinifiGecmeDurumu {

	public static void main(String[] args) {
	
		int mat, fizik, turkce, kimya, muzik;
		int arr [];
		
		Scanner inp = new Scanner(System.in);
		
		System.out.print("Matematik Notunuz :");
		mat = inp.nextInt();
		if(mat < 0 || mat > 100) {
			System.out.println("Hatalı giriş yaptınız! 0 ile 100 aralığında bir sayı giriniz.");
			return;
		}
		
		System.out.print("Fizik Notunuz :");
		fizik = inp.nextInt();
		if(fizik < 0 || fizik > 100) {
			System.out.println("Hatalı giriş yaptınız! 0 ile 100 aralığında bir sayı giriniz.");
			return;
		}
		
		System.out.print("Türkçe Notunuz :");
		turkce = inp.nextInt();
		if(turkce < 0 || turkce > 100) {
			System.out.println("Hatalı giriş yaptınız! 0 ile 100 aralığında bir sayı giriniz.");
			return;
		}
		
		System.out.print("Kimya Notunuz :");
		kimya = inp.nextInt();
		if(kimya < 0 || kimya > 100) {
			System.out.println("Hatalı giriş yaptınız! 0 ile 100 aralığında bir sayı giriniz.");
			return;
		}
		
		System.out.print("Müzik Notunuz :");
		muzik = inp.nextInt();
		if(muzik < 0 || muzik > 100) {
			System.out.println("Hatalı giriş yaptınız! 0 ile 100 aralığında bir sayı giriniz.");
			return;
		}
		
		
		double avarage = (mat + fizik + turkce + kimya + muzik)/5;
		
		if (avarage <= 55) {
			System.out.println("Sınıfı Geçemediniz! " + "Ortalamanız :" + avarage);
		}else {
			System.out.println("Tebrikler! Sınıfı Geçtiniz.");
		}
	}

}
