/*
From Class_A, call/print an integer variable which is present is Class B.
Where use constructor to reset the value of the variable from Class_A to Class B.
 */
package Problem2;
public class ClassB
{
    int all_players = 15;
    int required_players = 11;

    //constructor to reset the value of the variable from Class_A to Class B
    public ClassB()
    {
        ClassA classA_Obj = new ClassA();
        classA_Obj.playing_players = required_players;
    }

}
