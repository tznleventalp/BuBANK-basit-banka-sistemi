import java.util.Scanner;

public class mainClass{
	
	

	public static void main(String[] args) {
		String sys_kul_adi = "levent" ;
		String parola = "levent";
		Scanner scan= new Scanner (System.in);
		int is=0;
		giris();
			 //ATM ba�lang��
		
		int hb=5000;
		System.out.println("Kullan�c� ad�:");
		String kullan�c�_ad� = scan.nextLine();
		System.out.println("Parola:");
		String kul_parola = scan.nextLine();


		 if (!(sys_kul_adi.equals(kullan�c�_ad�)) && !(parola.equals(kul_parola)))
		 {
			 System.out.println("hatal� giri�");
			 
		 }
		 else if ((sys_kul_adi.equals(kullan�c�_ad�)) && !(parola.equals(kul_parola)) ){
			 System.out.println("parola hatal� tekrar deneyin");
		 }
		 else if (!(sys_kul_adi.equals(kullan�c�_ad�)) && (parola.equals(kul_parola)) ){
			 System.out.println("kullan�c� ad� hatal� tekrar deneyin");
			
		 }
		 else if ((sys_kul_adi.equals(kullan�c�_ad�)) && (parola.equals(kul_parola)) ){
			 System.out.println("Giri� ba�ar�l� kutlar�m...");
			
			 
		do {
			 System.out.println("BuBANK' a Ho�geldiniz"+ "\n"+ "Bu sistemdenden para �ekebilir,para yat�rabilir,baz� �demeler yapabilir veya kay�tl� abonelerinize para g�nderebilirsiniz:)");
			 System.out.println("1--Hesap Gakiyenizi G�r�n--"+"\n"+"2--Para �ekme--"+"\n"+"3--Para Yat�rma--"+"\n"+"4--Para G�nderme--"+"\n5--�deme ��lemleri--"+"\n6--�ifre de�i�tirme\n"+"0--G�VENL� �IKI�--");
			
			 
			 byte atm;
			  atm= scan.nextByte();	
			
			 switch(atm) {
			 
			 case 1:
				 System.out.println("-----HESAP BAK�YES� SORGULAMA-----"+"\n"+"Varl�klar�m: **"+hb+"**");
				
				 break;
			 case 2:
				 System.out.println("-----PARA �EKME-----"+"\n"+"ne kadar para �ekmek istiyorsunuz");
					int para_cek = scan.nextInt();
			
				 if(hb==0) 
					 System.out.println("Hesab�n�zda yeterli bakiye yoktur" );
				 
				 else
				if(para_cek<=hb){
					 
					 hb-=para_cek; 
				 System.out.println(para_cek+"tl hesab�n�zdan �ekilmi�tir."+"\n"+"Kalan Bakiyeniz"+hb);
				 }
				 else 
					 System.out.println("Hesab�n�zda yeterli bakiye yoktur ");{
				hb=hb;
				}
				
					
				 
				 break;
			 case 3:
				 System.out.println("-----PARA YATIRMA-----"+"\n"+"ne kadar para yat�rmak istiyorsunuz");
				 int para_yatir= scan.nextInt();
				 hb+=para_yatir;
				 System.out.println(para_yatir+"tl hesab�n�za aktar�lm��t�r."+"\n"+"Kalan Bakiyeniz:"+hb);
			
				 break;
			 case 4:
				 System.out.println("-----PARA TRANSFER�(Yanl�zca Kay�tl� Ki�iler)-----"+"\n"+"�nce miktar� yaz�n�z sonra Para g�dermek isdedi�inz ki�iyi se�in(1-9)");
				 
				 int pgon1= scan.nextInt();
				 
				 System.out.println("1-ugur"+"\n"+"2-Engin Kutlu"+"\n"+"3-Sabri T�z�n"+"\n"+"4-K�bra T�z�n"+"\n"+"5-Erg�l T�z�n"+"\n"+"6-Muammer T�z�n"+"\n"+"7-Mehmet T�z�n"+"\n"+"8-Enes T�z�n");
				 int parag1= scan.nextInt();
				 if (pgon1<=hb){
					 
				 switch(parag1) {
				 case 1:
					 System.out.println("u�ur odaba�� ki�isine "+pgon1+"tl g�nderdiniz");
					 break;
				 case 2:
					 System.out.println("Engin Kutlu ki�isine "+pgon1+"tl g�nderdiniz");
					 break;
				 case 3:
					 System.out.println("Sabri T�z�n ki�isine "+pgon1+"tl g�nderdiniz");
					 break;
				 case 4:
					 System.out.println("K�bra T�z�n ki�isine "+pgon1+"tl g�nderdiniz");
					 break;
				 case 5:
					 System.out.println("Erg�l T�z�n ki�isine "+pgon1+"tl g�nderdiniz");
					 break;
				 case 6:
					 System.out.println("Muammer T�z�n ki�isine "+pgon1+"tl g�nderdiniz");
					 break;
				 case 7:
					 System.out.println("Mehmet T�z�n ki�isine "+pgon1+"tl g�nderdiniz");
					 break;
				 case 8:
					 System.out.println("Enes T�z�n ki�isine "+pgon1+"tl g�nderdiniz");
					 break;
					 default :
						 System.out.println("ba�kas�na yollayamazs�n");
				
				
				 }
			hb-=pgon1;
			 System.out.println("Kalan Bakiyeniz: "+hb);
			 break;}
			 else {
				 System.out.println("yetersiz bakiye");
				 break;
			 }	
			 case 5:
				 System.out.println("Ne �demesi yapmak istiyorsunuz?");
				 System.out.println("1: E��T�M �DEMELER� \n2:KONUT K�RA �DEMELER�\n3:D��ER �DEMELER");
				 int oi,eo,kko,dod;
				 oi=scan.nextInt();
				 switch (oi)
			 	 {
				 case 1:
					 System.out.println(" E��T�M �DEMELER�");
					 System.out.println("1:�SYM s�nav �demeleri\n2:KYK �demeleri");
					 int eo2=scan.nextInt();
					
					 switch (eo2)
					 {
					 case 1:
						if(eo2==1 && hb>100)
						{hb=hb-100;
						System.out.println("100 tl �denmi�tir");
						} 
						else { System.out.println("Yetersiz Bakiye fakir herif");
						
						}
					break;
					 
					 case 2:
						 hb=hb-168;
						 System.out.println("168 tl �denmi�tir");
						 break;
				default :
					System.out.println("yak�nda");
					break;
					 
					 }
					 break;
				 case 2:
					 System.out.println("KONUT K�RA �DEMELER�");
					 System.out.println("!!K�RA G�NDER�LECEK K�MSE YOK!!");
					 break;
				 case 3:
					 System.out.println("D��ER �DEMELER");
				 
				 break;
				 }
				
			 
			 case 6: 
				 System.out.println("---�ifre De�i�tirme---");
				 
				 System.out.println("eski �ifrenizi giriniz");
				 
				 break;
				 
			 case 0:
				 is++;
				 System.out.println("BA�ARIYLA �IKI� YAPILMI�TIR");
				 System.out.println("G�LE G�LE");
				 break;
				 
				 
			 
			 
			 default :
					 System.out.println("�ok Yak�nda...");
					 break;
			 }
		}while  (is==0);
			
		 }
			
		
		 
		 }

	
static int para_Cek(int hb) {
	Scanner scan= new Scanner (System.in);
	int para_cek = scan.nextInt();
	 if (para_cek<=hb){
		 
		 hb-=para_cek; 
	 System.out.println(para_cek+"tl hesab�n�zdan �ekilmi�tir."+"\n"+"Kalan Bakiyeniz"+hb);
	 }
	 else 
		 System.out.println("yetersiz bakiye");{
	hb=hb;
		 }
		 return hb;
}
static int paraGonder(int hb) {
	Scanner scan= new Scanner (System.in);
return hb;
	
}
static void giris() {	
}

static int sifreDegis(int is ) {
	
	return is++;
}

}



