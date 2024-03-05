/*
Print only 12345 from below string
"ABCDE12345"

 */
package Problem9;

public class StringOperation
{
    String input_string = "ABCDE12345";
    public static void main(String[] args)
    {
        StringOperation so = new StringOperation();
        removeLetters(so.input_string);
    }
    public static void removeLetters(String input_string)
    {
        System.out.println("Before removing alphabets: "+input_string);
        String new_string = input_string.replaceAll("[^1-9]","");
        System.out.println("After removing alphabets: "+new_string);
    }

}
