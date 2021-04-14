package task_18;

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
class GovnoException extends Exception {
    @Override public String toString() {
        return "Говно-исключение";
    }
}

public class LostMessage {
    void f() throws VeryImpotantException {
        throw new VeryImpotantException();
    }
    void dispose() throws NoHumException {
        throw new NoHumException();
    }
    void govno() throws GovnoException {
        throw new GovnoException();
    }

    public static void main(String[] args) {
        try {
            LostMessage lm = new LostMessage();
            try {
                try {
                    lm.f();
                } finally {
                    lm.dispose();
                }
            } finally {
                lm.govno();
            }
        } catch(Exception e) {
            System.out.println(e);
        }
    }
}
