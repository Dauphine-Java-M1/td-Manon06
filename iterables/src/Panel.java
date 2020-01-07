import java.util.AbstractList;
import java.util.Iterator;

public class Panel extends AbstractList<Integer> {  // intervalle de nombres entiers

    private int upperBound;
    private int lowerBound;


    public Panel(final int lb, final int ub) {     // Construction du panel
        this.lowerBound = lb;
        this.upperBound = ub;
    }

    public static Iterator<Integer> panel(final int lb, final int ub) {
        return new Iterator<Integer>() {

            private int curr = lb;

            @Override
            public boolean hasNext() {
                return (curr <= ub);
            }

            @Override
            public Integer next() {

                if (this.hasNext()){
                    return (curr++);
                }
            return null;
        }
    };

}


    public static void main(String[] args){

            // Question 1

        System.out.println("ça marche 1");
        Iterator<Integer> it=panel(1,5);
        for(;it.hasNext(); System.out.println(it.next())); // affiche 1 2 3 4 5
        System.out.println("ça marche 2");


    }




    @Override
    public Integer get(int index) {
        return null;
    }

    @Override
    public int size() {
        return 0;
    }



}