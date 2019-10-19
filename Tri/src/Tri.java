import java.util.Scanner;

public class Tri {

	public Tri() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner (System.in);
		
		int x= in.nextInt();
		int y= in.nextInt();
		int z= in.nextInt();
		
		if(x==(y+z)) {
			System.out.println(x + "=" + y + "+" + z);
		}else if((x+y)==z) {
	        	System.out.println(x + "+" + y + "=" + z);
	        }
        else if(x==(y-z)) {
        	System.out.println(x + "=" + y + "-" +z);
        }
        
        else if((x-z)==z) {
        	System.out.println(x + "-" + y + "=" + z);
        }
        else if(x==(y*z)) {
        	System.out.println(x + "=" + y + "*" + z);
        }
             
        else if((x*y)==z) {
        	System.out.println(x + "*" + y + "=" + z);
        }
        else if((x/y)==z && (x%y)==0) {
        	System.out.println(x + "/" + y + "=" + z);
        }
        else if(x==(y/z)&& (y%z)==0) {
        	System.out.println(x+ "=" + y + "/" +z);
        }
		
		
		

	}

}
