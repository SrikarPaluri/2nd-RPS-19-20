import java.util.*;
/**
 * Example1 Player will first play rock, then all scissors
 */
public class Example implements Player

{
    private static String name = "Example";
    private static String strategy = "Rock then all scissors";
    //Pattabhi
    private int numberOfRstobeSent =0;
    private int curentNumberOfRs = 0;

    public String move(String [] myMoves, String [] opponentMoves, int myScore, int opponentScore, int rounds)
    {
        if(rounds == 1)
            return "r";
        //else
        // return "s";
        else if  ( rounds == 2 ){
            curentNumberOfRs=2;
            numberOfRstobeSent =2;
            return "p";
        }
        else if ( curentNumberOfRs > 0 ){
            curentNumberOfRs--;
            return "r";
        }
        else {
          numberOfRstobeSent++;
          curentNumberOfRs = numberOfRstobeSent;
          return "p";
        }
    }

    public String getName()
    {
        return name;
    }
}
