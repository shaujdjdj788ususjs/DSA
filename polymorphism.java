class Student{
    String name;
    int age;
//polymorphism in oops
    public void printInfo(String name){
        System.out.println(name);
    }
    
    public void printInfo(int age){
        System.out.println(age);
    }
    public void printInfo(String name,int age){
        System.out.println(name + " " + age);
    }
}
public class polymorphism{
    public static void main(String args[]){
        Student S1=new Student();
        S1.name="shamita";
        S1.age=20;
    
        S1.printInfo(S1.name,S1.age);
    }
}