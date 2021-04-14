import javax.lang.model.type.ArrayType;
import java.util.ArrayList;
import java.util.Collection;

public class qwe {

    public static void main(String[] args) {
        qwe r = new qwe();

        ArrayList<Integer> a = new ArrayList<Integer>();
        a.add(0);
        a.add(1);
        a.add(3);
        a.add(5);
        ArrayList<Integer> b = new ArrayList<Integer>();
        b.add(0);
        b.add(2);
        b.add(3);
        b.add(6);
        b.add(8);
        r.merge(a,b);
        System.out.println(a.toString());
        System.out.println(b.toString());

    }


    void merge(ArrayList<Integer> a, ArrayList<Integer> b) {

        for(int i = 0; i < a.size(); i++) {
            for(int j = 0; j < b.size(); j++) {
                int q = b.get(j);
                int s = a.size();
                while (q > a.get(i) && i + 1 < s)
                    i++;
                if(i + 1 == s)
                    i++;
                a.add(i, q);
            }
        }


    }
}
