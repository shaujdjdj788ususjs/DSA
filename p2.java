class Student{
    int rulnum;
    String stdname;
    
    Student(String stdname,int rulnum){
        this.rulnum=rulnum;
        this.stdname=stdname;
    }
    public void Stdinfo(){
        System.out.println(this.stdname);
        System.out.println(this.rulnum);
    }
}
/*steps to compile
cd d/ d:\leet code
javac p2.java 
java p2
*/
public class p2{
    public static void main(String[] args){
    Student s1=new Student("rama",56);
    s1.Stdinfo();
    }
}