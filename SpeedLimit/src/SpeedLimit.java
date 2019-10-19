import java.util.Scanner;

public class SpeedLimit {

	public SpeedLimit() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in= new Scanner(System.in);
	
		int total= 0;
		while(true) {
			int speed= in.nextInt();
			if(speed == -1) {
				break;
			}
		
		
		int endTime= 0;
		int currentSpeed= 0;
		int currentTime= 0;
		
			for(int i= 0; i < speed; i++) {
				currentSpeed= in.nextInt();
				currentTime= in.nextInt();
				total+= (currentTime- endTime) * currentSpeed;
				endTime= currentTime;
			}
			
		}
		System.out.println(total + " miles");

	}
}
