package homework3;
import java.util.Scanner;

public class kelimerinTersi {

	public static void main(String[] args) {
		 String kelime, tersKelime = "";
		    Scanner input = new Scanner(System.in);

		    System.out.println("Ters çevirilecek kelimeyi girin");
		    kelime = input.nextLine();

		    int length = kelime.length();

		    for (int i = length - 1 ; i >= 0 ; i--)
		      tersKelime = tersKelime + kelime.charAt(i);

		    System.out.println("Stringin tersi: " + tersKelime);
		    
		    if(tersKelime.equals(kelime)) {
	            System.out.println("Girilen kelime Palindrom bir kelimedir.");
	        }
	        else {
	            System.out.println("Girdiginiz kelime Palindrom bir kelime degildir.");
	        }

	}

}
