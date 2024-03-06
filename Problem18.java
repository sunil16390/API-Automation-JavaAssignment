/*
Write a program to print – (Use appropriate String methods)

    1. Only First name from “Sachin Tendulkar”
    2. Only Second name from “Rahul Dravid”

 */
package Problem18;

public class FirstNameLastName
{
    static String[] names = new String[2];

    public static void main(String[] args)
    {
        names[0] = "Sachin Tendulkar";
        names[1] = "Rahul Dravid";
        splitNames(names);
    }
    public static void splitNames(String[] names)
    {
        String firstName = names[0].split(" ")[0];
        String lastName = names[1].split(" ")[1];
        System.out.println("First name of "+names[0]+ " is: "+firstName);
        System.out.println("Last name of "+names[1]+ " is: "+lastName);
    }
}
