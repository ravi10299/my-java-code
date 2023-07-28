public class method_overriding{
    public static void main(String args[]){
        Deer dr = new Deer();
        dr.eat();

    }
}

class Animal{
    void eat(){
        System.out.println("eating any thing");

    }
}
class Deer extends Animal{
    void eat(){
        System.out.println("eating a grass");

    }
    
}