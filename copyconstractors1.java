public class copyconstractors1{
    public static void main(String args[]){
       Student s1 = new Student();
       s1.name = "ravi kumar verma";
       s1.roll = 8001;
       s1.possword = "asdf";
       s1.marks[0] = 100;
       s1.marks[1] = 101;
       s1.marks[2] = 102;


       Student s2 = new Student(s1);
       s2.possword = "jfiif";
       s1.marks[2]= 1001;

     
        for(int i=0;i<3;i++){
            System.out.println(s2.marks[i]);
        }


        System.out.println(s1.name);
         System.out.println(s2.name);
          System.out.println(s1.roll);
           System.out.println(s2.roll);
            System.out.println(s1.possword);
             System.out.println(s2.possword);
    }
}
class Student{
    String  name;
    int roll;
    String possword;
    int marks[];

    // shallow copy constractors...........

    // Student(Student s1){
    //     marks = new int[3];
    //     this.name = s1.name;
    //     this.roll  = s1.roll;
    //     this.marks = s1.marks;
    //    }

    // deep copy constructors...........
     Student(Student s1){
        marks = new int[3];
        this.name = s1.name;
        this.roll  = s1.roll;
        for(int i=0;i<marks.length;i++){
        this.marks[i] = s1.marks[i];
        }
     }
    Student(){
        marks = new int[3];
        System.out.println("called by constructors........");

    }
    Student(String name){
         marks = new int[3];
        this.name = name;
    }
    Student(int roll){
        marks = new int[3];
        this.roll = roll;
    }
   
}