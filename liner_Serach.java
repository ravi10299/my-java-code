public class liner_serach{
    public static int linerSerach(int number[],int key){
        for(int i=0;i<number.length;i++){
            if(number[i]==key){
                return i;
            }
        }
        return -1;

    }
    public static void main(String args[]){
        int number[] = {1,2,3,4,5};
        int key = 6;
        int index =  linerSerach(number,key);
        if(index== -1){
            System.out.println("not found");

        }else
        System.out.print(index);


    }
}
