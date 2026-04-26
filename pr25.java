class TablePrinter {
    public synchronized void printTable(int n) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(n + " x " + i + " = " + (n * i));
            try {
                Thread.sleep(400); 
            } catch (InterruptedException e) {
                System.out.println("Thread interrupted");
            }
        }
        System.out.println(); 
    }
}
class ThreadOne extends Thread {
    TablePrinter obj;
    public ThreadOne(TablePrinter obj) {
        this.obj = obj;
    }
    public void run() {
        obj.printTable(5);
    }
}
class ThreadTwo extends Thread {
    TablePrinter obj;
    public ThreadTwo(TablePrinter obj) {
        this.obj = obj;
    }
    public void run() {
        obj.printTable(7);
    }
}
public class pr25{
    public static void main(String[] args) {
        TablePrinter obj = new TablePrinter();

        ThreadOne t1 = new ThreadOne(obj);
        ThreadTwo t2 = new ThreadTwo(obj);

        t1.start();
        t2.start();
    }
}
