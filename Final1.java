class Final1 
{
    public static void main(String Arg[])
    {
        Demo dobj = new Demo();
        dobj.A++;
        dobj.B++;
    }
}

class Demo
{
    public int A;
    public final int B = 21;

    Demo()
    {
        A = 11;
        B = 21;
    }

    Demo(int i, int j)
    {
        A = i;
        B = j;
    }
}