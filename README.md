class Pen{
    public String name;
    public int num;
    public void name(){
        System.out.println(this.name);
    }
    public void num(){
      System.out.println(this.num);  
    }
}

public class p1 {
    public static void main(String[] args){
    Pen pen=new Pen();
    pen.name="gel";
    pen.num=4;
    pen.name();
    pen.num(); 
    
        
    }
}
