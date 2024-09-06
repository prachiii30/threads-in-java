class counter{
    int c=0;
    public synchronized void increment(){
        c++;
    }

}

class practice{
    public static void main(String[] args) throws InterruptedException {

        counter count=new counter();

        Runnable a=()->{
            for(int i=0;i<100000;i++){
                count.increment();
            }
        };

        Runnable b=()->{
            for(int i=0;i<100000;i++){
                count.increment();
            }
        };

        Thread t1=new Thread(a);
        Thread t2=new Thread(b);

        t1.start();
        t2.start();

        t1.join();
        t2.join();
        System.out.println(count.c);

        
    }
}