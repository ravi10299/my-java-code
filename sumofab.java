import java.util.*;
public class sumofab{
    public static void main(String args[]){
     /*   int a= 10;
        int b = 20;
        int sum;
        sum = a+b;
        System.out.println(sum);*/
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the first number is : ");
        int a = sc.nextInt();
        System.out.println("enter the second number is : ");
        int b = sc.nextInt();
        int sum = a+b;
        int product = a*b;
        System.out.println(sum);
        System.out.println(product);
    }
}