package thread;

public class ReversSimon extends Thread{

   static int num;

    public ReversSimon(int num) {
        this.num = num;
    }

    public void run() {

        String message = "Hello from thread "+ num +"==" + currentThread().getId();
        System.out.println(message);
    }


    public static void main(String[] args) throws InterruptedException {

        for ( int i = 50; i>0; i--){
            num = i;
            Thread thread = new Thread(new ReversSimon(num));
           /* ReversSimon reverseWorkerThread = new ReversSimon();
            reverseWorkerThread.setName(String.valueOf(i));
            reverseWorkerThread.start();
            reverseWorkerThread.join();*/
            thread.setName(String.valueOf(i));
            thread.start();
            thread.join();


        }
    }
}
