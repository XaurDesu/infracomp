public class EjThreads02 implements Runnable {
    private int n; 

    public EjThreads02 (int n) {
        System.out.println("Implementando Runnable");
        this.n = n;
    }
    public void run() {
        System.out.println("El valor inicial es: "+ n);
    }
    public static void main(String[] args) {
        Thread t = new Thread(new EjThreads02(5));

        t.start();
    }
}
