public class ternaryoperators{
    public static void main(String args[]){
        int a = 11; 
        int b = 20;
        int sum = (a>b)?a:b;    //ternary operator
        System.out.println(sum);

        String type = (a%2==0)?"even":"odd";
        System.out.println(type);
         
    }
}