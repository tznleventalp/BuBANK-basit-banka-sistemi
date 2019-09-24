import java.util.Scanner;

public class mainClass{
	
	

	public static void main(String[] args) {
		String sys_kul_adi = "levent" ;
		String parola = "levent";
		Scanner scan= new Scanner (System.in);
		int is=0;
		giris();
			 //ATM baþlangýç
		
		int hb=5000;
		System.out.println("Kullanýcý adý:");
		String kullanýcý_adý = scan.nextLine();
		System.out.println("Parola:");
		String kul_parola = scan.nextLine();


		 if (!(sys_kul_adi.equals(kullanýcý_adý)) && !(parola.equals(kul_parola)))
		 {
			 System.out.println("hatalý giriþ");
			 
		 }
		 else if ((sys_kul_adi.equals(kullanýcý_adý)) && !(parola.equals(kul_parola)) ){
			 System.out.println("parola hatalý tekrar deneyin");
		 }
		 else if (!(sys_kul_adi.equals(kullanýcý_adý)) && (parola.equals(kul_parola)) ){
			 System.out.println("kullanýcý adý hatalý tekrar deneyin");
			
		 }
		 else if ((sys_kul_adi.equals(kullanýcý_adý)) && (parola.equals(kul_parola)) ){
			 System.out.println("Giriþ baþarýlý kutlarým...");
			
			 
		do {
			 System.out.println("BuBANK' a Hoþgeldiniz"+ "\n"+ "Bu sistemdenden para çekebilir,para yatýrabilir,bazý ödemeler yapabilir veya kayýtlý abonelerinize para gönderebilirsiniz:)");
			 System.out.println("1--Hesap Gakiyenizi Görün--"+"\n"+"2--Para Çekme--"+"\n"+"3--Para Yatýrma--"+"\n"+"4--Para Gönderme--"+"\n5--Ödeme Ýþlemleri--"+"\n6--Þifre deðiþtirme\n"+"0--GÜVENLÝ ÇIKIÞ--");
			
			 
			 byte atm;
			  atm= scan.nextByte();	
			
			 switch(atm) {
			 
			 case 1:
				 System.out.println("-----HESAP BAKÝYESÝ SORGULAMA-----"+"\n"+"Varlýklarým: **"+hb+"**");
				
				 break;
			 case 2:
				 System.out.println("-----PARA ÇEKME-----"+"\n"+"ne kadar para çekmek istiyorsunuz");
					int para_cek = scan.nextInt();
			
				 if(hb==0) 
					 System.out.println("Hesabýnýzda yeterli bakiye yoktur" );
				 
				 else
				if(para_cek<=hb){
					 
					 hb-=para_cek; 
				 System.out.println(para_cek+"tl hesabýnýzdan çekilmiþtir."+"\n"+"Kalan Bakiyeniz"+hb);
				 }
				 else 
					 System.out.println("Hesabýnýzda yeterli bakiye yoktur ");{
				hb=hb;
				}
				
					
				 
				 break;
			 case 3:
				 System.out.println("-----PARA YATIRMA-----"+"\n"+"ne kadar para yatýrmak istiyorsunuz");
				 int para_yatir= scan.nextInt();
				 hb+=para_yatir;
				 System.out.println(para_yatir+"tl hesabýnýza aktarýlmýþtýr."+"\n"+"Kalan Bakiyeniz:"+hb);
			
				 break;
			 case 4:
				 System.out.println("-----PARA TRANSFERÝ(Yanlýzca Kayýtlý Kiþiler)-----"+"\n"+"Önce miktarý yazýnýz sonra Para gödermek isdediðinz kiþiyi seçin(1-9)");
				 
				 int pgon1= scan.nextInt();
				 
				 System.out.println("1-ugur"+"\n"+"2-Engin Kutlu"+"\n"+"3-Sabri Tüzün"+"\n"+"4-Kübra Tüzün"+"\n"+"5-Ergül Tüzün"+"\n"+"6-Muammer Tüzün"+"\n"+"7-Mehmet Tüzün"+"\n"+"8-Enes Tüzün");
				 int parag1= scan.nextInt();
				 if (pgon1<=hb){
					 
				 switch(parag1) {
				 case 1:
					 System.out.println("uður odabaþý kiþisine "+pgon1+"tl gönderdiniz");
					 break;
				 case 2:
					 System.out.println("Engin Kutlu kiþisine "+pgon1+"tl gönderdiniz");
					 break;
				 case 3:
					 System.out.println("Sabri Tüzün kiþisine "+pgon1+"tl gönderdiniz");
					 break;
				 case 4:
					 System.out.println("Kübra Tüzün kiþisine "+pgon1+"tl gönderdiniz");
					 break;
				 case 5:
					 System.out.println("Ergül Tüzün kiþisine "+pgon1+"tl gönderdiniz");
					 break;
				 case 6:
					 System.out.println("Muammer Tüzün kiþisine "+pgon1+"tl gönderdiniz");
					 break;
				 case 7:
					 System.out.println("Mehmet Tüzün kiþisine "+pgon1+"tl gönderdiniz");
					 break;
				 case 8:
					 System.out.println("Enes Tüzün kiþisine "+pgon1+"tl gönderdiniz");
					 break;
					 default :
						 System.out.println("baþkasýna yollayamazsýn");
				
				
				 }
			hb-=pgon1;
			 System.out.println("Kalan Bakiyeniz: "+hb);
			 break;}
			 else {
				 System.out.println("yetersiz bakiye");
				 break;
			 }	
			 case 5:
				 System.out.println("Ne ödemesi yapmak istiyorsunuz?");
				 System.out.println("1: EÐÝTÝM ÖDEMELERÝ \n2:KONUT KÝRA ÖDEMELERÝ\n3:DÝÐER ÖDEMELER");
				 int oi,eo,kko,dod;
				 oi=scan.nextInt();
				 switch (oi)
			 	 {
				 case 1:
					 System.out.println(" EÐÝTÝM ÖDEMELERÝ");
					 System.out.println("1:ÖSYM sýnav ödemeleri\n2:KYK ödemeleri");
					 int eo2=scan.nextInt();
					
					 switch (eo2)
					 {
					 case 1:
						if(eo2==1 && hb>100)
						{hb=hb-100;
						System.out.println("100 tl ödenmiþtir");
						} 
						else { System.out.println("Yetersiz Bakiye fakir herif");
						
						}
					break;
					 
					 case 2:
						 hb=hb-168;
						 System.out.println("168 tl ödenmiþtir");
						 break;
				default :
					System.out.println("yakýnda");
					break;
					 
					 }
					 break;
				 case 2:
					 System.out.println("KONUT KÝRA ÖDEMELERÝ");
					 System.out.println("!!KÝRA GÖNDERÝLECEK KÝMSE YOK!!");
					 break;
				 case 3:
					 System.out.println("DÝÐER ÖDEMELER");
				 
				 break;
				 }
				
			 
			 case 6: 
				 System.out.println("---Þifre Deðiþtirme---");
				 
				 System.out.println("eski þifrenizi giriniz");
				 
				 break;
				 
			 case 0:
				 is++;
				 System.out.println("BAÞARIYLA ÇIKIÞ YAPILMIÞTIR");
				 System.out.println("GÜLE GÜLE");
				 break;
				 
				 
			 
			 
			 default :
					 System.out.println("Çok Yakýnda...");
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
	 System.out.println(para_cek+"tl hesabýnýzdan çekilmiþtir."+"\n"+"Kalan Bakiyeniz"+hb);
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



