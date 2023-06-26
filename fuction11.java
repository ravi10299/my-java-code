import java.util.*;
public class fuction11{
    public static void helloworld(){
        System.out.print("hello world");
        return;

    }
    public static void sumofnum(){
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        int b = sc.nextInt();
        int sum = a+b;
        System.out.println(sum);
    }
    public static void sumofnum1(int a,int b){
        int sum = a+b;
        System.out.println(sum);
        return;

    }
    public static int sumofnum2(int a, int b){
         int sum = a+b;
        return sum;

    }
    public static int froduct(int a ,int b){
        int frod = a*b;
        return frod;
    }


        // overloding methods in java.

    public static int overloding(int a,int b){
        int sum  =  a+b;
        return sum;
    }
    public static float overloding(float a,float b){
        float sum  =  a+b;
        return sum;
    }



    public static void main(String agrs[]){
      //  helloworld();
     // sumofnum();
      Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        int b = sc.nextInt();
        
     //   sumofnum1(a,b);
       //  int sume =  sumofnum2(a,b);
      //   System.out.println(sume);
     // int froducts = froduct(a,b);
     // System.out.print(froducts); 



     //OVERLODING IN JAVA MEANS HAVING  TWO OR MORE METHODS (OR FUCTION) IN A CLASS WITH THE SAME NAME AND DIFFERENT ARUGUMENT (OR PARAMETERS ),

            int sum2 = overloding(a,b);
            System.out.println(sum2);
            float sum3 = overloding(4.4f,5.5f);
            System.out.println(sum3);
    }
}