public class substring{
    public static String substr(String str,int start,int end){
        String str1 = "";
        for(int i=start;i<=end-1;i++){
            str1 += str.charAt(i);
        } 
        return str1;

    }
    public static void main(String args[]){
        String str = "helloworld";

        System.out.println(substr(str,0,5));
        System.out.println(str.substring(0,5));


    }
}