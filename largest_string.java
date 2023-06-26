public class largest_string{
    public static void main(String args[]){
        String fruits[]  = {"apple","mango","banana"};
        String largeststr = fruits[0];
        for(int i= 1;i<fruits.length;i++){
            if(largeststr.compareTo(fruits[i])<0){
                largeststr = fruits[i];
            }



        }


       
        System.out.println(largeststr);
    }
}