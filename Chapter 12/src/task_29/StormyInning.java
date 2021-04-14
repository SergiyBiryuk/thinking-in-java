package task_29;

class BaseballException extends RuntimeException {}
class Foul extends BaseballException {}
class Strike extends BaseballException {}

abstract class Inning {
    public Inning() { throw new BaseballException(); }
    public void event() { throw new BaseballException(); }
    public abstract void atBat();
    public void walk() {}
}

class StormException extends RuntimeException {}
class RainedOut extends StormException {}
class PopFoul extends Foul {}

interface Storm {
    void event();
    void rainHard();
}

public class StormyInning extends Inning implements Storm {
    public StormyInning() { throw new RainedOut(); }
    public StormyInning(String s) { throw new Foul(); }
    public void walk() { throw new PopFoul(); }
    public void rainHard() { throw new RainedOut(); }
    public void event() {}
    public void atBat() { throw new PopFoul(); }
    public static void main(String[] args) {
            StormyInning si = new StormyInning();
            si.atBat();
            Inning i = new StormyInning();
            i.atBat();
    }
}
