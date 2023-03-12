package homework3;
import java.util.Scanner; 

public class SayiTahmini {
	public static void main(String [] args) {
		
		int randomSayi = 1+(int)(Math.random()* 100);
		System.out.println("Random sayı = "+ randomSayi);
		
		Scanner input =new Scanner(System.in);
		int tahminiSayi = 0;
		int sayac = 0;
			
		do {
			System.out.println("Random sayıyı tahmin ediniz.");
			tahminiSayi= input.nextInt();
			
			if(tahminiSayi>=(randomSayi-5)  && tahminiSayi<=(randomSayi+5) ) {
				System.out.println("Random sayıya çok yaklaştınız.Tekrar deneyin.");
				
			}
			else {
				System.out.println("Random sayıya çok uzaklaştınız.Tekrar deneyiniz.");
			}
			sayac++;
			
		}while( tahminiSayi != randomSayi);
		
		System.out.println("Tebrikler , " + sayac+ " .denemede sayıyı buldunuz.");
		
		
		
		
		
		
		
		
	}

}
