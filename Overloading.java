class Overloading
{
    public static void main(String Arg[])
    {
        Arithmetic aobj = new Arithmetic();
        int iRet = 0;

        iRet = aobj.Addition(10, 20);

        System.out.println("Addition of method1 is : "+iRet);

        iRet = aobj.Addition(33);

        System.out.println("Addition of method1 is : "+iRet);

        float fRet = aobj.Addition(9.5f, 45.4f);

        System.out.println("Addition of method1 is : "+fRet);

        aobj.Addition(90, 88.78);

        aobj.Addition(65.88, 76);

        

    }
}

class Arithmetic
{
    public int Addition(int a, int b)
    {
        return a+b;
    }

    public float Addition(float a,float b)
    {
        return a+b;
    }

    public int Addition(int a)
    {
        return a+10;
    }

    public void Addition(int A, double b)
    {
        System.out.println("Inside First Addition");
    }

    public void Addition(double A, int b)
    {
        System.out.println("Inside Second Addition");
    }

}