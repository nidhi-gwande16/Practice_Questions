class Foo {
    int flag=0;
    
    public Foo() {
        
    }

    synchronized public void first(Runnable printFirst) throws InterruptedException {
        
        // printFirst.run() outputs "first". Do not change or remove this line.
        printFirst.run();
        flag=flag+1;
        notifyAll();
    }

    synchronized public void second(Runnable printSecond) throws InterruptedException {
        
        // printSecond.run() outputs "second". Do not change or remove this line.
        
        while(flag<1)
        {
            wait();
        }
        printSecond.run();
        flag=flag+1;
        notifyAll();
    }

    synchronized public void third(Runnable printThird) throws InterruptedException {
        
        // printThird.run() outputs "third". Do not change or remove this line.
       
        while(flag<2)
        {
            wait();
        }
         printThird.run();
    }
}