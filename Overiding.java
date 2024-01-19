class Overiding
{
    public static void main(String Arg[])
    {
        Base bobj = new Derived();

        bobj.Fun();
        bobj.Gun();
        bobj.Sun();
        bobj.Run();
        bobj.Mun();
    }
}

class Base
{
    public void Fun()
    {
        System.out.println("Inside Base fun");
    }

    public void Gun()
    {
        System.out.println("Inside Base Gun");
    }

    public void Sun()
    {
        System.out.println("Inside Base Sun");
    }

    public void Run()
    {
        System.out.println("Inside Base Run");
    }
}

class Derived extends Base
{

    public void Fun()
    {
        System.out.println("Inside Derived fun");
    }

    public void Sun()
    {
        System.out.println("Inside Derived Sun");
    }

    public void Run(int i)
    {
        System.out.println("Inside Derived Run");
    }

    public void Mun()
    {
        System.out.println("Inside Base Mun");
    }
}