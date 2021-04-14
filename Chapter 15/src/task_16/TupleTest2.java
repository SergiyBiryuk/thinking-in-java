package task_16;

import task_3.*;
import static task_16.Tuple.*;

class Amphibian {}
class Vehicle {}

public class TupleTest2 {
    static TwoTuple<String, Integer> f() {
        return tuple("hi", 47);
    }
    static TwoTuple f2() {
        return tuple("hi", 47);
    }
    static ThreeTuple<Amphibian, String, Integer> g() {
        return tuple(new Amphibian(), "hi", 47);
    }
    static FourTuple<Vehicle, Amphibian, String, Integer> h() {
        return tuple(new Vehicle(), new Amphibian(), "hi", 47);
    }
    static FiveTuple<Vehicle, Amphibian, String, Integer, Double> j() {
        return tuple(new Vehicle(), new Amphibian(), "hi", 47, 11.1);
    }
    static SixTuple<Vehicle, Amphibian, String, Integer, Double, Boolean> k() {
        return tuple(new Vehicle(), new Amphibian(), "hi", 47, 11.1, false);
    }

    public static void main(String[] args) {
        TwoTuple<String, Integer> ttsi = f();
        System.out.println(ttsi);
        System.out.println(f2());
        System.out.println(g());
        System.out.println(h());
        System.out.println(j());
        System.out.println(k());
    }
}
