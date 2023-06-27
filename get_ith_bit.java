public class get_ith_bit{
    public static int getbit(int number,int n){
        int ithbit = 1<<n;
        if((number & ithbit)==0){
            return 0;
        }
        return 1;
    }
    public static void main(String args[]){
        int number =10;
        System.out.println(getbit(number,0));

    }
}