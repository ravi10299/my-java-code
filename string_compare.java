public class string_compare{
    public static void main(String args[]){
        String name = "wageesha";
        String name1 = "wageesha";
        String name2 = new String("wageesha");
        System.out.println(name);
        if(name == name1){
            System.out.println("string are equale");
        }else{
            System.out.println("string are not equale");
        }
        if(name == name2){
            System.out.println("string are equale");
        }else{
            System.out.println("string are not equale");
        }
        if(name.equals(name2)){
            System.out.println("string are equale");
        }else{
            System.out.println("string are not equale");
        }
        
    }
}