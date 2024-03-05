//Write a Program to Reverse The String "Welcome To Java"?
package Problem13;

public class ReverseString
{


    public static void main(String[] args) {
        String inputString = "Welcome To Java";
        System.out.println("Original: "+inputString);
        ReverseString rs = new ReverseString();
        rs.firstMethod(inputString);
    }
    public void firstMethod(String inputStr)
    {
        int len = inputStr.length();
        String newStr = "";
        char eachChar;
        for(int i=0; i<len; i++)
        {
            eachChar = inputStr.charAt(i);
            newStr = eachChar+newStr;
        }
        System.out.println("After reversing: "+newStr);
    }
}

