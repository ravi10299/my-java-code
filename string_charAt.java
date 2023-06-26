public class string_charAt{
    public static void charactor(String name){
        for(int i = 0;i<name.length();i++){
            System.out.print(name.charAt(i)+"  ");

        }
        System.out.println();
    }

    public static void main(String args[]){
        String name = "ravi kumar verma";
        System.out.println(name.charAt(0));
        charactor(name);

    }
}