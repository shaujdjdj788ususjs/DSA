import java.util.*;
public class Power{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number");
        int n=sc.nextInt();
        System.out.println(n); 
        boolean result=isPowerofTwo(n);
        System.out.println("Is power of 2"+result);
    }
        public static boolean isPowerofTwo(int n){
        if(n<1){
            return false;
        }
        else if (n==1) {
            return true;
        }
        else{
            while(n%2==0){
                n=n/2;
            }
            if(n==1){
                return true;
            }
            else{
                return false;
            }
        }
    }

}
    
 