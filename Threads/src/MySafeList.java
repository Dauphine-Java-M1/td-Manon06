import java.util.ArrayList;
import java.util.Objects;

public class MySafeList extends ArrayList<Double> {

    ArrayList<Double> list;
    //private Object monitor = new Object();
   // int count =0;



    public MySafeList() {
        list = new ArrayList<Double>();
    }

    public void add(Double e){
        list.add(e);
    }

    public int size(){
        return list.size();
    }

    public Double get(int i){
        return list.get(i);
    }



}
