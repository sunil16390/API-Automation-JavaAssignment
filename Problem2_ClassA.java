/*
From Class_A, call/print an integer variable which is present is Class B.
Where use constructor to reset the value of the variable from Class_A to Class B.
 */
package Problem2;

public class ClassA{
    static int playing_players;

    public static void main(String[] args)
    {
        System.out.println("Value of playing_players before ClassB object creation: " +playing_players);

        ClassB classB_obj = new ClassB();
        //print an integer variable which is present is Class B
        System.out.println("Value of all_players in ClassB: " +classB_obj.all_players);

        //the value of the variable from Class_A to Class B is reset
        System.out.println("Value of playing_players after ClassB object creation: " +playing_players);
    }

}
