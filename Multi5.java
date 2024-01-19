class Multi4
{
    public static void main(String[] args) throws Exception
    {
        System.out.println("Current thread is : "+Thread.currentThread().getName());

        Demo8 obj1 = new Demo8(); //new state

        /*obj1.setName("First_Thread");
        obj2.setName("Second_Thread");*/

        obj1.start();   //Runnable State
        obj1.join();
        //obj2.start();   //Runnable State

        System.out.println("End of main Thread");

    }    
}

class Demo8 extends Thread 
{
    public void run()
    {
        //System.out.println("Current Thread is : "+);
        for(int i = 1; i <= 10 ; i++)
        {          
            try 
            {
                System.out.println("value is : "+i);
                sleep(2000);
            } 
            catch (Exception e) 
            {
                
            }
        }

        
    }  
}

