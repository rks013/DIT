class TestMultiThreading extends Thread{
    public void run() {
        for(int i = 0; i<50;i++){
            System.out.println("in another thread");
        }
    }
}
class thread {
    public static void main(String[] args) throws InterruptedException {
        TestMultiThreading t = new TestMultiThreading();
        t.start();
        for(int i = 0; i<50;i++){
            System.out.println("in Main thread");
            Thread.sleep(1);
        }
        
    }   
}
