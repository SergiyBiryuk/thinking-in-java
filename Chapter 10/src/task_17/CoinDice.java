package task_17;

import java.util.Random;

interface Game {
    Object roll();
}

interface GameFactory {
    Game getGame();
}

class CoinGame implements Game {
    private Random rand = new Random();
    private final byte BOUND = 2;
    private CoinGame() {}
    public Object roll() {
        switch (rand.nextInt(BOUND)) {
            default:
            case 0: return "Eagle";
            case 1: return "Tails";
        }
    }
    public static GameFactory factory = new GameFactory() {
        @Override public Game getGame() { return new CoinGame(); }
    };
}

class DiceGame implements Game {
    private Random rand = new Random();
    private final byte BOUND = 6;
    private DiceGame() {}
    public Object roll() {
        return rand.nextInt(BOUND) + 1;
    }
    public static GameFactory factory = new GameFactory() {
        @Override public Game getGame() { return new DiceGame(); }
    };
}

public class CoinDice {
    public static Object roll(Game game) { return game.roll(); }
    public static void main(String[] args) {
        System.out.println(roll(CoinGame.factory.getGame()));
        System.out.println(roll(DiceGame.factory.getGame()));
    }
}
