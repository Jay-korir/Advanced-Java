package thread;

public class ShareCounter extends  Thread{
    static int counter =0;

    public ShareCounter(int counter) {
        this.counter = counter;
    }

    @Override
    public void run() {
        ;
         for (int i = 0; i<10; i++){
             System.out.println("thread " + Thread.currentThread().getName() +"="+ i);

         }
        System.out.println("counter at this thread is "+ "=="+ counter);
         counter += 10;
    }

    public static void main(String[] args) throws InterruptedException {
        for (int k = 0; k<10; k++){
            ShareCounter shareCounter = new ShareCounter(counter);
            shareCounter.start();
            shareCounter.join();
        }
    }
}
