package task_19;

class VeryImpotantException extends Exception {
    @Override public String toString() {
        return "Очень важное исключение!";
    }
}

class NoHumException extends Exception {
    @Override public String toString() {
        return "Второстепенное исключение";
    }
}

public class LostMessage {
    void f() throws VeryImpotantException {
        throw new VeryImpotantException();
    }
    void dispose() throws NoHumException {
        throw new NoHumException();
    }

    public static void main(String[] args) {
        try {
            LostMessage lm = new LostMessage();
            try {
                lm.f();
            } finally {
                try {
                    lm.dispose();
                } catch(Exception e) {
                    System.out.println(e);
                }
            }
        } catch(Exception e) {
            System.out.println(e);
        }
    }
}
