// import java.util.*;
// public class largest_value_array{
//     public static int findlargest(int number[]){
//         int largest = Integer.MIN_VALUE;
//         for(int i = 0;i<number.length;i++){
//             if (largest < number[i])
//             largest = number[i];

//         }
//         return largest;
//     }
//     public static void main(String args[]){
//         int number[] = {10,20,500,60,80,90,100};
//         int largest = findlargest(number);
//         System.out.print(largest);


//     }

// }

import java.util.*;
public class largest_value_array{
    public static int findlargest(int number[]){
        int smallest = Integer.MAX_VALUE;
        for(int i = 0;i<number.length;i++){
            if (smallest > number[i])
            smallest = number[i];

        }
        return smallest;
    }
    public static void main(String args[]){
        int number[] = {10,20,500,60,80,9,100};
        int smallest = findlargest(number);
        System.out.print(smallest);


    }

}