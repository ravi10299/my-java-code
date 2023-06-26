public class pattern{
    public static void main(String args[]){
      /*  for(int i = 1;i<=5;i++){
            for(int j=0;j<i;j++){
                System.out.print("*");
            }
            System.out.println("");
        }

        */
      /* for(int i=0;i<4;i++){
        for(int j=4;j>i;j--)
        {
            System.out.print("*");
        
        }
        System.out.println("");
       }
       */
      int n = 5;
      char ch = 'A';
      for(int i = 1;i<=n;i++){
        for(int j = 1;j<=i;j++)
        {
            System.out.print(ch);
            ch++;
        }
        System.out.println("");
      }
    }
}