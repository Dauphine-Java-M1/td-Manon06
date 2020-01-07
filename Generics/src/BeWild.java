import java.util.Arrays;
import java.util.List;

public class BeWild {

    private static void print(List<?> list) // utilisation du joker (?)
    {
        for(Object o:list){ System.out.println(o);}
    }

    public static void main(String[] args) {
        List<String> list = Arrays.asList("foo", "toto"); //Le string remplace le joker
        print(list);                // est ce que print accepte les strings ? oui car une liste d'objects  de types non spécifiés
                                 // avec string, non car pas d'héritage entre liste de string et liste d'objets. ==> il faut alors utiliser le jocker.
    }

    public static void printLongueur(List<? extends CharSequence> list) {

        for (CharSequence o : list) {
            System.out.println(o.length());
        }
    }
}
