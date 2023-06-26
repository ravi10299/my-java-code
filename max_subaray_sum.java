import java.util.*;
public class max_subaray_sum
{
     public static void subarray(int number[])
     {
        int curretsum = 0;
        int max_sum = Integer.MIN_VALUE;
        for(int i = 0;i<number.length;i++){
             int start = i;
             for(int j = i;j<number.length;j++){
                int end = j;
                curretsum = 0;
                for(int k = start;k<=end;k++){
                    curretsum +=number[j];
                }
                System.out.println(curretsum);
                    if(max_sum < curretsum)
                    {
                        max_sum = curretsum;
                    }
                }
                System.out.println();
             }
                             System.out.println();
                                     System.out.println("maximum sum =  "+max_sum);


        }

    
    public static void main(String args[]){
        int number[] = {2,4,6,8,10};
        subarray(number);


    }
}    