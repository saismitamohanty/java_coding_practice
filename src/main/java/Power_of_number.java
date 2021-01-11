import java.util.Scanner;

public class Power_of_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of base : ");
        int base = sc.nextInt();
        System.out.print("Enter the value of exponent : ");
        int exp = sc.nextInt();
        int result = 1;
        while (exp != 0) {
            result = result * base;
            --exp;
        }
        System.out.println("Answer = " + result);
        sc.close();
    }
}
