public class statics_keyword{
    public static void main(String args[]){
        Student s1 = new Student();
        s1.college = "kit";
        s1.name  = "ravi kumar verma";
         s1.roll = 123;
         System.out.println(s1.college);
         System.out.println( s1.roll);
         System.out.println(s1.name);
         Student s2 = new Student();
         System.out.println(s2.college);
         System.out.println(s2.name);


    }
}

class Student{
    String name;
    int roll;
    static String college;

void Setcollege(String college){
    this.college = college;
}
String getcollege(){
    return this.college;
}

void setRoll(int roll){
    this.roll = roll;

}
int getroll(){
    return this.roll;
}

void setName(String name){
    this.name = name;
}
String getname(){
    return this.name;
}
}