public class typecasting{
    public static void main(String[] args){
        int a=257;
       byte b=(byte)a;
        System.out.println(b);
        float d=12.56f;
        int c=(int)d;
        System.out.println(c);

        //type promotion in expressions
        byte x=5;
        byte y=10;
        int result=x*y;
        System.out.println(result);
    }
}