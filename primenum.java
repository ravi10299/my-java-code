public class primenum{
    public static void main(String args[])
    {
        int num = 8;
        int count=0;
        for(int i=2;i<=num;i++){
            if(num%i==0){
                count++;
            }
           

        }
         if(count==1){
                System.out.println("this is prime number ");
            }else{
                System.out.println("this is not a prime number ");
            }
    }
}