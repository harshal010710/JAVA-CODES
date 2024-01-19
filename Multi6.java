class Multi6
{
    public static void main(String[] args) 
    {
        System.out.println("Current thread is : "+Thread.currentThread().getName());

        Demo8 obj1 = new Demo8(); //new state
        Demo8 obj2 = new Demo8(); //new state

        obj1.start();   //Runnable State
        obj2.start();   //Runnable State

        System.out.println("Priority of obj1 is : "+obj1.getPriority());
        System.out.println("Priority of obj2 is : "+obj2.getPriority());

    }    
}
class Demo8 extends Thread 
{
    public void run()
    {
        String name = Thread.currentThread().getName();
        System.out.println("Current Thread is : "+name);
    }  
}
