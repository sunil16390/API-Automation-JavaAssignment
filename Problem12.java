/*
Write a program to print 100 numbers using,
While loop and
For loop
 */
package Problem12;

public class JavaLoop
{
    public static void main(String[] args) {
        int maxNumber = 100;
        forloop(maxNumber);
        JavaLoop jl = new JavaLoop();
        jl.whileLoop(maxNumber);
    }
    public static void forloop(int num)
    {
        System.out.println("In for loop");
        for (int i = 1; i<=num; i++)
        {
            System.out.println(i);
        }
    }
    public void whileLoop(int num)
    {
        System.out.println("In while loop");
        int i =1;
        while (i<=num)
        {
            System.out.println(i);
            i++;
        }
    }
}
