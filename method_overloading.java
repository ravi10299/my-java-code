public class method_overloading{
    public static void main(String args[]){
        Calculator calu = new Calculator();
        System.out.println(calu.sum(10,20));
        System.out.println(calu.sum((float)10,(float)30));
        System.out.println(calu.sum(10,20,30));


    }
}

class Calculator{
    int sum(int a,int b){
        return a+b;

    }
    float sum(float a, float b ){
        return a+b;

    }
    int sum (int a , int b, int c){
        return a+b+c;
    }
}