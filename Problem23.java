/*
    Write a program to Catch any exception in java. Use try catch and finally statements
 */
package Problem23;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class TryCatchFinally
{
    public static void main(String[] args)
    {
        TryCatchFinally tcf = new TryCatchFinally();

        String email = tcf.read_Properties_file("EmailId");
        System.out.println("The Value is: "+email);

        String userId = tcf.read_Properties_file("UserId");
        System.out.println("The Value is: "+userId);

        String password = tcf.read_Properties_file("encryptedPassword");
        System.out.println("The Value is: "+password);
    }
    public String read_Properties_file(String key)
    {
        Properties prop = new Properties();
        String value = null;
        try {
            //wrong file name is provided, when correction "No Exception" will be printed
            prop.load(new FileInputStream(System.getProperty("user.dir") + "/wrong_global.properties"));
            value = prop.getProperty(key);
            System.out.println("No Exception");

        }catch(IOException e)
        {
            System.out.println("File not found");

        }
        finally
        {
            System.out.println("You are reading global.properties file for the value of "+key);
        }
        return value;
    }

}
