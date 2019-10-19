import java.util.Scanner;

public class main {

	public main() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner (System.in);
		
		int statues= in.nextInt();
		int numberofPrinters= 1;
		int numberofStatuesPrinted= 0;
		int days= 0;
		
			while(numberofStatuesPrinted < statues) {
				if((statues-numberofStatuesPrinted) > numberofStatuesPrinted){
					days++;	
					numberofPrinters++;
					
				}else {
					days++;
					numberofStatuesPrinted= numberofStatuesPrinted + numberofPrinters;
				}
				
				
				
				
			}
			System.out.println(days);
			in.close();
		}
		
		

}
