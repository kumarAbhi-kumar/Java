import java.util.*;
public class fibonacci {
    public static void main(String[] args) {
        int a = 0;
        int b = 1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no. of itmes in fibonacci series.");
        int na = sc.nextInt();
        int fib_value[] = new int[na];
        fib_value = fibonacci_calculator(na);
        for(int i = 0; i <= na-1; i++)
        {
            System.out.print(fib_value[i]+" ");
        }

    }

    public static int[] fibonacci_calculator(int nw) {
        int[] fib = new int[nw];
        fib[0] = 0; fib[1] = 1;
        int sum = 0;
        int a = 0, b = 1;
        for(int i = 2; i <= nw-1; i++)
        {
            sum = a + b;
            fib[i] = sum;
            a = b;
            b = sum;
        }
        return fib;
    }
}
