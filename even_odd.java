import java.util.*;

public class even_odd{
    public static void evenodd(int n){
        int bitmarks = 1;
        if((n & bitmarks)==1){
            System.out.println("this is the odd number ");

        }else{
            System.out.println("this is the even number");
        }

    }

    public static void main(String args[] ){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the numebr is given by:   ");
        int number = sc.nextInt();
        evenodd(number);
       
    }
}