import java.util.*;
public class decimaltobinary{
    public static void decimalbinary(int number){
        int pow = 0;
        int binary = 0;
        int n = number;
        while(n>0){
            int rem = n%2;
            binary = binary+(rem * (int)Math.pow(10,pow));
            pow++;
            n = n/2;
        }
        System.out.println(binary);
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
       decimalbinary(a);
    }


}