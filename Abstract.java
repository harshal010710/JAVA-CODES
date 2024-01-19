class Abstract
{
    public static void main(String argv[])
    {
        Hello hobj = new Hello();

        hobj.fun();
        hobj.Gun();
    }
}

abstract class Demo
{
    public int A;
    public int B;

    public Demo()
    {
        this.A = 0;
        this.B = 0;
        System.out.println("Inside Demo constructor");
    }

    abstract void fun(); // virtual void fun() = 0;

    void Gun()
    {
        System.out.println("Inside Gun");
    }
}

class Hello extends Demo
{
    public Hello()
    {
        System.out.println("Inside Hello constructor");
    }

    void fun()
    {
        System.out.println("Inside Hello fun");
    }
}