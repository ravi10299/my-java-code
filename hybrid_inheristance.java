public class hybrid_inheristance{
    public static void main(String args[]){
        Shark sk = new Shark();
        sk.name= "shark";
        System.out.println(sk.name);

    }
}

class Animal{
    String color;
    String name;
    void eats(){
        System.out.println("eating.......");

    }
}
class Bird extends Animal{
    void Flying(){
        System.out.println("Flying..........");

    }
}
class Peackok extends Bird{
   void br(){
     System.out.println("Peackok.........");
   }
}

class Mammal extends Animal{
    int legs;
}
class Lion extends Mammal{
    void king(){
        System.out.println("lion.........");
        }

}
class Fish extends Animal{
    int fins;

}
class Shark extends Fish{
    void big(){
        System.out.println("Shark...........");
    }
}