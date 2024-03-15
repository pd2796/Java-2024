public class ThreadDeadLock {

    public static void main(String[] args) throws InterruptedException {

        Object oj1 = new Object();
        Object oj2 = new Object();
        Object oj3 = new Object();

        Thread t1 = new Thread(new Synch(oj1,oj2),"t1");
        Thread t2 = new Thread(new Synch(oj2,oj3),"t2");
        Thread t3 = new Thread(new Synch(oj3,oj1),"t3");
        
        t1.start();
        Thread.sleep(5000);
        t2.start();
        Thread.sleep(5000);
        t3.start();
        
    }
    
    
}

/**
 * InnerThreadDeadLock
 */
class Synch implements Runnable {

    private Object oj1;
    private Object oj2;

    public Synch(Object oj1,Object oj2)
    {
        this.oj1 = oj1;
        this.oj2 = oj2;

    }

    @Override
    public void run(){
        String name = Thread.currentThread().getName();
        System.out.println(name +"acuired lock: "+oj1);
        synchronized(oj1)
        {
            System.out.println(name +"acuired lock: "+oj1);
            work();
            System.out.println(name +"acuired lock: "+oj2);
            synchronized(oj2)
            {
                System.out.println(name +"acuired lock: "+oj2);
                work();
            }
            System.out.println(name +"acuired lock: "+oj2);
        }
        System.out.println(name +"acuired lock: "+oj1);
        System.out.println("finished");
        
    }

    private void work(){
        try{
            Thread.sleep(30000);
        }
        catch(InterruptedException e)
        {
            e.printStackTrace();
        }
    }
}
