// Write a java program to create a random AlphaNumeric number and Return it as a String
package Problem15;

import java.util.Scanner;
import java.util.UUID;

public class RandomAlphanumeric
{
    public static void main(String[] args) {

        RandomAlphanumeric obj = new RandomAlphanumeric();
        String randomString = obj.getRandomString();
        if (randomString=="0")
        {
            System.out.println("Wrong Input!");
        }
        else
            System.out.println("A rendom string: "+randomString  );

    }
    public String getRandomString()
    {
        UUID randomUUID = UUID.randomUUID();

        String randomStr = randomUUID.toString().replaceAll("-", "");
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the length of random String to be generated(between 5 to 32): ");
        int len = input.nextInt();
        input.close();
        if (len<5 || len>32)
        {
            return "0";
        }
        else {
            randomStr = randomStr.substring(0, len);
            return randomStr;
        }
    }
}
