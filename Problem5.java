/*
Run a for loop from 500 to 1000 where if loop finds number 808
then it will print the number found as 808
 */
package Problem5;

public class ForLoopMatchingNumber
{

    public static void main(String[] args)
    {
        matchingNumber();
    }
    public static void matchingNumber()
    {
        for (int i=500; i<=1000; i++)
        {
            if (i==808)
            {
                System.out.println("the number found as 808");
            }

        }
    }
}
