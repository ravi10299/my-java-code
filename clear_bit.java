public class clear_bit{
    public static int clear(int n,int i){
        int bitmarks = ~(1<<i);
        return n & bitmarks;
    }
    public static void main(String args[]){
        System.out.println(clear(10,1));

    }
}