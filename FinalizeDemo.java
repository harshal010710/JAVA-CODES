class FinalizeDemo
{
    public static void main(String Arg[])
    {
        Employee eobj =  new Employee("Amit", 78000, 28, "Karve Road Pune");
        eobj.Display();
        eobj = null;
        System.gc();
    }    
}

class Employee
{
    public String Name;
    public int Salary;
    public int Age;
    public String Address;

    Employee(String str, int ammount, int A, String addr)
    {
        this.Name = str;
        this.Salary = ammount;
        this.Age = A;
        this.Address = addr;
    }

    protected void finalize()
    {
        System.out.println("Inside finalize method....");
    }

    void Display()
    {
        System.out.println("Employee name : "+this.Name);
        System.out.println("Employee Age : "+this.Age);
        System.out.println("Employee Salary : "+this.Salary);
        System.out.println("Employee Address : "+this.Address);
    }
}
