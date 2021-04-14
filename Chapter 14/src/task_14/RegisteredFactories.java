package task_14;

import java.util.*;
import typeinfo.factory.*;

class Part {
    @Override public String toString() {
        return getClass().getSimpleName();
    }
    static List<Class<? extends Part>> partClasses = new ArrayList<Class<? extends Part>>();
    static {
        partClasses.add(FuelFilter.class);
        partClasses.add(AirFilter.class);
        partClasses.add(CabinAirFilter.class);
        partClasses.add(OilFilter.class);
        partClasses.add(FanBelt.class);
        partClasses.add(PowerSteeringBelt.class);
        partClasses.add(GeneratorBelt.class);
    }
    private static Random rand = new Random(47);
    public static Part createRandom() {
        int n = rand.nextInt(partClasses.size());
        try {
            return partClasses.get(n).newInstance();
        } catch(InstantiationException e) {
            throw new RuntimeException(e);
        } catch(IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    }
}

class Filter extends Part {}

class FuelFilter extends Filter {
    public static class Factory implements typeinfo.factory.Factory<FuelFilter> {
        @Override public FuelFilter create() { return new FuelFilter(); }
    }
}

class AirFilter extends Filter {
    public static class Factory implements typeinfo.factory.Factory<AirFilter> {
        @Override public AirFilter create() { return new AirFilter(); }
    }
}

class CabinAirFilter extends Filter {
    public static class Factory implements typeinfo.factory.Factory<CabinAirFilter> {
        @Override public CabinAirFilter create() { return new CabinAirFilter(); }
    }
}

class OilFilter extends Filter {
    public static class Factory implements typeinfo.factory.Factory<OilFilter> {
        @Override public OilFilter create() { return new OilFilter(); }
    }
}

class Belt extends Part {}

class FanBelt extends Belt {
    public static class Factory implements typeinfo.factory.Factory<FanBelt> {
    @Override public FanBelt create() { return new FanBelt(); }
    }
}

class GeneratorBelt extends Belt {
    public static class Factory implements typeinfo.factory.Factory<GeneratorBelt> {
        @Override public GeneratorBelt create() { return new GeneratorBelt(); }
    }
}

class PowerSteeringBelt extends Belt {
    public static class Factory implements typeinfo.factory.Factory<PowerSteeringBelt> {
        @Override public PowerSteeringBelt create() { return new PowerSteeringBelt(); }
    }
}

public class RegisteredFactories {
    public static void main(String[] args) {
        for(int i = 0; i < 10; i++)
            System.out.println(Part.createRandom());
    }
}
