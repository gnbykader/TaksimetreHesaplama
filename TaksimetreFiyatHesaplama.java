import java.util.Scanner;
public class TaksimetreFiyatHesaplama {

	public static void main(String[] args) {
		double KM,KMBasınaTutar = 2.20,OdenecekTutar;
		int TaksimetreAcılısUcreti = 10;
		
		Scanner inp = new Scanner(System.in); 
		
		System.out.print("Gidilen mesafe : ");
		KM = inp.nextDouble();
		OdenecekTutar = (KMBasınaTutar*KM) + TaksimetreAcılısUcreti;
		
		System.out.println("Gidilen mesafe: "+KM);
		
		
		OdenecekTutar = (OdenecekTutar > 20)? OdenecekTutar:20; 
		System.out.println("Odenecek tutar: "+ OdenecekTutar);
		
	 
		
		
		

	}

}
