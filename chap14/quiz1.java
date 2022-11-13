class Worker extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
            }
        }
    }
}

public class quiz1 {
    public static void main(String[] args) {
        int alphabet = 'a';

        Thread t = new Worker();
        t.start();

        for (int i = 0; i < 26; i++) {
            System.out.print((char)alphabet + " " );
            alphabet++;
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
            }
        }


    }
}
