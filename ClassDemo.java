class ClassDemo
{
    public static void main(String Arg[])
    {
        System.out.println("Inside Main");

        Marvellous mobj1 = new Marvellous();
        Marvellous mobj2 = new Marvellous(12, 34);

        System.out.println(mobj2.i);
        System.out.println(mobj2.j);
    }
}

class Marvellous
{
    public int i;
    public int j;

    public Marvellous()
    {
        System.out.println("inside Default constructor");

        this.i = 0;
        this.j = 0;
    }

    public Marvellous(int a, int b)
    {
        System.out.println("Inside Parameterised constructor");


    }

    public void Fun()
    {
        System.out.println("Inside Fun Method");
    }

}

