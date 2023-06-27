public class update_bit{
    public static int clear(int n,int i){
        int bitmarks = ~(1<<i);
        return n & bitmarks;
    }
    public static int set(int n,int i){
        int bitmarks = 1<<i;
       return n | bitmarks;
    }
    public static int update(int n,int i,int newbit){
        if(newbit == 0){
            return clear(n,i);
    }else{
        return set(n,i);
    }
    }
    public static void main(String args[]){
        System.out.println(update(10,2,1));
    }
}