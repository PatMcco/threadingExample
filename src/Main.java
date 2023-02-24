public class Main {
    public static void main(String[] args) throws InterruptedException {
        ThreadUsingInterface interThread = new ThreadUsingInterface();
        ThreadUsingExtend exThread = new ThreadUsingExtend();
        Thread iFace = new Thread(interThread);

        exThread.start();
        exThread.join();
        if(exThread.isAlive()) {
            System.out.println("Thread is still alive");
        } else {
            System.out.println("Thread is dead");
        }
        iFace.start();
        Thread.sleep(1000);
        if(iFace.isAlive()) {
            System.out.println("Thread is still alive");
        } else {
            System.out.println("Thread is dead");
        }
    }
}