package task_19;

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
    public Object roll() {
        switch (rand.nextInt(BOUND)) {
            default:
            case 0: return "Eagle";
            case 1: return "Tails";
        }
    }
}
class CoinGameFactory implements GameFactory {
    public Game getGame() { return new CoinGame(); }
}

class DiceGame implements Game {
    private Random rand = new Random();
    private final byte BOUND = 6;
    public Object roll() {
        return rand.nextInt(BOUND) + 1;
    }
}
class DiceGameFactory implements GameFactory {
    public Game getGame() { return new DiceGame(); }
}

public class CoinDice {
    public static Object roll(GameFactory gf) {
        return gf.getGame().roll();
    }
    public static void main(String[] args) {
        System.out.println(roll(new CoinGameFactory()));
        System.out.println(roll(new DiceGameFactory()));
    }
}
