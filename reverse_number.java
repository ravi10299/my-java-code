public class reverse_number{
//     public static void  reversenum(int n){
//     if(n==1){
//         System.out.print(n);
//         return;
//     }
//     System.out.print(n+" ");
//      reversenum(n-1);
// }

public static void reversenum(int n){
    for(int i = n;i>=1;i--){
        System.out.print(i+"  ");
      
    }
}
    public static void main(String args[]){
        int num = 10;
        reversenum(num);
    }
}

