class Multi3 
{
    public static void main(String[] args) 
    {
        System.out.println("Current thread is : "+Thread.currentThread().getName());

        Demo8 obj1 = new Demo8(); //new state
        Demo8 obj2 = new Demo8(); //new state

        obj1.setName("First_Thread");
        obj2.setName("Second_Thread");

        obj1.start();   //Runnable State
        obj2.start();   //Runnable State

    }    
}
class Demo8 extends Thread 
{
    public void run()
    {
        String name = Thread.currentThread().getName();
        System.out.println("Current Thread is : "+name);

        for(int i = 1; i < 1000 ; i++)
        {
            System.out.println("Name of Thread "+ name + " with counter "+ i );
        }
    }  
}
