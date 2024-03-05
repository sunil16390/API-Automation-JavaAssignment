/*
Write a java program which will throw an exception error for an AGE field
if we pass age below 25 and above 55.

 */
package Problem3;

public class NewDrivingLicence
{
    String name;
    int age = 23;

    public static void main(String[] args)
    {
        NewDrivingLicence NewDL = new NewDrivingLicence();
        verifyAge(NewDL.age);
    }
    public static void verifyAge(int age)
    {
        if(age < 25 || age > 55 )
        {
            throw new RuntimeException("Provided age is not in age limit");
        }
        else System.out.println("Age is in the age limit");
    }
}
