import java.util.*;
public class switchstatment{
        public static void main(String args[]){
            Scanner sc = new Scanner(System.in);
            System.out.println("enter the number is:");
            int number  = sc.nextInt();
            switch(number){
                case 1:{System.out.println("rvai kumar verma");
                        break;}
                case 2:{System.out.println("ravindra kumar gautam");
                        break;}
                case 3:{System.out.println("shashi shekhar azad");
                        break;}
                default :System.out.println("mr perfect");          
            }
        }

}