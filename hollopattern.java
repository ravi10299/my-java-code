import java.util.*;
public class hollopattern{
    public static void hollo_rectangle(int row , int col){
        //outer loop
        for(int i=1;i<=row;i++){
            //inner loop
            for(int j = 1;j<=col;j++){
                if(i==1 || i==row  || j==1 || j==col){
                    System.out.print("*");

                }else{
                     System.out.print(" ");
                }
            }
            System.out.println("");
        }
    }
    public static void main(String agrs[]){
        hollo_rectangle(4,5);

    }
}