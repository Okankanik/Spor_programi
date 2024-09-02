package SporProgramı;

import java.util.Scanner;

public class Turkish {

	 static String[] Üyeler = new String[100]; 
	 static int üyeler = 0;
	 
	 static double method(double a, double b) {    	
		    return a - b;
		}
	 ///////////////////////////////////////////////////////////////////////
	 static class OdemeTipi {
	        void odemeYap(int tutar) {
	            System.out.println("Ödeme yapıldı. Tutar: " + tutar + " TL");
	        }
	    }
	    
	    static class NakitOdeme extends OdemeTipi {
	        @Override
	        void odemeYap(int tutar) {
	            System.out.println("Nakit ödeme yapıldı. Tutar: " + tutar + " TL");   
	        }
	    }
	    
	    static class KrediKartiOdeme extends OdemeTipi {
	        @Override
	        void odemeYap(int tutar) {
	            System.out.println("Kredi kartı ile ödeme yapıldı. Tutar: " + tutar + " TL");
	        }
	    }
	/////////////////////////////////////////////////////////////////////////// 
	 public static void start()
	 {
		 Scanner input = new Scanner(System.in);
		 Ucret al = new Ucret();
			int toplamtutar = 0;
			boolean devam = true;
			
			System.out.println("***VücutGeliştirme Merkezi programına hosgeldiniz***");
			System.out.println(" ");
			System.out.println("Lutfen isminizi giriniz :");
			String name = input.nextLine(); 
			Üyeler[üyeler++] = name;
			
			while(devam) {
			 System.out.println("*   1. Uyelik al         *");
			 System.out.println("*   2. Uyelik sat        *");
			 System.out.println("*   3. Ödeme yap         *");
			 System.out.println("*   4. cikis             *");
			 int secim = input.nextInt();
			 switch(secim)
			 {
			 case 1:
			        System.out.println("* Uyelik seciniz = *");
			        Programlar.Üyelik();
			        int uyelik = input.nextInt();

			        if (uyelik == 1) {
			            System.out.println("* 3 Aylik üyelik sectiniz *");
			            System.out.println("ücret =" + al.getUcAylik());
			            System.out.println(" ");
			            toplamtutar+= al.getUcAylik();
			            
			        }
			        if (uyelik == 2) {
			            System.out.println("* 6 Aylik üyelik sectiniz *");
			            System.out.println("ücret =" + al.getAltiAylik());
			            System.out.println(" ");
			            toplamtutar+= al.getAltiAylik();
					 }

			        if (uyelik == 3) {
			            System.out.println("* 9 Aylik üyelik sectiniz *");
			            System.out.println("ücret =" + al.getAltiAylik());
			            System.out.println(" ");
			            toplamtutar+= al.getAltiAylik();
					 }

			        if (uyelik == 4) {
			            System.out.println("* Yillik üyelik sectiniz *");
			            System.out.println("ücret =" + al.getDokuzAylik());
			            System.out.println(" ");
			            toplamtutar+= al.getDokuzAylik();
					 }
			        break;
			 case 2:
			        System.out.println("* Uyelik sat * = ");
			        System.out.println(" üyelik giriniz = ");
			        Programlar.Üyelik();
			        int sat = input.nextInt();
			        if(sat == 1) {
				        System.out.println("Ucret =" + al.getUcAylik());
				        System.out.println("hesabınıza trenasfer islemi yapılmıstır... ");
			        }if(sat == 2) {
				        System.out.println("Ucret =" + al.getAltiAylik());
				        System.out.println("hesabınıza trenasfer islemi yapılmıstır... ");
			        } if(sat == 3) {
				        System.out.println("Ucret =" + al.getDokuzAylik());
				        System.out.println("hesabınıza trenasfer islemi yapılmıstır... ");
			        } if(sat == 4) {
				        System.out.println("Ucret =" + al.getYillik());
				        System.out.println("hesabınıza trenasfer islemi yapılmıstır... ");
			        }
				 break;
			 case 3:
				    System.out.println("*** *** *** *** *** *** *** ");
				    System.out.println("Alışverişleriniz tamamlandı.");
				    System.out.println("Toplam tutar: " + toplamtutar + " TL");
				             
				    while (true) {
				        System.out.println("Ödeme tutarı giriniz = ");
				        int ödeme = input.nextInt();
				        
				        if (ödeme < toplamtutar) {
				            System.out.println("Ödeme tutarı toplam tutardan küçük olamaz. Tekrar giriniz.");
				            continue; 
				        }
				             
				        System.out.println("Ödeme tipini seçiniz: ");
				        System.out.println("1. Nakit");
				        System.out.println("2. Kredi Kartı");
				        int odemeSecimi = input.nextInt();
				             
				        OdemeTipi odemeTipi;
				        if (odemeSecimi == 1) {
				            odemeTipi = new NakitOdeme();
				        } else if (odemeSecimi == 2) {
				            odemeTipi = new KrediKartiOdeme();
				        } else {
				            System.out.println("Geçersiz ödeme tipi seçildi.");
				            return;
				        }
				        
				        odemeTipi.odemeYap(ödeme);
				        break; 
				    }
				    break; 
			 case 4:
	             devam = false; 
	             System.out.println("Geldiginiz icin tesekkurler <3 ");
				 System.exit(0);
			 default:
		            System.out.println("Geçersiz seçim, lütfen tekrar deneyin.");

				}
			 }
	 }
}



