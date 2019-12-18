import java.util.Arrays;
import java.util.List;

public class BeWild {

    private static void print(List<?> list) // utilisation du joker (?)
    {
        for(Object o:list){
        System.out.println(o);}
    }

    public static void main(String[] args)
    {
        List<String> list= Arrays.asList("foo", "toto"); //Le string va remplacer le joker
        print(list); // est ce que print accepte les strings ? oui car une liste d'objects  de types non spécifiés
        // avec string, non car pas d'héritage entre liste de string et liste d'objets. ==> il faut alors utiliser le jocker.
    }
    // pas d'héritages entre les types paramétrés. On ne peut pas
   // utiliser print sur une liste de string alors qu'il est défini sur une liste d'objet.


    public static void printLongueur(List<? extends CharSequence> list) {

        for (CharSequence o : list) {
            System.out.println(o.length());
        }
    }
}
