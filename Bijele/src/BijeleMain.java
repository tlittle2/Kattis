import java.util.Scanner;

/**
 * 
 * @author Trevor Little
 * @version 1/22/19
 * Bijele Main- Kattis Lab
 */

public class BijeleMain {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		
		int king = 1;
		
		int queen= 1;
		int rook= 2;
		int bishop= 2;
		int knight= 2;
		int pawn= 8;
		
		int newKing= king-in.nextInt();
		int newQueen= queen-in.nextInt();
		int newRook= rook- in.nextInt();
		int newBishop= bishop- in.nextInt();
		int newKnight= knight- in.nextInt();
		int newPawn= pawn- in.nextInt();
		
		
		System.out.println(newKing + " " + newQueen + " " + newRook + " " + newBishop + " " + newKnight + " " + newPawn);
		
		
		
		in.close();
		
		

	}

}
