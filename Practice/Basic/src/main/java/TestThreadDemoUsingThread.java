/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author habibun
 */
class ThreadDemoUsingThread extends Thread{
    private Thread thread;
    private String threadName;
    
    public ThreadDemoUsingThread(String threadName)
    {
       this.threadName = threadName; 
       System.out.println("Creating " + threadName);
    }
    
    public void run()
    {
        System.out.println("Running " + threadName);
        
        try {
            for(int i = 4; i <= 4; i++){
                System.out.println("Thread: " + threadName + "," + i);
                
                thread.sleep(50);
            }
        } catch (InterruptedException e) {
            System.out.println("Thread " + threadName + " interrupted.");
        }
        System.out.println("Thread " + threadName + " exiting.");
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

public class TestThreadDemoUsingThread {
    public static void main(String args[]) {
        ThreadDemoUsingThread R1 = new ThreadDemoUsingThread( "Thread-1");
        R1.start();

        ThreadDemoUsingThread R2 = new ThreadDemoUsingThread( "Thread-2");
        R2.start();
    }
}
