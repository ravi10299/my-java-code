import java.util.*;

public class studentpassorfail{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the marks :  ");

        int marks = sc.nextInt();
        String result = marks>=33?"pass":"fail";
        System.out.println(result);
    }
}