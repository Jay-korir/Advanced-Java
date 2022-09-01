package thread;

public class ReverseHello extends  Thread{
    private int idThread;

    public ReverseHello(int idThread) {
        this.idThread = idThread;
    }


    @Override
    public void run() {
        if (idThread<=50){
             Thread thread = new Thread(new ReverseHello(idThread+1));
             thread.setName("Thread  " + idThread);
             thread.start();
             try {
                 thread.join();
             } catch (InterruptedException e) {
                 throw new RuntimeException(e);
             }
            // System.out.println("hello from "+ "# " + Thread.currentThread().getName());
         }
         if (idThread>1){
             System.out.println("hello from "+ "# " + Thread.currentThread().getName());
        }

    }

    public static void main(String[] args) {
        Thread t1 = new Thread(new ReverseHello(0));
        t1.start();

    }
}
