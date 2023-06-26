import java.util.*;
public class inputstring{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        char arr[]= {'a','b','c','d'};
        String str = "abcd";
        String str2 = new String("abcd");
        System.out.println(arr[1]);
        System.out.println(str);
        System.out.println(str2);

        String name;
        name = sc.nextLine();
        System.out.println(name);

    }
}