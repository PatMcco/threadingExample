public class ThreadUsingExtend extends Thread {
    public void run() {
        System.out.println("Thread using extend is running...");
        getRandom();
    }

    public void getRandom() {
        int randInt = RandomNumGenerator.generateRandomNum(1, 1000);
        double randDouble = RandomNumGenerator.generateRandomNum(1.0, 1000.0);
        float randFloat = RandomNumGenerator.generateRandomNum(1.0f, 1000.0f);
        System.out.println(randInt + " is the random integer");
        System.out.println(randDouble + " is the random double");
        System.out.println(randFloat + " is the random float");
    }
}
