import java.util.*;

public class Mult {

    public static AbstractList<Integer> mult (final int x, final List<Integer> liste ){

        return new AbstractList<Integer>() {
            private Iterator<Integer> it = liste.iterator();


            @Override
            public int size() {
                return 0;
            }

            @Override
            public Integer get(int index) {
                return null;
            }
        };
    }


    //Méthode avec abstract sequential list

    public static List<Integer> mult1( final Integer entier, final List<Integer> list) {

        return new AbstractSequentialList<Integer>() {

            @Override
            public int size() {
                return 0;
            }

            @Override
            public ListIterator<Integer> listIterator(int index) {
                return null;
            }
        };
    }


    public static void main(String[] args){

        System.out.println("Ca marche");
        ArrayList<Integer> al = new ArrayList<>();

        for (int i = 0; i < 1000000; i++) {
            al.add(i);
        }

        long t0 = System.nanoTime();
        List<Integer> ret = Mult.mult(2, al);
        long sum=0;

        for(int val : ret) {
            sum+=val/2;
        }

        System.out.println((System.nanoTime() - t0));

        LinkedList<Integer> ll = new LinkedList<>();

        for (int i = 0; i < 1000000; i++) {
            ll.add(i);
        }

        t0 = System.nanoTime();
        sum=0;
        ret = Mult.mult(2, ll);

        for(int val : ret) {
            sum+=val/2;
        }

        System.out.println((System.nanoTime() - t0));
    }

}
