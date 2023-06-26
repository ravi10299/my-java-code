public class string_shortestpath{
public static float shortestpath(String diraction){
    int x=0,y=0;
    for(int i=0;i<diraction.length();i++){
        char dir = diraction.charAt(i);
        if(dir == 's'){
            y--;
        }if(dir == 'n'){
            y++;

        }if(dir == 'w'){
            x--;

        }if(dir == 'e'){
            x++;

        }

    }
    int x2 = x*x;
    int y2 = y*y;
    return (float)Math.sqrt(x2+y2);
}

    public static void main(String args[]){
        String name = "wneenesennn";
        System.out.println(shortestpath(name));

    }
}