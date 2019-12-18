import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Exercice3 {

    public static List<Integer> listLength(List <? extends CharSequence> list)
    {
        ArrayList<Integer> length=new ArrayList<Integer>();

        for(int i=0;i<list.size();i++)
        {
        CharSequence seq=(CharSequence)list.get(i);
        length.add(seq.length());
        }

        return length;
    }
    public static void main(String[] args)
    {
        List<String> l= Arrays.asList("colonel", "reyel"); // On précise que c'est un string ==> va ensuite le préciser au joker pour voir si on a le droit de l'implémenter
        System.out.println(listLength(l));
    }
}
