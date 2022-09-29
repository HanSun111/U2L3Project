public class Game {
    private int players;
    private int score;
    private boolean gameOver;

    public Game()
    {
        players = 1;
        score = 0;
        gameOver = false;
    }

    public int getPlayers()
    {
        return players;
    }

    /** Add the getScore() "getter" method here */
    /* to be completed in part (a) */
    public int getScore() {
        return score;
    }
    /** Add the addPlayer() method here */
    /* to be completed in part (b) */
    public int addPlayer(int numOfPlayerAdded){
        players = players + numOfPlayerAdded;
        return players;

    }

    /** Add the increaseScore(int increase) method here */
    /* to be completed in part (c) */
    public int increaseScore(int addedScore){
        score = addedScore;
        return score + addedScore;
    }

    /** Add the averageScorePerPlayer() method here */
    /* to be completed in part (d) */
    public double averageScorePerPlayer(){
        return (double) score / players;
    }

    public void end()
    {
        gameOver = true;
    }

}
