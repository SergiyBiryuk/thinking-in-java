package task_2;

import java.util.List;
import java.util.ArrayList;

public class InfiniteRecursion {
    @Override public String toString() {
        return "InfiniteRecursion address: " + super.toString();
    }
    public static void main(String[] args) {
        List<InfiniteRecursion> v = new ArrayList<InfiniteRecursion>();
        for(int i = 0; i < 10; i++)
            v.add(new InfiniteRecursion());
        System.out.println(v);
    }
}
