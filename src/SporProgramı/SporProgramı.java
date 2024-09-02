package SporProgramı;
import java.util.Scanner;


public class SporProgramı {
	
	public static void main(String[] args) {
			
		Scanner input = new Scanner(System.in);
		
			System.out.println("");
			System.out.println("Lütfen dil seçiniz : "
					+ "please language select : "
					+ "Turkish (1) "
					+ "English (2)");
			int Dilsec = input.nextInt();
			
			switch(Dilsec) {
			
			case 1:
				Turkish.start();
			case 2:
				English.start();
			}		
	}
}
