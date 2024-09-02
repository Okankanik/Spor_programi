package SporProgramı;

import java.util.Scanner;

public class English {
	
	 static String[] Üyeler = new String[100]; 
	 static int üyeler = 0;
	 
	 static double method(double a, double b) {    	
		    return a - b;
		}
	 ///////////////////////////////////////////////////////////////////////
	 static class OdemeTipi {
	        void odemeYap(int tutar) {
	            System.out.println("Payment completed. Amount " + tutar + " TL");
	        }
	    }
	    
	    static class NakitOdeme extends OdemeTipi {
	        @Override
	        void odemeYap(int tutar) {
	            System.out.println("Cash payment made. Amount: " + tutar + " TL");   
	        }
	    }
	    
	    static class KrediKartiOdeme extends OdemeTipi {
	        @Override
	        void odemeYap(int tutar) {
	            System.out.println("Payment made with credit card. Amount: " + tutar + " TL");
	        }
	    }
	/////////////////////////////////////////////////////////////////////////// 
	 public static void start()
	 {
		 Scanner input = new Scanner(System.in);
		 Ucret al = new Ucret();
			int toplamtutar = 0;
			boolean devam = true;
			
			System.out.println("***Welcome to Bodybuilding Center Program***");
			System.out.println(" ");
			System.out.println("Please enter your name:");
			String name = input.nextLine(); 
			Üyeler[üyeler++] = name;
			
			while(devam) {
			System.out.println("*   1. Buy Membership       *");
		    System.out.println("*   2. Sell Membership      *");
			System.out.println("*   3. Make Payment         *");
			System.out.println("*   4. Exit                 *");
			 int secim = input.nextInt();
			 switch(secim)
			 {
			 case 1:
			        System.out.println("* Select Membership =");
			        Programlar.Üyelik();
			        int uyelik = input.nextInt();

			        if (uyelik == 1) {
			        	System.out.println("* You have selected the 3-Month Membership *");
			        	System.out.println("Price =" + al.getUcAylik());
			            System.out.println(" ");
			            toplamtutar+= al.getUcAylik();
			            
			        }
			        if (uyelik == 2) {
			        	System.out.println("* You have selected the 6-Month Membership *");
			        	System.out.println("Price =" + al.getAltiAylik());
			            System.out.println(" ");
			            toplamtutar+= al.getAltiAylik();
					 }

			        if (uyelik == 3) {
			        	System.out.println("* You have selected the 9-Month Membership *");
			        	System.out.println("Price =" + al.getAltiAylik());
			            System.out.println(" ");
			            toplamtutar+= al.getAltiAylik();
					 }

			        if (uyelik == 4) {
			        	System.out.println("* You have selected the Annual Membership *");
			        	System.out.println("Price =" + al.getDokuzAylik());
			            System.out.println(" ");
			            toplamtutar+= al.getDokuzAylik();
					 }
			        break;
			 case 2:
				 System.out.println("* Membership sold *");
				 System.out.println("Please enter the membership type = ");
				 Programlar.Üyelik();
				 int membershipType = input.nextInt();
				 if (membershipType == 1) {
				     System.out.println("Price =" + al.getUcAylik());
				     System.out.println("Transfer has been made to your account... ");
				 } else if (membershipType == 2) {
				     System.out.println("Price =" + al.getAltiAylik());
				     System.out.println("Transfer has been made to your account... ");
				 } else if (membershipType == 3) {
				     System.out.println("Price =" + al.getDokuzAylik());
				     System.out.println("Transfer has been made to your account... ");
				 } else if (membershipType == 4) {
				     System.out.println("Price =" + al.getYillik());
				     System.out.println("Transfer has been made to your account... ");
				 }
				 break;
			 case 3:
				 System.out.println("*** *** *** *** *** *** *** ");
				 System.out.println("Your shopping is completed.");
				 System.out.println("Total amount: " + toplamtutar + " TL");
				             
				    while (true) {
				    	System.out.println("Enter the payment amount = ");
				    	int ödeme = input.nextInt();
				        
				        if (ödeme < toplamtutar) {
				        	System.out.println("Payment amount cannot be less than the total amount. Please enter again.");
				        	continue; 
				        }
				             
				        System.out.println("Select the payment method: ");
				        System.out.println("1. Cash");
				        System.out.println("2. Credit Card");
				        int odemeSecimi = input.nextInt();
				             
				        OdemeTipi odemeTipi;
				        if (odemeSecimi == 1) {
				            odemeTipi = new NakitOdeme();
				        } else if (odemeSecimi == 2) {
				            odemeTipi = new KrediKartiOdeme();
				        } else {
				        	System.out.println("Invalid payment method selected.");
				        	return;
				        }
				        
				        odemeTipi.odemeYap(ödeme);
				        break; 
				    }
				    break; 
			 case 4:
	             devam = false; 
	             System.out.println("Thank you for coming <3 ");
				 System.exit(0);
			 default:
				 System.out.println("Invalid selection, please try again.");
				}
			 }
	 }
}
	 
	 
	 
	 
	 
	 
