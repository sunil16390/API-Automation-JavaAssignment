/*
Run a for loop from 500 to 1000 where if loop finds number 808
then it will print the number found as 808
 */
package Problem5;

public class ForLoopMatchingNumber
{

    public static void main(String[] args)
    {
        int numberToSearch = 808; // assign the number to be searched
        if(matchingNumber(numberToSearch)==numberToSearch)
        {
            System.out.println("The number found as "+numberToSearch);
        }
        else System.out.println(numberToSearch+" not found");
    }
    public static int matchingNumber(int num)
    {
        int matchValue = 0;
        for (int i=500; i<=1000; i++)
        {
            if (i==num)
            {
                matchValue = i;
                i=1001; // Once the number found loop will stop due to this statement
            }
        }
        return matchValue;
    }
}
