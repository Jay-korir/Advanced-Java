package thread;

class PrintThread extends Thread{
    private int  startIndex;
    private int endIndex;

    public PrintThread(int startIndex, int endIndex) {
        this.startIndex = startIndex;
        this.endIndex = endIndex;
    }

    @Override
    public void run() {
        Long startTime = System.currentTimeMillis();
         int m =0;
         for (int i = startIndex; i<endIndex; i++){
            // System.out.println("i am " + i + "from threadId"+ Thread.currentThread().getName()+"//"+ Thread.currentThread().getId());
        m += i;
         }
         long endTime = System.currentTimeMillis();
         Long totalTime = (endTime-startTime);
        System.out.println(" total time for thread id "+Thread.currentThread().getName()+"//"+ Thread.currentThread().getId() + "="  + totalTime);
    }
}
public class ThreadJava {
    public static void main(String[] args) {

        int[] numbers =new int[20000000];
        int m = 0;
        PrintThread p3 = new PrintThread(0,20000000);
        p3.start();
        PrintThread p1 = new PrintThread(0,9999999);
        p1.start();
        PrintThread p2 = new PrintThread(10000000,19999999);
        p2.start();

        Long startTime = System.currentTimeMillis();

        for (int i = 0; i<numbers.length; i++){
           // System.out.println("i am " + i + "="+ "from threadId"+ Thread.currentThread().getName()+"//"+ Thread.currentThread().getId());
            m  += i;
        }
        long endTime = System.currentTimeMillis();
        Long totalTime = (endTime-startTime);
        System.out.println(" total time for thread id "+Thread.currentThread().getName()+"//"+ Thread.currentThread().getId() + "="  + totalTime);

    }
}
