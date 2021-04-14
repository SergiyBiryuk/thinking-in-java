package task_19;

class First {
    public First() { System.out.println("First.First()"); }
    public class Second {
        public Second() { System.out.println("Second.Second()"); }
        public class Third {
            public Third() { System.out.println("Third.Third()"); }
        }
    }
}

class SFirst {
    public SFirst() { System.out.println("SFirst.SFirst()"); }
    public static class SSecond {
        public SSecond() { System.out.println("SSecond.SSecond()"); }
        public static class SThird {
            public SThird() { System.out.println("SThird.SThird()"); }
        }
    }
}

public class Main {
    public static void main(String[] args) {

        First f = new First();
        First.Second s = f.new Second();
        First.Second.Third t = s.new Third();

        SFirst sf = new SFirst();
        SFirst.SSecond ss = new SFirst.SSecond();
        SFirst.SSecond.SThird st = new SFirst.SSecond.SThird();
    }
}
