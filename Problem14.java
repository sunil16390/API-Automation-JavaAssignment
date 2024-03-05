// Write a Java Program to Print Current Date and return it as a String.
package Problem14;

import java.util.Date;
import java.text.SimpleDateFormat;

public class CurrentDate
{
    public static void main(String[] args)
    {
        System.out.println("Current Date: "+currentDate());
    }
    public static String currentDate()
    {
        SimpleDateFormat ft = new SimpleDateFormat("dd-MM-yyyy");
        Date curr_date = new Date();
        //System.out.println(curr_date);
        String formatedDateInString = ft.format(curr_date);

        return formatedDateInString;
    }

}
