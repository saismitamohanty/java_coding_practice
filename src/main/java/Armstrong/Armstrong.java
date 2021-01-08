package Armstrong;

import java.util.Scanner;
public class Armstrong
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int number = sc.nextInt();
        int n = number;
        int sum = 0;
        while(n != 0)
        {
            int pick_last = n % 10;
            sum = sum + (pick_last * pick_last * pick_last);
            n = n / 10;
        }
        if(sum == number)
            System.out.println("Armstrong Number");
        else
            System.out.println("Not an Armstrong Number");
        sc.close();
    }
}
