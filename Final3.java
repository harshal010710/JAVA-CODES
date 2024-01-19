class Final3
{
    public static void main(String Arg[])
    {
        Demo dobj = new Demo();
        
    }
}

final class Demo
{
    public int A;
    public int B;

    public void fun(){}

    public final void gun(){}

}

class Hello extends Demo
{
    public void fun(){}

    public final void gun(){}   //error
}