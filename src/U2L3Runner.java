public class U2L3Runner {
    public static void main(String[] args) {
        Game fun = new Game();

        fun.addPlayer(3);
        fun.increaseScore(80000001);

        System.out.println("Players: " + fun.getPlayers());
        System.out.println("Score: " + fun.getScore());
        System.out.println("Avg score per player: " + fun.averageScorePerPlayer());
    }
}