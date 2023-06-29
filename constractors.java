public class constractors{
    public static void main(String args[]){
        Student s1 = new Student();
        Student s2 = new Student("ravi kuamr verma");
        Student s3 = new Student(8001);
        System.out.println(s2.name);
        System.out.println(s3.roll);

    }
}
class Student{
    String name;
    int roll;
    Student(){              //non parameterized constructors
        System.out.println("constractors called........");
    }
    Student(String name){
        this.name = name;
    }
    Student(int roll){
        this.roll = roll;
    }
}