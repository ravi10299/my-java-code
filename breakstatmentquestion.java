import java.util.*;
public class breakstatmentquestion{
    public static void main(String args[]){
        Scanner sc  =  new Scanner(System.in);
        do{
            System.out.print("enter the number is:  ");
            int n = sc.nextInt();
            if(n%10==0){
                break;
            }
            System.out.println(n);
        }while(true);
    }
}