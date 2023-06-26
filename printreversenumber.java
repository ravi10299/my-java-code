public class printreversenumber{
    public static void main(String args[]){
        int n =  10299;
      
      //use while loops
      
      /*  while(n>0){
            int lastDigit = n%10;
            System.out.print(lastDigit);
            n = n/10;
        }*/
        for(int i = 1;i<n;i++){
             int lastDigit = n%10;
            System.out.print(lastDigit);
            n = n/10;
            
        }
    }
}