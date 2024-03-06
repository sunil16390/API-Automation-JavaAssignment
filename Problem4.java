/*
Write a function which accepts 3 parameters. 2 integers and 1 String. If String parameter
is 'add' then it would add two integers. Similarly 'subs'/'multiplication'/'division'.
 */
package Problem4;

public class ArithmeticOperation
{
    public static void main(String[] args)
    {
        ArithmeticOperation ao = new ArithmeticOperation();
        ao.simpleArithmetic(12,5,"division");
        ao.simpleArithmetic(12,5,"subs");
        ao.simpleArithmetic(12,5,"multiplication");
        ao.simpleArithmetic(12,5,"division");
        ao.simpleArithmetic(12,5,"hi");
    }
    public void simpleArithmetic(int first_num, int second_num, String operator)
    {
        int result;
        if (operator == "add")
        {
            result = first_num+second_num;
            System.out.println(+first_num+" "+operator+" "+second_num+ " = " +result);
        }
        else if (operator == "subs")
        {
            result = first_num-second_num;
            System.out.println(+first_num+" "+operator+" "+second_num+ " = " +result);
        }
        else if (operator == "multiplication")
        {
            result = first_num*second_num;
            System.out.println(+first_num+" "+operator+" "+second_num+ " = " +result);
        }
        else if (operator == "division")
        {
            float rsl = (float)first_num/second_num;
            System.out.println(+first_num+" "+operator+" "+second_num+ " = " +rsl);
        }
        else System.out.println("Third parameter should be only 'add'/'subs'/'multiplication'/'division', but you entered: "+operator);

    }
}
