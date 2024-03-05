// Find the value of C in below Program and return it?
package Problem7;

public class FindTheValueOfC
{
    public static void main(String[] args)
    {
        FindTheValueOfC obj = new FindTheValueOfC();
        System.out.println(obj.returnNumber());
    }
    public int returnNumber(){
        int c = 0;
        float a = 7.8f;
        float b = 4.4f;

        c = (int)a + (int)b;
        return c;
    }
}
