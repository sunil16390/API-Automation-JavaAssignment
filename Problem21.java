/*
Write a program to replace the - (Use appropriate String methods)

    1 Original name from “Liverpool” to “Liverpool Football Club”
    2 Original name from “City” to “Manchester City”
 */
package Problem21;

public class StringReplacement
{
    String team_name;

    public static void main(String[] args) {
        StringReplacement teamA = new StringReplacement();
        StringReplacement teamB = new StringReplacement();
        teamA.team_name = "Liverpool";
        teamB.team_name = "City";

        String new_name_A = "Liverpool Football Club";
        String new_name_B = "Manchester City";

        System.out.println("Old name of teamA is: " +teamA.team_name);
        teamA.replaceString(teamA.team_name,new_name_A); // calling my function to replace
        System.out.println("New name of teamA is: " +teamA.team_name);

        System.out.println("Old name of teamB is: "+teamB.team_name);
        teamB.replaceString(teamB.team_name,new_name_B); // calling my function to replace
        System.out.println("New name of teamB is: "+teamB.team_name);
    }
    public void replaceString(String old_value, String new_value)
    {
        this.team_name = old_value.replace(old_value,new_value);
    }
}
