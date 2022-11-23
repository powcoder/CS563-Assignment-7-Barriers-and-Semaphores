https://powcoder.com
代写代考加微信 powcoder
Assignment Project Exam Help
Add WeChat powcoder
/*
* Concurrent Programming Assignment 7
* General Semaphore
*/

public class Semaphore {

    private int s = 0;

    public Semaphore(int s0) {
    if (s0 >= 0)
        s = s0;
    else
        throw new Error("Semaphore initialized to negative value: " + s0);
    }

    public synchronized void P()
    throws InterruptedException {
    while (s == 0) wait();
    s--;
    }

    public synchronized void V() {
    s++;
    notify();
    }

    public String toString() { // Give semaphore value (for debugging only)
        return ""+s;
    }
    
}