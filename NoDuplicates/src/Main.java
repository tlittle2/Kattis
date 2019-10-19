import java.util.ArrayList;
import java.util.Scanner;
public class Main {

	public Main() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		
		String input= in.nextLine();
		
		boolean b= false; 
		
		
		ArrayList<String>aL1= new ArrayList<String>();
		ArrayList<String>aL2= new ArrayList<String>();
		
		for(String word: input.split(" ")) {
			aL1.add(word);
			aL2.add(word);
		}
		
		for(int i = 0; i<aL1.size(); i++) {
			aL2.remove(aL1.get(i));
			if(aL2.contains(aL1.get(i))) {
				b= true;
			}
			
		}
		
		if(b==true) {
			System.out.println("no");
			
		}else {
			System.out.println("yes");
		}
	}

}
