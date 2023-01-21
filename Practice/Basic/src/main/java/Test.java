/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author habibun
 */
public class Test {
    public static void main(String[] args)
    {
        ThreadDemo td1 = new ThreadDemo("Thread-1");
        td1.start();
        
        ThreadDemo td2 = new ThreadDemo("Thread-2");
        td2.start();
    }
}

class ThreadDemo implements Runnable {
    private Thread thread;
    private String threadName;
    
    ThreadDemo(String name)
    {
        threadName = name;
        System.out.println("creating " + threadName);
    }
    
    public void run()
    {
        System.out.println("Running " + threadName);
        
        try{
            for(int i = 1; i < 5; i++) {
                System.out.println("Thread "+threadName + ", " + i);

                Thread.sleep(5);
            }
        } catch(InterruptedException e) {
          System.out.println("Thread " + threadName + "interrupted");
        }
        System.out.println("Existing " + threadName);        
    }
        
    public void start()
    {
        System.out.println("Starting " + threadName);
        
        if(thread == null) {
            thread = new Thread(this, threadName);
            thread.start();
        }
    }
}
