public class RaceConditionExample {
    public static void main(String[] args) {
        Race counter = new Race();
        Thread t1 = new Thread(counter, "Thread1");
        Thread t2 = new Thread(counter, "Thread2");
        Thread t3 = new Thread(counter, "Thread3");
        t1.start();
        t2.start();
        t3.start();
        try{
            t1.join();
            t2.join();
            t3.join();
        }catch (InterruptedException e){
            System.exit(1);
        }
    }
}