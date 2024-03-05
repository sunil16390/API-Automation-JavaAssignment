/*
Write a program where create an int type arraylist object.
Then add 200 to 500 numbers into the ArrayList then Print the ArrayList.

    1. Perform the same for HashSet and print
    2. Perform the same for TreeSet and print
 */
package Problem6;

import java.util.*;

public class CollectionFramework
{
    public static void main(String[] args)
    {
        CollectionFramework cf_obj = new CollectionFramework();
        cf_obj.arrayListOfNumbers();
        hashSetOfNumbers();
        cf_obj.treeSetOfNumbers();
    }
    public void arrayListOfNumbers()
    {
        ArrayList<Integer> listOfNum = new ArrayList<Integer>();
        for(int i=200; i<=500;i++)
        {
            listOfNum.add(i);
        }
        System.out.println(listOfNum);
    }
    public static void hashSetOfNumbers()
    {
        HashSet<Integer> listOfNum = new HashSet<Integer>();
        for(int i=200; i<=500;i++)
        {
            listOfNum.add(i);
        }
        System.out.println(listOfNum);
    }
    public void treeSetOfNumbers()
    {
        TreeSet<Integer> listOfNum = new TreeSet<Integer>();
        for(int i=200; i<=500;i++)
        {
            listOfNum.add(i);
        }
        System.out.println(listOfNum);
    }

}
