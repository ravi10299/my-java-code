public class string_compres{
    public static void compres(StringBuilder sb){
        StringBuilder str = new StringBuilder("");

        for(int i = 0;i<sb.length();i++){
            Integer count = 1;
            while(i<sb.length()-1 && sb.charAt(i)==sb.charAt(i+1))
            {
                count++;
                i++;
            }
            str.append(sb.charAt(i));
            if(count>1){
                str.append(count.toString());
            }
        }
        System.out.println(str);
    }
    public static void main(String args[]){
        StringBuilder sb = new StringBuilder("aaaaaaaaabbbbbbbaaaccdd");
        compres(sb);
    }
}
