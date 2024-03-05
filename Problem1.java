
//Write a java program to add two float numbers like 8.6 and 9.7

package Problem1;

public class AddTwoFloatNumbers
{
    float first_number = 8.60f;
    float second_number = 9.70f;

    public static void main(String[] args)
    {
        AddTwoFloatNumbers atfn = new AddTwoFloatNumbers();
        addition(atfn.first_number, atfn.second_number);
    }
    public static void addition(float x, float y)
    {
        float sum = x+y;
        System.out.println("Sum of " +x+ " and " +y+ " is: " +sum);
    }
}
