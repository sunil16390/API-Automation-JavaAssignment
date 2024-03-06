/*
Write a program to - (Use appropriate String methods)

    1. Correct the spelling mistake from “Davi Beckham” to “David Beckham”
    2. Correct the number of goals scored by Lionel Messi from 400 to 579

 */
package Problem19;

public class AutoCorrection
{
    String player_name;
    String player_goals;

    public static void main(String[] args)
    {
        AutoCorrection player1 = new AutoCorrection();
        player1.player_name = "Davi Beckham";
        player1.player_goals = "";

        AutoCorrection player2 = new AutoCorrection();
        player2.player_name = "Lionel Messi";
        player2.player_goals = "400";

        System.out.println("Before: " +player1.player_name);
        player1.valueCorrection();
        System.out.println("After correction: "+player1.player_name);

        System.out.println("Before: " +player2.player_goals);
        player2.valueCorrection();
        System.out.println("After correction: "+player2.player_goals);

    }
    public void valueCorrection()
    {
        this.player_name = this.player_name.replace("Davi","David");
        this.player_goals = this.player_goals.replace("400", "579");
    }

}
