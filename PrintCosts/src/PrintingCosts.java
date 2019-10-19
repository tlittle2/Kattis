import java.util.Scanner;

public class PrintingCosts {

	public PrintingCosts() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Scanner in= new Scanner(System.in);
		
		
		
	while(in.hasNext()) {	
		String input= in.nextLine();		
		int finalAmount= 0;
		
		for(int i = 0; i < input.length(); i++) {
			switch(input.charAt(i)) {
				case '&': 
					finalAmount+=24;
					break;
				case ',': 
					finalAmount+=7;
					break;
				case '2': 
					finalAmount+=22;
					break;
				case '8': 
					finalAmount+=23;
					break;
				case '>': 
					finalAmount+=10;
					break;
				case 'D': 
					finalAmount+=26;
					break;
				case 'J': 
					finalAmount+=18;
					break;
				case 'P': 
					finalAmount+=23;
					break;
				case 'V': 
					finalAmount+=19;
					break;
				case '\\': 
					finalAmount+=10;
					break;
				case 'b': 
					finalAmount+=25;
					break;
				case 'h': 
					finalAmount+=21;
					break;
				case 'n': 
					finalAmount+=18;
					break;
				case 't': 
					finalAmount+=17;
					break;
				case 'z': 
					finalAmount+=19;
					break;
				case '!': 
					finalAmount+=9;
					break;
				case '\'': 
					finalAmount+=3;
					break;
				case '3': 
					finalAmount+=23;
					break;
				case '9': 
					finalAmount+=26;
					break;
				case '?': 
					finalAmount+=15;
					break;
				case 'E': 
					finalAmount+=26;
					break;
				case 'K': 
					finalAmount+=21;
					break;
				case 'Q': 
					finalAmount+=31;
					break;
				case 'W': 
					finalAmount+=26;
					break;
				case ']': 
					finalAmount+=18;
					break;
				case 'c': 
					finalAmount+=17;
					break;
				case 'i': 
					finalAmount+=15;
					break;
				case 'o': 
					finalAmount+=20;
					break;
				case 'u': 
					finalAmount+=17;
					break;
				case '{': 
					finalAmount+=18;
					break;
				case '"': 
					finalAmount+=6;
					break;
				case '(': 
					finalAmount+=12;
					break;
				case '.': 
					finalAmount+=4;
					break;
				case '4': 
					finalAmount+=21;
					break;
				case ':': 
					finalAmount+=8;
					break;
				case '@': 
					finalAmount+=32;
					break;
				case 'F': 
					finalAmount+=20;
					break;
				case 'L': 
					finalAmount+=16;
					break;
				case 'R': 
					finalAmount+=28;
					break;
				case 'X': 
					finalAmount+=18;
					break;
				case '^': 
					finalAmount+=7;
					break;
				case 'd': 
					finalAmount+=25;
					break;
				case 'j': 
					finalAmount+=20;
					break;
				case 'p': 
					finalAmount+=25;
					break;
				case 'v': 
					finalAmount+=13;
					break;
				case '|': 
					finalAmount+=12;
					break;
				case '#': 
					finalAmount+=24;
					break;
				case ')': 
					finalAmount+=12;
					break;
				case '/': 
					finalAmount+=10;
					break;
				case '5': 
					finalAmount+=27;
					break;
				case ';': 
					finalAmount+=11;
					break;
				case 'A': 
					finalAmount+=24;
					break;
				case 'G': 
					finalAmount+=25;
					break;
				case 'M': 
					finalAmount+=28;
					break;
				case 'S': 
					finalAmount+=25;
					break;
				case 'Y': 
					finalAmount+=14;
					break;
				case '_': 
					finalAmount+=8;
					break;
				case 'e': 
					finalAmount+=23;
					break;
				case 'k': 
					finalAmount+=21;
					break;
				case 'q': 
					finalAmount+=25;
					break;
				case 'w': 
					finalAmount+=19;
					break;
				case '}': 
					finalAmount+=18;
					break;
				case '$': 
					finalAmount+=29;
					break;
				case '*': 
					finalAmount+=17;
					break;
				case '0': 
					finalAmount+=22;
					break;
				case '6': 
					finalAmount+=26;
					break;
				case '<': 
					finalAmount+=10;
					break;
				case 'B': 
					finalAmount+=29;
					break;
				case 'H': 
					finalAmount+=25;
					break;
				case 'N': 
					finalAmount+=25;
					break;
				case 'T': 
					finalAmount+=16;
					break;
				case 'Z': 
					finalAmount+=22;
					break;
				case '`': 
					finalAmount+=3;
					break;
				case 'f': 
					finalAmount+=18;
					break;
				case 'l': 
					finalAmount+=16;
					break;
				case 'r': 
					finalAmount+=13;
					break;
				case 'x': 
					finalAmount+=13;
					break;
				case '~': 
					finalAmount+=9;
					break;
				case '%': 
					finalAmount+=22;
					break;
				case '+': 
					finalAmount+=13;
					break;
				case '1': 
					finalAmount+=19;
					break;
				case '7': 
					finalAmount+=16;
					break;
				case '=': 
					finalAmount+=14;
					break;
				case 'C': 
					finalAmount+=20;
					break;
				case 'I': 
					finalAmount+=18;
					break;
				case 'O': 
					finalAmount+=26;
					break;
				case 'U': 
					finalAmount+=23;
					break;
				case '[': 
					finalAmount+=18;
					break;
				case 'a': 
					finalAmount+=23;
					break;
				case 'g': 
					finalAmount+=30;
					break;
				case 'm': 
					finalAmount+=22;
					break;
				case 's': 
					finalAmount+=21;
					break;
				case 'y': 
					finalAmount+=24;
					break;
					
					
				default:
				
			
			}
			
			
		}

		System.out.println(finalAmount);
	}

}
}
