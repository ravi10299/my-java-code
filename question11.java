
        // question 1
/*import java.util.*;
public class question11{
    public static void avg(int a,int b,int c){
        int d = (a+b+c)/2;
        System.out.print(d);
        return;
    }
     public static void main(String args[]){
        Scanner sc  = new Scanner(System.in);
        int a =sc.nextInt();
          int b =sc.nextInt();
            int c =sc.nextInt();
        avg(a,b,c);
     }

}*/

        //question 2


  /*      import java.util.*;
        public class question11{
             public static boolean evenodd(int n){
                boolean b;
            if(n%2==0){
                return  b = true;
                
            } else{
                return b = false;
            }


        }
        public static void main(String agrs[]){
            Scanner sc = new Scanner(System.in);
            System.out.println("enter the number : ");
            int n = sc.nextInt();
            
           
            boolean b = evenodd(n);
            System.out.println(b);


        }
        }
        */
       import java.util.*;
       public class question11{
        public static int  pellidromnum(int n){
            int pelidrom = 0;
            int pow = 0;
            while(n>0){
                int ld = n%10;
                pelidrom = (pelidrom*10)+ld;
                pow++;
                n = n/10;
            }
           
            return pelidrom;

        }
        public static void main(String args[]){
            Scanner sc  = new Scanner(System.in);
            System.out.print("enter the number : ");
            int n = sc.nextInt();
            int pelidrom = pellidromnum(n);
             if(pelidrom==n){
                System.out.println("the number is pelidrom number "+n+"  =  "+pelidrom);
            }else{
                System.out.println("the number is not pelidrom number "+n+"  !=  "+pelidrom);
            }

        }
       }