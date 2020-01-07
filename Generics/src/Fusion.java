import java.util.*;

public class Fusion {


    public static void main(String[] args) {
        List<String> liste_1 = Arrays.asList("C", "rc");
        //
        System.out.print("Ca marche");
        //
        System.out.print(liste_1);


        List<StringBuilder> liste_2 = Arrays.asList(new StringBuilder("a ma"), new StringBuilder("he!"));

        //
        System.out.print(liste_2);


        List<? extends CharSequence> r1 = fusion(liste_1, liste_2);

        System.out.print(r1);

        List<?> r2 = fusion(liste_1, liste_2);
        List<Integer> l3 = Arrays.asList(1, 2);
        List<Integer> l4 = Arrays.asList(10, 20);
        List<Integer> r3 = fusion(l3, l4);
        List<?> r4 = fusion(liste_1, l3);
    }


    public static <T> List<T> fusion (List<? extends T> liste_1, List<? extends T> liste_2)
    {
         List<T> liste_fusion = new ArrayList<>();
        Iterator<? extends T> iterator_1 = liste_1.iterator();
        Iterator<? extends T> iterator_2 = liste_2.iterator();

        while(iterator_1.hasNext()){
            liste_fusion.add(iterator_1.next());
            liste_fusion.add(iterator_2.next());
        }
        return liste_fusion;
    }


}


