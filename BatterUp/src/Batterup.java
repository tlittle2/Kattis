import java.util.Scanner;

public class Batterup {

	public Batterup() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in= new Scanner(System.in);
		 
		
		int numberofABs= in.nextInt();
		int n= 0;
		double total= 0;
		
		
		for(int i= 0; i <numberofABs; i++) {
			int runningTotal= in.nextInt();
			if(runningTotal < 0) {
				
			}else {
				n++;
				total+=runningTotal;
			}
		}
		System.out.println(total/n);

	}
}
