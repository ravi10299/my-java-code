public class multi_level_inheritance{
    public static void main(String args[]){
        // Fish fi = new Fish();
        // fi.eats();

        Dog dobby = new Dog();
        dobby.eats();
        dobby.legs = 4;
        System.out.println(dobby.legs);
        dobby.color = "red";
        dobby.breed = "breed";
        System.out.println(dobby.color);
        System.out.println(dobby.breed);
        

    }
}
class Animal{
    String color;

    void eats(){
        System.out.println("eting .......");

    }
    
}
class Mammal extends Animal{
    int legs;
    
}

class Dog extends Mammal{
    String breed;
}

// class Fish extends Animal{
//         int figs;

//         void swing(){
//             System.out.println("swing in water............");
//         }
//     }