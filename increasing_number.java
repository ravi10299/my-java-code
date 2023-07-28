public class increasing_number{
    public static void increasing(int n){
        if(n==10){
            System.out.print(n);
            return;
        }
        System.out.print(n+"  ");
        increasing(n+1);
    }
       public static void main(String args[]){
        int n = 1;
        increasing(n);
       }

}