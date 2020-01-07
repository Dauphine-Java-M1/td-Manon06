


public class ThreadTest {


    private static int i=0;
    private static final Object monitor = new Object();

    public static Runnable method(final int id) {
        return new Runnable() {
            @Override
            public void run() {
                while (i < 10000) {
                    synchronized (monitor) {
                        i++;
                        if (i <= 10000) {
                            System.out.print(" Je suis le thread numéro " + id + " de l'itération " + i);
                            System.out.print("\n");
                        }
                    }
                }
            }
        };
    }



    public static void main(String[] args) {
        Thread t1 =  new Thread(method(1));
        Thread t2 =  new Thread(method(2));

        t1.start();
        t2.start();
    }


}


