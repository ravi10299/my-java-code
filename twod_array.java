import java.util.*;

public class twod_array{

   // find the number of the index of the matrix
    public static boolean find(int number[][]){
        int key = 1;

        for(int i=1;i<number.length;i++)
        {
           for(int j = 1;j<number[1].length;j++)
           {
                if(number[i][j]==key){
                System.out.println("the number ids is the found ("+i+","+j+")");
                return true;
                }
            }
        }
        return false;
   }
    public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the number of the row :");
    int n = sc.nextInt();
    System.out.println("enter the number if the colom: ");
    int m = sc.nextInt();
    int number[][] = new int [n][m];

    System.out.println("enter the number of element is  :  ");

    for(int i=1;i<number.length;i++){
        for(int j = 1;j<number[1].length;j++){
            number[i][j] = sc.nextInt();
        }
    }

     for(int i=1;i<number.length;i++){
        for(int j = 1;j<number[1].length;j++){
            System.out.print(number[i][j]+"  ");
        }
        System.out.println();
    }

    find(number);
    
    }
}