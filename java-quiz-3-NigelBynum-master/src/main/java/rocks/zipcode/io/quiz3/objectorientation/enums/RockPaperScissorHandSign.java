package rocks.zipcode.io.quiz3.objectorientation.enums;

import java.nio.file.ClosedWatchServiceException;

/**
 * @author leon on 09/12/2018.
 */
public enum RockPaperScissorHandSign {

    SCISSOR("ROCK", "PAPER"),
    ROCK("PAPER", "SCISSOR"),
    PAPER("SCISSOR", "ROCK");

    private  String loser;
    private String winner;


    RockPaperScissorHandSign(String winner, String loser){
        this.winner =  winner;
        this.loser = loser;
    }
    public RockPaperScissorHandSign getWinner() { return valueOf(winner);}

    public RockPaperScissorHandSign getLoser() {
        return valueOf(loser);
    }
}
