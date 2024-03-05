/*
String a = "Welcome To Java" , count the number of space present in
the sentence and print only "Welcome" using array.
 */
package Problem8;

public class CountSpace
{
    String a = "Welcome To Java";
    public static void main(String[] args) {
        CountSpace cs = new CountSpace();
        cs.countSpaceInSentence(cs.a);
    }
    public void countSpaceInSentence(String line)
    {
        //Count space in the sentence
        int line_length = line.length();
        int  without_space_line_length = (line.replace(" ","")).length();
        int count_of_space = line_length - without_space_line_length;
        System.out.println("The number of space present in the sentence: "+count_of_space);

        //Print first word of sentence
        String[] words = line.split(" ");
        System.out.println(words[0]);
    }
}
