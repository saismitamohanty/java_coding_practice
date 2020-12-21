package greatestOfThreeNumbers;

import java.util.Scanner;
public class GreatestOfThreeNumbers
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number : ");
        int first = sc.nextInt();
        System.out.print("Enter the second number : ");
        int second = sc.nextInt();
        System.out.print("Enter the third number : ");
        int third = sc.nextInt();
        System.out.println();
        if(first > second && first > third)
            System.out.println(first+" is the greatest number.");
        else if(second > first && second > third)
            System.out.println(second+" is the greatest number.");
        else if(third > first && third > second)
            System.out.println(third+" is the greatest number.");
        else
            System.out.println("All three numbers are same");
        sc.close();
    }
}
