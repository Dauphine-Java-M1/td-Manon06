import java.util.AbstractList;
import java.util.Iterator;

public class Panel {

    private int upperBound;
    private int lowerBound;


    // Question 1 Exercice 1

    public static Iterator<Integer>panel1(final int i,final int j) {

        return new Iterator<Integer>() {

            private int current=i;

            public boolean hasNext() {
                return current<=j;
            }

            public Integer next() {
                return current++;
            }
        };
    }

    public static void main(String[] args){
    Iterator<Integer> it=panel1(1,5);
    for(;it.hasNext();)
    System.out.println(it.next());
    }




}
