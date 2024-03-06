/*
    Write a program to verify if the name of Cristiano Ronaldo is equal to Ronaldo Nazario
     (Use appropriate String methods)
 */
package Problem20;

public class StringCompare
{
    public static void main(String[] args)
    {
     StringCompare SC = new StringCompare();
     String compare = SC.compareString("Cristiano Ronaldo");

     System.out.println("Cristiano Ronaldo is "+compare+ " to Ronaldo Nazario");
    }
    public String compareString(String name)
    {
        if (name.equals("Ronaldo Nazario"))
        {
            return "equals";
        }
        else return "not equals";
    }
}
