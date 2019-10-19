import java.util.Scanner;

public class Sum_Kind_of_Problem {

    public Sum_Kind_of_Problem() {
        // TODO Auto-generated constructor stub
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        
        int n= in.nextInt();
        
        long  s0, s1= 0, s2= 0, s3= 0;
        
        int k;
        
        for(int j= 0; j < n; j++ ) {
            
            
            s0= in.nextInt();
            k= in.nextInt();
            
            
            s1= 0;
                    
            for(int i = 1; i <= k; i++) {
                 s1+= i;
            }
            
            s2= 0;
            
            for(int i = 1; i <= k ; i ++) {
                s2+= i*2-1;
            }
            
            s3= 0;
            
            for(int i = 1; i <= k; i++) {
                s3+=i*2;
            }
        
        
            System.out.println(s0 + " " + s1 + " " + s2 + " "+ s3);
        }
    }

}