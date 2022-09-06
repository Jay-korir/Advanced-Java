package thread;


import java.util.Random;

class MaxThread extends Thread{
    private int startIndex;
    private int endIndex;
    private int[] num;
    private static int maxFromThreads;

    public MaxThread(int startIndex, int endIndex, int[] num) {
        this.startIndex = startIndex;
        this.endIndex = endIndex;
        this.num = num;
    }


    @Override
    public void run() {
        int maxThread = num[startIndex];

        Long startTime = System.currentTimeMillis();

        for (int i = startIndex; i<=endIndex; i++) {
            System.out.println(num[i]);
                if (num[i] > maxThread) {
                    maxThread = num[i];
                }

        }
        if (maxThread > maxFromThreads)
            maxFromThreads = maxThread;

        System.out.println("the maximum value from thread is :" + maxThread);
        System.out.println("maximum value from threads is: " + "=="+ maxFromThreads);
        long endTime = System.currentTimeMillis();
        Long totalTime = (endTime-startTime);
        System.out.println(" total time for thread id "+Thread.currentThread().getName()+"//"+ Thread.currentThread().getId() + "="  + totalTime);
    }


}
public class MaxValue {
    static int index = 16;
    public static void main(String[] args) throws InterruptedException {
        Long startTime = System.currentTimeMillis();
        int num[] = new int[index];
        int maxValue = num[0];
        for(int i =0; i<index;i++){
            num[i] = new Random().nextInt(100);
            System.out.println("from main" + "=="+ num[i]);
        }

        MaxThread m1 = new MaxThread(0,3,num);
        m1.start();
        m1.join();
        MaxThread m2 = new MaxThread(4,7,num);
        m2.start();
        m2.join();
        MaxThread m3 = new MaxThread(8,11,num);
        m3.start();
        m3.join();
        MaxThread m4 = new MaxThread(12,15,num);
        m4.start();
        m4.join();


                for (int j=0;j<index;j++){
                    if (num[j]>maxValue){
                        maxValue= num[j];}
                    else if (num[j]<maxValue){
                        maxValue = maxValue;

                    }
                }
        System.out.println("the maximum value from main  is :" + maxValue);

        long endTime = System.currentTimeMillis();
        Long totalTime = (endTime-startTime);
        System.out.println(" total time for thread id "+Thread.currentThread().getName()+"//"+ Thread.currentThread().getId() + "="  + totalTime);
    }

}
