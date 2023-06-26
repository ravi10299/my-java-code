import java.util.*;
public class inputnumber{
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int count  = 1;
        while(count<=number){
            System.out.print(count+" ");
            count++;
        }
    }
}