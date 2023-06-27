public class set_bit{
    public static int set(int n,int i){
        int bitmarks = 1<<i;
       return n | bitmarks;
    }
    public static void main(String args[]){
        System.out.println(set(10,2));

    }
}