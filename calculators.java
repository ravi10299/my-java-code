import java.util.*;
public class calculators{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("enetr the volues of a : ");
        int a = sc.nextInt();
         System.out.print("enetr the volues of b : ");
         int b = sc.nextInt();
         System.out.print("enetr the operators  : ");
        char ch = sc.next().charAt(0);
        
        switch(ch){
            case '+':{
                System.out.println(a+b);
                break;
                
            }
            case '-':{
                if(a>b)
              {  System.out.println(a-b);
              }else{
                System.out.println(b-a);
              }
              break;
            }
             case '*':{
                System.out.println(a*b);
                break;
                
            }
             case '/':{
                System.out.println(a/b);
                break;
                
            }
             case '%':{
                System.out.println(a%b);
                break;
                
            }
             default:System.out.println("invalid  the operators "+ch);
        }
    }
}