package task_6;

class Game {
    Game(int i) {
        System.out.println("Конструктор Game");
    }
}

class BoardGame extends Game {
    BoardGame(int i) {
        super(i);
        System.out.println("Конструктор BoardGame");
        // !!! super(i);
    }
}


public class Chess extends BoardGame {
    Chess() {
        super(11);
        System.out.println("Конструктор Chess");
    }

    public static void main(String[] args) {
        Chess x = new Chess();
    }
}
