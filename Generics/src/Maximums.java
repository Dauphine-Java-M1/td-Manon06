public class Maximums {

    public static <T extends Comparable<T>> T myMax(T first, T... objets) {
        T max = first;
        for(T i : objets) {
            if(i.compareTo(max) > 0) { // si une valeur i plus grande que max
                max = i;
            }
        }
        return max;
    }

    public static void main( String[] args ) {
        System.out.println(myMax(42,1664)); //1664
        System.out.println(myMax(2014,86,13)); // on compare l'objet 2014 à la liste 86,13
        System.out.println(myMax(8.6, 16.64)); //on compare l'objet 8,6 à la liste 16,64
       //  System.out.println(myMax(8.6, "aba")); // ko !
    }

}