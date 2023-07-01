public class inheritance{
    public static void main(String args[]){
        Fish shark = new Fish();
        shark.eat();

    }
}

class Animal{
    String color;

    void eat(){
        System.out.println("esting");

    }
    void breath(){
        System.out.println("breath");

    }
}

class Fish extends Animal {
    int fins;

    void swing(){
        System.out.println("Swing in water...");

    }

}