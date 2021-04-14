package task_21;

class Basic {
    public Basic(int i) throws Exception {
        throw new Exception();
    }
}
class Inherited extends Basic {
    public Inherited(int i) throws Exception {
        super(i);
//        Can't catch Exception! super must be first statement is constructor
//        try {
//            super(i);
//        } catch(Exception e) {}
    }
}

public class InhBaseException {
    public static void main(String[] args) {
        try {
            Inherited o = new Inherited(0);
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}
