package oops;

public class Multithreading {
    public static void main(String[] args) {
        System.out.println("Multithreading starts from here");

        A obj = new A();
        B obj2 = new B();
        
        // Set thread priorities
        obj.setPriority(Thread.MAX_PRIORITY); // Highest priority
        obj2.setPriority(Thread.MIN_PRIORITY); // Lowest priority
        
        try{
          obj.start();
          obj.interrupt();
          obj2.start();

        }
        catch(Exception e){}
    }
}

class A extends Thread {
    @Override
    public void run() {
        System.out.println("Checking threading A");
        for (int i = 1; i <= 10; i++) {
            System.out.println("Element number of A: " + i);
            try{
              Thread.sleep(8000);

            }
            catch(Exception e) {}
        }
    }

    A() {
        System.out.println("Child class constructor A");
    }
}

class B extends Thread {
    @Override
    public void run() {
        System.out.println("Checking threading B");
        for (int i = 1; i <= 10; i++) {
            System.out.println("Element number of B: " + i);
        }
    }

    B() {
        System.out.println("Child class constructor B");
    }
}
