package task_3;

class Amphibian {}
class Vehicle {}

public class TupleTest {
    static TwoTuple<String, Integer> f() {
        return new TwoTuple<String, Integer>
                ("hi", 47);
    }
    static ThreeTuple<Amphibian, String, Integer> g() {
        return new ThreeTuple<Amphibian, String, Integer>
                (new Amphibian(), "hi", 47);
    }
    static FourTuple<Vehicle, Amphibian, String, Integer> h() {
        return new FourTuple<Vehicle, Amphibian, String, Integer>
                (new Vehicle(), new Amphibian(), "hi", 47);
    }
    static FiveTuple<Vehicle, Amphibian, String, Integer, Double> j() {
        return new FiveTuple<Vehicle, Amphibian, String, Integer, Double>
                (new Vehicle(), new Amphibian(), "hi", 47, 11.1);
    }
    static SixTuple<Vehicle, Amphibian, String, Integer, Double, Boolean> k() {
        return new SixTuple<Vehicle, Amphibian, String, Integer, Double, Boolean>
                (new Vehicle(), new Amphibian(), "hi", 47, 11.1, true);
    }

    public static void main(String[] args) {
        TwoTuple<String, Integer> ttsi = f();
        System.out.println(ttsi);
        System.out.println(g());
        System.out.println(h());
        System.out.println(j());
        System.out.println(k());
    }
}
