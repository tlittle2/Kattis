import java.util.*;

public class Main {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> arr = new ArrayList<Integer>();
        int ip = sc.nextInt();
        int base = sc.nextInt();
        boolean mult = false;
        for(int i = 0; i < ip-1; i++){
            int val = sc.nextInt();
            if(mult){
                base = val;
                mult = false;
            }else {
                if (val % base == 0) {
                    arr.add(val);
                    mult = true;
                }
            }
        }

        for(int a: arr){
            System.out.println(a);
        }
        sc.close();
    }
}
