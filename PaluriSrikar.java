import java.util.*;
/**
 * Each player or team will create their own Player, this is only an example....
 * 
 * Your code MUST INCLUDE a move method with the following signature. To insure that, you must implement
 * the Player interface
 * 
 * You can create additional methods but must have the move method
 * 
 */
public class PaluriSrikar implements Player
{
    private static String name = "Srikar Paluri";
    private int numberOfRsPending =0; //number of Rs to be counted before sending s
    private int currentCountOfRs =0;//keep track of current number of Rs
    /**
     * An example of a method - replace this comment with your own
     * You must create some kind of logic of what to play against your opponent...start researching,
     * driver code to be provided MONDAY, 2/27
     * 
     * @return      the move you want to play against opponent
     *              "r" - rock
     *              "p" - paper
     *              "s" - scissors
     *              anything else - forfeit the turn
     */
    public String move(String [] myMoves, String [] opponentMoves, int myScore, int opponentScore, int round)
    {
       int  rand = (int)(Math.random() * 100) % 3;
       if ( rand == 1){
           numberOfRsPending =2;
           currentCountOfRs =2;
           return "s";
        }
        else if ( numberOfRsPending > 0 ) {
           numberOfRsPending--;
           return "p";
       } 
       else {
           currentCountOfRs++;
           numberOfRsPending = currentCountOfRs;
           return "s";
       }
    }
    /**
     * Returns the name of the player
     * 
     * @return      the name of the player              
     */
    public String getName()
    {
        return name;
    }
}
