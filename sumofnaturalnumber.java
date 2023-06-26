import java.util.*;

public class sumofnaturalnumber{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int number  =  sc.nextInt();
        int count = 1;
        int sum = 0;
        while(count<=number){

            sum = sum + count;
            count++;

        }
        System.out.print(sum);

    }
}