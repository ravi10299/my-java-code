public class string_palindrom{
    public static boolean palindram(String name){
        for(int i=0;i<=name.length()/2;i++){
            if(name.charAt(i)!=name.charAt(name.length()-1-i)){
                return false;

            }
        }
        return true;
    }
    public static void main(String args[]){
        String name = "racecar";
        System.out.print(palindram(name));
    }
}