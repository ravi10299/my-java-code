public class super_keyword{
    public static void main(String args[]){
        Horse  h = new Horse();
        System.out.println(h.color);

    }
}


class Animal{
    String color;
    Animal(){
        System.out.println("Animal constractors is classed");
    }
}
class Horse extends Animal{
 
    Horse(){
       super.color = "brown";
        System.out.println("horse constrctors is called ");
    }
}