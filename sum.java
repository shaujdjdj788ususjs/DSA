import java.util.*;

public class Sum {
    public static void main(String[] args) {
        int sum = 0;

        // Sum from 0 to 10
        for (int i = 0; i <= 10; i++) {
            sum += i;
        }
        System.out.println("Sum from 0 to 10: " + sum);

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int num = sc.nextInt();

        int[] a = new int[num];

        System.out.println("Enter " + num + " elements:");
        for (int i = 0; i < num; i++) {
            a[i] = sc.nextInt();
        }

        System.out.println("The entered elements are:");
        System.out.print("[");
        for (int i = 0; i < num; i++) {
            System.out.print(a[i]);
            if (i < num - 1) {
                System.out.print(", ");
            }
        }
        sc.close();
        System.out.print("]");
    }
}
