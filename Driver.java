import java.util.*;
/**
 * Driver class, sets up game
 * 
 * To test your code, add a line like players.add(new ________)
 * of your class
 */
public class Driver
{
    public static void main(String [] args)
    {
        Player [] players = new Player[2];
        boolean printsRun = false;
        //add players to game
        players[0] = new Example();
        players[1] = new PlayerExample();
   
        while(true)
            {
        Game newGame = new Game(players, printsRun);
        newGame.play();
        newGame.displayScore();
    }
        
        //players.add(new Sos());
        
        //SosGame finalGame = new SosGame(players, true);
        //finalGame.play();
    }
}