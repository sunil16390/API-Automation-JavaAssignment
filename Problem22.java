/*
Write a program to print “Narendra Modi” to - (Use appropriate String methods)
    UpperCase & the LowerCase
 */
package Problem22;

public class ChangeStringCase
{
    static String name = "Narendra Modi";

    public static void main(String[] args) {
        System.out.println("Original Name is: "+name);
        upperAndLowerCase();
    }
    public static void upperAndLowerCase()
    {
        System.out.println("In UpperCase: "+name.toUpperCase());
        System.out.println("In Lower Case: "+name.toLowerCase());
    }


}
