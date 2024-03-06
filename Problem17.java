// Write a program to print even or odd number using if condition
package Problem17;

import java.util.Scanner;

public class EvenOddNumbers {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number to verify even/odd: ");
        long numberTobeTested = input.nextLong();

        EvenOddNumbers obj = new EvenOddNumbers();
        obj.evenOrOdd(numberTobeTested);
    }
    public void evenOrOdd(long num)
    {
     if (num%2 == 0)
     {
         System.out.println(num+ " is an even number.");
     }
     else
         System.out.println(num+ " is an odd number.");
    }

}
