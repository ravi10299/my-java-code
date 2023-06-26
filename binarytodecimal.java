import java.util.*;
public class binarytodecimal{
    public static void binaydecimal(int binary){
        int pow = 0;
        int decimal = 0;
        int n = binary;
        while(n>0){
            int lastdigits = n%10;
            decimal  = decimal+(lastdigits * (int)Math.pow(2,pow));
            pow++;
            n=n/10;
        }
        System.out.println(binary+"  binary " +"="+"  decimal = "+decimal);
    }



    public static void main(String[] args){
        Scanner sc  = new Scanner(System.in);
        int binary = sc.nextInt();
        binaydecimal(binary);


    }
}