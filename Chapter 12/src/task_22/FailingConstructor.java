package task_22;

class ConstructorException extends Exception {}

public class FailingConstructor {
    public FailingConstructor() throws ConstructorException {
        throw new ConstructorException();
    }

    public static void main(String[] args) {
        try {
            FailingConstructor o = new FailingConstructor();
            // do something
        } catch(ConstructorException e) {
            e.printStackTrace();
        }
    }
}
